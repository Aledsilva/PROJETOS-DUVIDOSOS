package com.example.chorandinhoemdesesperovol7.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.chorandinhoemdesesperovol7.R
import com.example.chorandinhoemdesesperovol7.adapter.MainAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.chorandinhoemdesesperovol7.model.Results
import com.example.chorandinhoemdesesperovol7.util.viewModel
import com.example.chorandinhoemdesesperovol7.viewmodel.ViewModelMarvel


class MainActivity : AppCompatActivity() {

    private val viewModelMarvel by lazy { viewModel<ViewModelMarvel>() }
    private var results = mutableSetOf<Results>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler = findViewById<RecyclerView>(R.id.recycler_view_main)



        val adapterComics = MainAdapter(results)
        recycler.adapter = adapterComics
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager

        viewModelMarvel.getAllComics()
        viewModelMarvel.listMutableComic.observe(this, Observer {
            it?.let { itChar -> results.addAll(itChar) }
            adapterComics.notifyDataSetChanged()
        })
    }

        /*getAllComics()


        recycler_view_main.apply {
            layoutManager = GridLayoutManager(this@MainActivity,3)
            adapter = mainAdapter
        }


        /*Meu antigo recycler :(
        recycler_view_main.layoutManager = GridLayoutManager(this,3)
        recycler_view_main.adapter = MainAdapter()*/

    }
    var listMutableComic = MutableLiveData<MutableSet<Result>>()
    private val repositoryMarvel = RepositoryMarvel()

    fun getAllComics() = CoroutineScope(IO).launch {
        repositoryMarvel.getComicService().let {
            listMutableComic.postValue(it.data.results)
        }
    }*/

}
