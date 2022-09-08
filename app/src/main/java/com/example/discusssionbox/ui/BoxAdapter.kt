package com.example.discusssionbox.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.discusssionbox.R
import com.makeramen.roundedimageview.RoundedImageView
import com.squareup.picasso.Picasso

class BoxAdapter(private val boxList:ArrayList<Box>)
    :RecyclerView.Adapter<BoxAdapter.BoxViewHolder>() {

    class BoxViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageId : RoundedImageView = itemView.findViewById(R.id.avatar_pic)
        val name : TextView = itemView.findViewById(R.id.Username)
        val rating : ImageView = itemView.findViewById(R.id.star_img)
        val posting : TextView = itemView.findViewById(R.id.textPost)
        val postImage : ImageView = itemView.findViewById(R.id.Student_post)
        val likes : ImageView = itemView.findViewById(R.id.likes_me)
        val comment : ImageView = itemView.findViewById(R.id.comment)
        val share : ImageView = itemView.findViewById(R.id.shareit)
        //val alertBox : ImageView = itemView.findViewById(R.id.alert_box)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_box, parent, false)
        return BoxViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoxViewHolder, position: Int) {
        Picasso.get().load("https://masterbloger.com/wp-content/uploads/2021/04/What-is-an-essay_.png")
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLEvLoScwbLnszYVr821P7qG4uD1PW4Q-Gmg&usqp=CAU")
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXqlzuWcesGaNUyLpoUSMPBmIA0BVRJ8lNPw&usqp=CAU")
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKi7m0mT7UHxAtUkHGCzb2pTvMLt_eW5tg-A&usqp=CAU")
        Picasso.get().load("https://masterbloger.com/wp-content/uploads/2021/04/What-is-an-essay_.png")
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLEvLoScwbLnszYVr821P7qG4uD1PW4Q-Gmg&usqp=CAU")
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXqlzuWcesGaNUyLpoUSMPBmIA0BVRJ8lNPw&usqp=CAU")

        val box = boxList[position]
        holder.imageId.setImageResource(box.imageId)
        holder.name.text = (box.name)
        holder.rating.setImageResource(box.rating)
        holder.posting.text = (box.posting)
        //holder.postImage (need to add picasso url function)
        holder.postImage.setImageResource(box.postImage)

        holder.likes.setImageResource(box.likes)
        holder.comment.setImageResource(box.comment)
        holder.share.setImageResource(box.share)

    }

    override fun getItemCount(): Int {
        return boxList.size

    }
}


