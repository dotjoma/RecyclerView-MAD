package com.example.rviewbaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        val itemList = listOf(
            MyItem("Item 1", "09764567876"),
            MyItem("Item 2", "09785647832"),
            MyItem("Item 3", "09764567876"),
            MyItem("Item 4", "09764567876"),
            MyItem("Item 5", "09145637864"),
            MyItem("Item 6", "09764567876"),
            MyItem("Item 7", "09783956731"),
            MyItem("Item 8", "09764567876"),
            MyItem("Item 9", "09764567876"),
            MyItem("Item 10", "09764567876")
        )

        adapter = MyAdapter(itemList)
        val itemCount = adapter.itemCount
        Toast.makeText(this, "No of Item: $itemCount", Toast.LENGTH_SHORT).show()
        rvList.adapter = adapter
    }
}