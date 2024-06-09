package com.example.job20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listnama = arrayOf(
        "Adelia Eka R",
        "Adib Muzakki",
        "Alfian Davi Aghna",
        "Anas Kusworojati",
        "Apriza Tri Maulidina",
        "Chelsea Nadinia P",
        "Daffa' Raihan Nabawi",
        "Della Anggraeni",
        "Dyah Fatma",
        "Dinda Novita Putri",
        "Evi Mailasari"
    )
    val listnis = arrayOf(
        "2233242",
        "2233243",
        "2233244",
        "2233245",
        "2233246",
        "2233247",
        "2233248",
        "2233249",
        "2233250",
        "2233251",
        "2233252"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Kelas(listnama[i], listnis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}