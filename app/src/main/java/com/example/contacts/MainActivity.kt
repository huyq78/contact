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
        itemList.add(ItemModel(1, "Josefina Lehner", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(2, "Stuart Vandervort", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(3, "Madison Russel", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(4, "Halie Morar", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(5, "Karelle Simonis", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(6, "Hannah Welch", "0123456789", "@gmail.com"))
        itemList.add(ItemModel(7, "Fanny Frami", "0123456789", "@gmail.com"))
        val adapter = MyCustomAdapter(itemList, this)
        val rcView: RecyclerView = findViewById(R.id.RVLayout)
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = adapter

        registerForContextMenu(rcView)
    }
}