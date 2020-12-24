package com.example.cactusrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Cactus>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main.setHasFixedSize(true)
        list.addAll(getDataCactus())
        showrecyclerList()
    }

    private fun showrecyclerList(){
        rv_main.layoutManager = LinearLayoutManager(this)
        val listCactusAdapter = ListCactusAdapter(list)
        rv_main.adapter = listCactusAdapter
    }

    private fun getDataCactus():ArrayList<Cactus>{
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listCactus = ArrayList<Cactus>()
        for (position in dataName.indices){
            val cactus = Cactus(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listCactus.add(cactus)
        }
        return listCactus
    }
}