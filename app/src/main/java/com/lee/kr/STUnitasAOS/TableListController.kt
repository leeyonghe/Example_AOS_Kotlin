package com.lee.kr.STUnitasAOS

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class TableListController  : AppCompatActivity(), SearchView.OnQueryTextListener {

    var list : ListView? = null
    var grid : GridView? = null
    var empty : TextView? = null
    var adapter : Adapter? = null
    var adapterGrid : AdapterGrid? = null
    var search : SearchView? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.tablelist_layout)

        this.list = findViewById(R.id.list)
        this.grid = findViewById(R.id.grid)
        this.empty = findViewById(R.id.empty)
        this.search = findViewById(R.id.search)


        this.adapter = Adapter(this)
        this.adapterGrid = AdapterGrid(this)

        this.list?.adapter = this.adapter
        this.grid?.adapter = this.adapterGrid

        this.search?.setOnQueryTextListener(this)


    }

    class Adapter : BaseAdapter{

        var context : Context?

        constructor(context: Context?) : super() {
            this.context = context
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItem(p0: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    class AdapterGrid : BaseAdapter{

        var context : Context?

        constructor(context: Context?) : super() {
            this.context = context
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItem(p0: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    override fun onQueryTextSubmit(p0: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

}