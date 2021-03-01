package com.taufik.multiviewtype.data

import com.taufik.multiviewtype.R
import com.taufik.multiviewtype.model.Item


class MainData {
    companion object {
        val category: List<Any>
            get() = mutableListOf(
                "Appetizer",
                Item(R.drawable.ic_foods, "Chicken Enchilada Dip"),
                Item(R.drawable.ic_foods, "Cowboy Caviar"),
                Item(R.drawable.ic_foods, "Scallion and Caramelized Onion Dip"),
                Item(R.drawable.ic_foods, "Crockpot Honey Garlic Little Smokies"),
                Item(R.drawable.ic_foods, "Cheesy Sausage Dip"),

                "Main Course",
                Item(R.drawable.ic_foods, "Chicken Curry"),
                Item(R.drawable.ic_foods, "Grand Aioli"),
                Item(R.drawable.ic_foods, "Fried Rice"),

                "Dessert",
                Item(R.drawable.ic_foods, "Dadar Gulung"),
                Item(R.drawable.ic_foods, "American Pie"),
                Item(R.drawable.ic_foods, "Baklava"),
                Item(R.drawable.ic_foods, "Gelato")
            )
    }
}