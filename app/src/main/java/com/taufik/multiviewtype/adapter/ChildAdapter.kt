package com.taufik.multiviewtype.adapter

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.taufik.multiviewtype.databinding.ItemCategoryChildBinding
import com.taufik.multiviewtype.model.Item

class ChildAdapter(private val binding: ItemCategoryChildBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        binding.apply {
            tvCategoryName.text = item.name
            cardCategoryChild.setOnClickListener{
                Toast.makeText(itemView.context, item.name, Toast.LENGTH_SHORT).show()
            }
        }
    }
}