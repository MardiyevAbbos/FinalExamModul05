package com.example.finalexammodul05.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexammodul05.R
import com.example.finalexammodul05.adapter.CollectionsAdapter
import com.example.finalexammodul05.adapter.MessagesAdapter
import com.example.finalexammodul05.adapter.SearchAdapter
import com.example.finalexammodul05.model.Collections
import com.example.finalexammodul05.model.Messages
import com.example.finalexammodul05.model.SearchModel

class SearchFragment : Fragment() {

    fun newInstance(): Fragment {
        var fragment: Fragment? = null
        if (fragment == null){
            fragment = SearchFragment()
        }
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)

        val adapter = SearchAdapter(requireContext(), getAllSearch())
        recyclerView.adapter = adapter
    }

    private fun getAllSearch(): ArrayList<SearchModel>{
        val items: ArrayList<SearchModel> = ArrayList()
        items.add(SearchModel("https://images.unsplash.com/photo-1538998073820-4dfa76300194?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NzJ8fHBsYW50fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Valley Tavern", "1300 Union St"))
        items.add(SearchModel("https://media.istockphoto.com/photos/the-concept-of-cooking-meat-the-chef-cook-salt-on-the-cooked-steak-on-picture-id1203053489?b=1&k=20&m=1203053489&s=170667a&w=0&h=eaa2lZimXS-b17dNpvdw362J1jSYP1X0sdiYJNcBarA=", "Gamine", "1231 Fillmore St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1542826438-bd32f43d626f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGNha2VzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Saint Frank Coffee", "200 Market Street"))
        items.add(SearchModel("https://images.unsplash.com/photo-1607623814075-e51df1bdc82f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8bWVhdHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60", "Doppio Zero", "440 Fulton St"))
        items.add(SearchModel("https://media.istockphoto.com/photos/pasta-spaghetti-with-pesto-sauce-and-basil-leaf-picture-id1362790146?b=1&k=20&m=1362790146&s=170667a&w=0&h=0IygmKfCKhx40wwjJhkVaj3dDzmnUS-O1BiaISDtEeA=", "Lupa Trattoria", "500 Market St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1612528443702-f6741f70a049?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGJlZXJ8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Beer Basement", "323 Haight St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1512917774080-9991f1c4c750?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGhvbWV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Home", "960 Steiner St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1543007631-283050bb3e8c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fHB1YnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60", "The Pub At Ghirardeli Square", "979 Fulton St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1517088587697-8de5e72b421b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGNvbGF8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Coca Cola", "7070 Fillmore St"))
        items.add(SearchModel("https://images.unsplash.com/photo-1603569283847-aa295f0d016a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8anVpY2V8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Juice", "1111 Steiner St"))

        return items
    }

}