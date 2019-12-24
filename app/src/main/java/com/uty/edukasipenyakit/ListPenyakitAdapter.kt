package com.uty.edukasipenyakit

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPenyakitAdapter(private val listPenyakit:ArrayList<penyakit>) : RecyclerView.Adapter<ListPenyakitAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_penyakit, viewGroup, false)
    return ListViewHolder(view)}

    override fun getItemCount(): Int {
return listPenyakit.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
val penyakit = listPenyakit[position]
        Glide.with(holder.itemView.context)
            .load(penyakit.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvNama.text = penyakit.nama
        holder.tvDetail.text = penyakit.detail
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNama:TextView = itemView.findViewById(R.id.tv_item_nama)
    var tvDetail :TextView = itemView.findViewById(R.id.tv_item_detail)
    var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}