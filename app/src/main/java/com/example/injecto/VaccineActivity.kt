package com.example.injecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class VaccineActivity : AppCompatActivity() {
    private var dataModel: ArrayList<DataModel>? = null
    private lateinit var listView: ListView
    private lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine)

        title = "Injecto"
        listView = findViewById<View>(R.id.listView) as ListView
        dataModel = ArrayList<DataModel>()
        dataModel!!.add(DataModel("BCG", false))
        dataModel!!.add(DataModel("Polio Vaccine", false))
        dataModel!!.add(DataModel("Pneumococcal Vaccine", false))
        dataModel!!.add(DataModel("Rota Virus", true))
        dataModel!!.add(DataModel("Measles Rubella", true))
        dataModel!!.add(DataModel("Flu Vaccine", true))
        dataModel!!.add(DataModel("Yellow Fever Vaccine", true))
        dataModel!!.add(DataModel("Human Papilloma Virus", false))
        dataModel!!.add(DataModel("Hepatitis A", false))
        dataModel!!.add(DataModel("Typhoid Vaccine", false))
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val dataModel: DataModel = dataModel!![position] as DataModel
            dataModel.checked = !dataModel.checked
            adapter.notifyDataSetChanged()
        }


    }
}