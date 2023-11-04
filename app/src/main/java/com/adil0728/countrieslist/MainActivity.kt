package com.adil0728.countrieslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var countriesAdapter: CountriesAdapter
    private var countriesList: ArrayList<Country> = ArrayList()
    private lateinit var listView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(countriesList) {
            add(Country(0, "Австралия", R.drawable.au))
            add(Country(1, "Австрия", R.drawable.at))
            add(Country(2, "Азербайджан", R.drawable.az))
            add(Country(3, "Аландские острова", R.drawable.ax))
            add(Country(4, "Албания", R.drawable.al))
            add(Country(5, "Алжир", R.drawable.dz))
            add(Country(6, "Виргинские Острова", R.drawable.vi))
            add(Country(7, "Американское Самоа", R.drawable.`as`))
            add(Country(8, "Ангилья", R.drawable.ai))
            add(Country(9, "Ангола", R.drawable.ao))
            add(Country(10, "Андорра", R.drawable.ad))
            add(Country(11, "Антарктида", R.drawable.aq))
            add(Country(12, "Антигуа и Барбуда", R.drawable.ag))
            add(Country(13, "Аргентина", R.drawable.ar))
            add(Country(14, "Армения", R.drawable.am))
            add(Country(15, "Аруба", R.drawable.aw))
            add(Country(16, "Афганистан", R.drawable.af))
            add(Country(17, "Багамы", R.drawable.bs))
            add(Country(18, "Бангладеш", R.drawable.bd))
            add(Country(19, "Барбадос", R.drawable.bb))
            add(Country(20, "Бахрейн", R.drawable.bh))
            add(Country(21, "Белиз", R.drawable.bz))
            add(Country(22, "Беларусь", R.drawable.by))
            add(Country(23, "Бельгия", R.drawable.be))
            add(Country(24, "Бенин", R.drawable.bj))
            add(Country(25, "Бермуды", R.drawable.bm))
            add(Country(26, "Болгария", R.drawable.bg))
            add(Country(27, "Боливия", R.drawable.bo))
            add(Country(28, "Бонэйр", R.drawable.bq))
            add(Country(29, "Босния и Герцеговина", R.drawable.ba))

        }

        listView = findViewById(R.id.recyclerView)
        linearLayoutManager = LinearLayoutManager(this)
        listView.layoutManager = linearLayoutManager
        countriesAdapter = CountriesAdapter(countriesList)
        listView.adapter = countriesAdapter
        val callback = SimpleItemTouchHelperCallback(countriesAdapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(listView)
        listView.setHasFixedSize(true)

    }


}