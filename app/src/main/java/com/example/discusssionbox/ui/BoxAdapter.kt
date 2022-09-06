package com.example.discusssionbox.ui

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import com.example.discusssionbox.R
import com.makeramen.roundedimageview.RoundedImageView

class BoxAdapter(private val boxList:ArrayList<Box>)
    :RecyclerView.Adapter<BoxAdapter.BoxViewHolder>() {

    class BoxViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageId : RoundedImageView = itemView.findViewById(R.id.avatar_pic)
        val name : TextView = itemView.findViewById(R.id.Username)
        val rating : ImageView = itemView.findViewById(R.id.Star_img)
        //val postImage : ImageView = itemView.findViewById(R.id.)
        val posting : TextView = itemView.findViewById(R.id.textPost)
        val likes : ImageView = itemView.findViewById(R.id.likes)
        val comment : ImageView = itemView.findViewById(R.id.comment)
        val share : ImageView = itemView.findViewById(R.id.shareit)
        val alertBox : ImageView = itemView.findViewById(R.id.alert_box)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_box, parent, false)
        return BoxViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoxViewHolder, position: Int) {
        val box = boxList[position]
        holder.imageId.setImageResource(box.imageId)
        //holder.postImage (need to add picasso url function)
        holder.name.text = (box.name)
        holder.rating.setImageResource(box.rating)
        holder.posting.text = (box.posting)
        holder.likes.setImageResource(box.likes)
        holder.comment.setImageResource(box.comment)
        holder.share.setImageResource(box.share)

    }

    override fun getItemCount(): Int {
        return boxList.size

    }
}


