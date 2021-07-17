package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myapplication.adapter.ItemAdapter
import com.test.myapplication.databinding.ActivityMainBinding
import com.test.myapplication.data.Datasource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset=Datasource().loadAffirmations()
        val recyclerView=binding.recyclerView
        recyclerView.adapter=ItemAdapter(this,myDataset)

        recyclerView.setHasFixedSize(true)
    }
}