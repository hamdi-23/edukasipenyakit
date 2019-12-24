package com.uty.edukasipenyakit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager

class Data_penyakit : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
    }

    private fun showRecyclerList(){
        rvPenyakit.layoutManager = LinearLayoutManager(this)
        val listPenyakitAdapter = ListPenyakitAdapter(list)
        rvPenyakit.adapter = listPenyakitAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }

            R.id.action_grid -> {
            }

            R.id.action_cardview -> {
            }
        }
    }
}
