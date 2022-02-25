package com.example.finalexammodul05.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexammodul05.R
import com.example.finalexammodul05.adapter.CategoriesAdapter
import com.example.finalexammodul05.adapter.RestaurantAdapter
import com.example.finalexammodul05.model.Categories
import com.example.finalexammodul05.model.Restaurant

class HomeFragment : Fragment() {

    private val KEY: String = "the_key"

    fun newInstance(): HomeFragment {
        val fragment = HomeFragment()
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        val rvCategories = view.findViewById<RecyclerView>(R.id.rv_categories)
        rvCategories.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterC = CategoriesAdapter(getAllCategories())
        rvCategories.adapter = adapterC

        val rvRestaurant: RecyclerView = view.findViewById(R.id.rv_restaurant)
        rvRestaurant.layoutManager = GridLayoutManager(requireContext(), 2)
        val adapterR = RestaurantAdapter(getAllRestaurants())
        rvRestaurant.adapter = adapterR

    }

    private fun getAllCategories(): ArrayList<Categories> {
        val categories: ArrayList<Categories> = ArrayList()

        categories.add(Categories(R.drawable.deli, "Restaurants"))
        categories.add(Categories(R.drawable.deli2, "Restaurants"))
        categories.add(Categories(R.drawable.diner, "Restaurants"))
        categories.add(Categories(R.drawable.diner3, "Restaurants"))
        categories.add(Categories(R.drawable.fire, "Restaurants"))
        categories.add(Categories(R.drawable.restaurent3, "Restaurants"))

        return categories
    }

    private fun getAllRestaurants(): ArrayList<Restaurant> {
        val items: ArrayList<Restaurant> = ArrayList()

        for (i in 0..1) {
            items.add(Restaurant(R.drawable.deli, "Restaurants", "1231 Fillmore St"))
            items.add(Restaurant(R.drawable.deli2, "Restaurants", "1231 Fillmore St"))
            items.add(Restaurant(R.drawable.diner, "Restaurants", "1231 Fillmore St"))
            items.add(Restaurant(R.drawable.diner3, "Restaurants", "1231 Fillmore St"))
            items.add(Restaurant(R.drawable.fire, "Restaurants", "1231 Fillmore St"))
            items.add(Restaurant(R.drawable.restaurent3, "Restaurants", "1231 Fillmore St"))
        }

        return items
    }

}