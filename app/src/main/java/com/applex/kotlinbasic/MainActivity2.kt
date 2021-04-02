package com.applex.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.applex.kotlinbasic.adapters.DemoAdapter
import com.applex.kotlinbasic.models.DemoModel
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val demoList = generateItems(50)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DemoAdapter(demoList)
        recyclerView.setHasFixedSize(true)
    }

    private fun generateItems(size: Int): ArrayList<DemoModel> {
        val list = ArrayList<DemoModel>()

        for(i in 0 until size){
            val drawable = when (i%3){
                0 -> R.drawable.ic_android_black_24dp
                1 -> R.drawable.ic_baseline_add_reaction_24
                else -> R.drawable.ic_launcher_foreground
            }

            val item = DemoModel(drawable, "Item $i")
//            list.add(item)
            list += item
        }

        return list
    }
}