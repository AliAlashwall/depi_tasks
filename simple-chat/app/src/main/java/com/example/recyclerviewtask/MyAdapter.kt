package com.example.recyclerviewtask


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.SendersData
import com.example.recyclerviewtask.databinding.RvItemBinding


class MyAdapter(private val list: List<SendersData>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val binding = RvItemBinding.bind(viewItem)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val current = list[position]
        holder.binding.apply {
            userName.text = current.userName
            userMessage.text = current.userMessage
        }
    }
}