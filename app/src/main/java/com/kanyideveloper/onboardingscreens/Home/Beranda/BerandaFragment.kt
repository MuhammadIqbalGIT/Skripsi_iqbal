package com.kanyideveloper.onboardingscreens.Home.Beranda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kanyideveloper.onboardingscreens.ListRequest.Request
import com.kanyideveloper.onboardingscreens.ListRequest.RequestPickUpAdapter
import com.kanyideveloper.onboardingscreens.R


class BerandaFragment : Fragment() {


    private lateinit var adapter: RequestPickUpAdapter
    private lateinit var rvReq: RecyclerView
    private var pickupList = ArrayList<Request>()
    lateinit var imagePickup: Array<Int>
    lateinit var Pickup: Array<String>
    lateinit var Document: Array<String>
    lateinit var Clock: Array<String>
    lateinit var imageClock: Array<Int>




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)
        return view



    }






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        rvReq = view.findViewById(R.id.recyclerViewListRequest)
        rvReq.layoutManager = layoutManager
        rvReq.setHasFixedSize(true)
        adapter=RequestPickUpAdapter(pickupList)
        rvReq.adapter =adapter






    }






    private fun dataInitialize() {
        pickupList = arrayListOf<Request>()

        imagePickup = arrayOf(
            R.drawable.ic_not_pickup,
            R.drawable.ic_not_pickup,
            R.drawable.ic_done_pickup,
            R.drawable.ic_not_pickup,
            R.drawable.ic_not_pickup,
            R.drawable.ic_cancel_pick_up,
            R.drawable.ic_cancel_pick_up,
            R.drawable.ic_not_pickup,
            R.drawable.ic_done_pickup,
            R.drawable.ic_done_pickup

        )

        Pickup = arrayOf(
            getString(R.string.BelumDipickup),
            getString(R.string.BelumDipickup),
            getString(R.string.SudahDipickup),
            getString(R.string.BelumDipickup),
            getString(R.string.BelumDipickup),
            getString(R.string.Dibatalkan),
            getString(R.string.Dibatalkan),
            getString(R.string.BelumDipickup),
            getString(R.string.SudahDipickup),
            getString(R.string.SudahDipickup)
        )

        Document = arrayOf(
            getString(R.string.Document1),
            getString(R.string.Document2),
            getString(R.string.Document3),
            getString(R.string.Document4),
            getString(R.string.Document5),
            getString(R.string.Document6),
            getString(R.string.Document7),
            getString(R.string.Document8),
            getString(R.string.Document9),
            getString(R.string.Document10)
        )
        Clock = arrayOf(
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
            getString(R.string.Clock),
        )
        imageClock = arrayOf(
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
            R.drawable.ic_clock,
        )

        for (i in imagePickup.indices) {

            val pickUp = Request(imagePickup[i], Pickup[i], Document[i], Clock[i], imageClock[i])
            pickupList.add(pickUp)
        }

    }




}