package com.example.cardviewyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {

            val elnombre: TextView=itemView.findViewById(R.id.textViewUsername)
             elnombre.text=user.name


            val ladire: TextView=itemView.findViewById(R.id.textViewAddress)
            ladire.text=user.address


            val laedad: TextView=itemView.findViewById(R.id.textViewEdad)
            laedad.text=user.edad

            val imgFoto=itemView.findViewById(R.id.imageView1) as ImageView
Glide.with(itemView.context).load(user.foto).into(imgFoto)


        }
    }
}

