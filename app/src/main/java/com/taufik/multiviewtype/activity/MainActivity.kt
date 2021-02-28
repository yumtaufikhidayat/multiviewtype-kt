 package com.taufik.multiviewtype.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.taufik.multiviewtype.adapter.MainAdapter
import com.taufik.multiviewtype.data.MainData
import com.taufik.multiviewtype.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding
     private lateinit var adapter: MainAdapter
     private var dataList = listOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerViewData()
    }

     private fun setRecyclerViewData() {
         dataList = MainData.category
         adapter = MainAdapter(dataList)

         binding.apply {
             rvDataParent.layoutManager = LinearLayoutManager(this@MainActivity)
             rvDataParent.setHasFixedSize(true)
             rvDataParent.adapter = adapter
         }
     }
}