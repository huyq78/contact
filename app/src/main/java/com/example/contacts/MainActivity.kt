package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Prepare arrays of data
        val itemList = arrayListOf<ItemModel>()
        for (i in 1..24) {
            itemList.add(
                ItemModel(
                    i,
                    ('A' + i - 1).toString() + " Nguyen Van",
                    "0965504095",
                    ('a' + i - 1).toString() + "@gmail.com"
                )
            )
        }
        val adapter = MyCustomAdapter(itemList, this)
        val rcView: RecyclerView = findViewById(R.id.RVLayout)
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = adapter

        registerForContextMenu(rcView)
    }
}