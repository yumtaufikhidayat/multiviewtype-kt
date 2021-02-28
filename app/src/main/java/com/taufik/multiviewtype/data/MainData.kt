package com.taufik.multiviewtype.data

import com.taufik.multiviewtype.R
import com.taufik.multiviewtype.model.Item


class MainData {
    companion object {
        val category: List<Any>
            get() = mutableListOf(
                "Foods",
                Item(R.drawable.ic_android, "Chicken Curry"),
                Item(R.drawable.ic_android, "Hot dog"),
                Item(R.drawable.ic_android, "Pasta"),
                Item(R.drawable.ic_android, "Spaghetti"),
                Item(R.drawable.ic_android, "Hamburger"),

                "Drinks",
                Item(R.drawable.ic_android, "Water"),
                Item(R.drawable.ic_android, "Lemon Tea"),
                Item(R.drawable.ic_android, "Coffee")
            )
    }
}