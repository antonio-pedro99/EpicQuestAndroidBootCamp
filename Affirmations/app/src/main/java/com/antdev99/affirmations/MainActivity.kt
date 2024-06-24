package com.antdev99.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.antdev99.affirmations.adapters.ItemAdapter
import com.antdev99.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: load affirmations from Data source
        val dataSet = DataSource().loadAffirmations()

        // TODO: initialize the recyclerview


        // TODO: set the adapter
    }
}