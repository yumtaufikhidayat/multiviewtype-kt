package com.taufik.multiviewtype.adapter

import androidx.recyclerview.widget.RecyclerView
import com.taufik.multiviewtype.databinding.ItemCategoryParentBinding

class ParentAdapter(private val binding: ItemCategoryParentBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(text: String) {
        binding.apply {
            tvCategoryName.text = text
        }
    }
}