package com.example.chorandinhoemdesesperovol7.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chorandinhoemdesesperovol7.R
import com.example.chorandinhoemdesesperovol7.model.Results
import com.squareup.picasso.Picasso


class MainAdapter(
    val comicsList: MutableSet<Results>
) : RecyclerView.Adapter<CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val homeXML = layoutInflater.inflate(R.layout.home_itens, parent, false)
        return CustomViewHolder(
            homeXML
        )
    }

    override fun getItemCount(): Int {
        return comicsList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val comics = comicsList.elementAt(position)
        //Picasso.get().load(comics.thumbnail.path+ "."+comics.thumbnail.extension).into(holder.image)
        Picasso.get().load("${comics.thumbnail.path}.${comics.thumbnail.extension}").into(holder.image)
        holder.name.text = comics.title
        /*holder.itemView.hq_edition.text = hqTitles.toString()
        holder.itemView.image_hq.setImageResource(R.drawable.homem_aranha_hq)*/
    }

}

class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val image: ImageView = itemView.findViewById(R.id.image_hq)
    val name: TextView = itemView.findViewById(R.id.hq_edition)

}