package com.example.cactusrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_cactus.view.*

class ListCactusAdapter(private val listCactus: ArrayList<Cactus>) : RecyclerView.Adapter<ListCactusAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          fun bind(cactus: Cactus){
              with(itemView){
                  Glide.with(itemView.context).load(cactus.photo)
                      .apply(RequestOptions().override(60,60)).into(iv_list_cactus)

                  tv_name_list.text = cactus.name
                  tv_desc_list.text = cactus.description
              }
          }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCactusAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_cactus, parent, false)
        return ListViewHolder(view)

    }

    override fun getItemCount(): Int = listCactus.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listCactus[position])
    }
}