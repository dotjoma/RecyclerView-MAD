package com.example.rviewbaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var rvList : RecyclerView
    private  lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList = findViewById(R.id.recyclerView)
        rvList.layoutManager = LinearLayoutManager(this)

        val itemList = listOf(MyItem("Item 1"), MyItem("Item 2"), MyItem("Item 3"))

        adapter = MyAdapter(itemList)
        rvList.adapter = adapter
    }
}