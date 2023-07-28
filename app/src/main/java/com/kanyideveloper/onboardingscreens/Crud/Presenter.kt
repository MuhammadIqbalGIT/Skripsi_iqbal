package com.dinny.activitystaff

import android.util.Log
import com.kanyideveloper.onboardingscreens.Crud.CrudActivity
import com.kanyideveloper.onboardingscreens.Crud.NetworkConfig
import com.kanyideveloper.onboardingscreens.Crud.ResultStaff
import com.kanyideveloper.onboardingscreens.Crud.ResultStatus
import retrofit2.Call
import retrofit2.Response

class Presenter(val crudView: CrudActivity) {
    //fungsi get data
    fun getData() {
        NetworkConfig.getService().getData()
            .enqueue(object : retrofit2.Callback<ResultStaff> {
                override fun onFailure(call: Call<ResultStaff>, t: Throwable) {
                    crudView.onFailedGet(t.localizedMessage)
                    Log.d("Error", "Error Data")
                }

                override fun onResponse(call: Call<ResultStaff>, response: Response<ResultStaff>) {
                    if (response.isSuccessful) {
                        val status = response.body()?.status
                        if (status == 200) {
                            val data = response.body()?.staff
                            crudView.onSuccessGet(data)
                        } else {
                            crudView.onFailedGet("Error $status")
                        }
                    }
                }
            })
    }

    //hapus data
    fun hapusData(id: String?) {
        NetworkConfig.getService()
            .deleteStaff(id)
            .enqueue(object : retrofit2.Callback<ResultStatus> {
                override fun onFailure(call: Call<ResultStatus>, t: Throwable) {
                    crudView.onErrorDelete(t.localizedMessage)
                }

                override fun onResponse(call: Call<ResultStatus>, response: Response<ResultStatus>
                ) {
                    if (response.isSuccessful && response.body()?.status == 200) {
                        crudView.onSuccessDelete(response.body()?.pesan ?: "")
                    } else {
                        crudView.onErrorDelete(response.body()?.pesan ?: "")
                    }
                }
            })
    }
}