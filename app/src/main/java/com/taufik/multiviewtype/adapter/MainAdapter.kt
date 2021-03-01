package com.taufik.multiviewtype.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taufik.multiviewtype.databinding.ItemCategoryChildBinding
import com.taufik.multiviewtype.databinding.ItemCategoryParentBinding
import com.taufik.multiviewtype.model.Item

class MainAdapter(private val data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val PARENT_CATEGORY = 0
        private const val CHILD_CATEGORY = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            PARENT_CATEGORY -> ParentAdapter(
                ItemCategoryParentBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            CHILD_CATEGORY -> ChildAdapter(
                ItemCategoryChildBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            PARENT_CATEGORY -> {
                val parentAdapter = holder as ParentAdapter
                parentAdapter.bind(data[position] as String)
            }

            CHILD_CATEGORY -> {
                val childAdapter = holder as ChildAdapter
                childAdapter.bind(data[position] as Item)
            }

            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
            is String -> PARENT_CATEGORY
            is Item -> CHILD_CATEGORY
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }
}