package com.kanyideveloper.onboardingscreens.ListRequest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kanyideveloper.onboardingscreens.R

class RequestPickUpAdapter (private val reqPickupList :ArrayList<Request>) : RecyclerView.Adapter<RequestPickUpAdapter.MyViewHolder> () {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_request,
        parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = reqPickupList[position]
        holder.imageNotpickup.setImageResource(currentItem.imageNotpickup)
        holder.tvNotPickup.text = currentItem.pickup
        holder.tvDocument.text = currentItem.Document
        holder.tvClock.text=currentItem.Clock
        holder.imageClock.setImageResource(currentItem.imageClock)

    }

    override fun getItemCount(): Int {
        return reqPickupList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {

        val imageNotpickup : ImageView = itemView.findViewById(R.id.imageNotpickup)
        val tvNotPickup : TextView = itemView.findViewById(R.id.tvNotPickup)
        val tvDocument : TextView = itemView.findViewById(R.id.tvDocument)
        val tvClock : TextView = itemView.findViewById(R.id.tvClock)
        val imageClock : ImageView = itemView.findViewById(R.id.imageClock)


    }

}