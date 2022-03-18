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

    fun newInstance(): Fragment {
        var fragment: Fragment? = null
        if (fragment == null){
            fragment = HomeFragment()
        }
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
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapterC = context?.let { CategoriesAdapter(it,getAllCategories()) }
        rvCategories.adapter = adapterC

        val rvRestaurant: RecyclerView = view.findViewById(R.id.rv_restaurant)
        rvRestaurant.layoutManager = GridLayoutManager(requireContext(), 2)
        val adapterR = RestaurantAdapter(requireContext() ,getAllRestaurants())
        rvRestaurant.adapter = adapterR

    }

    private fun getAllCategories(): ArrayList<Categories> {
        val categories: ArrayList<Categories> = ArrayList()

        categories.add(Categories("https://media.istockphoto.com/photos/delicious-meal-picture-id1295387240?b=1&k=20&m=1295387240&s=170667a&w=0&h=KtWYFjSBgpNgVkE3P-WKZ2F6V-VxyUBBtJIP_k8IANM=", "Restaurants"))
        categories.add(Categories("https://media.istockphoto.com/photos/coffee-picture-id1271386167?b=1&k=20&m=1271386167&s=170667a&w=0&h=dLrwxXNu5c0I4hSWngB8bsGESdHCrckPux5AuYxJu8k=", "Coffee Shops"))
        categories.add(Categories("https://images.unsplash.com/photo-1483985988355-763728e1935b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c2hvcHBpbmd8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Shopping"))
        categories.add(Categories("https://media.istockphoto.com/photos/showcasing-great-skill-and-agility-picture-id1296964999?b=1&k=20&m=1296964999&s=170667a&w=0&h=fv_VWIU50-kkt2WEUE7PLIUFGj_6JUCDK5Bjfh3xNpA=", "Football"))
        categories.add(Categories("https://images.unsplash.com/photo-1543092587-d8b8feaf362b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Y2hlc3N8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Chess"))
        categories.add(Categories("https://media.istockphoto.com/photos/diverse-tennis-picture-id1322615390?b=1&k=20&m=1322615390&s=170667a&w=0&h=8WROZFZujf3UYkTFwBsr4z4WVQ9Y_RtUNT9UWRAxSsU=", "Tennis"))

        return categories
    }

    private fun getAllRestaurants(): ArrayList<Restaurant> {
        val items: ArrayList<Restaurant> = ArrayList()

        items.add(Restaurant("https://media.istockphoto.com/photos/the-concept-of-cooking-meat-the-chef-cook-salt-on-the-cooked-steak-on-picture-id1203053489?b=1&k=20&m=1203053489&s=170667a&w=0&h=eaa2lZimXS-b17dNpvdw362J1jSYP1X0sdiYJNcBarA=", "Gamine", "1231 Fillmore St"))
        items.add(Restaurant("https://images.unsplash.com/photo-1607623814075-e51df1bdc82f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8bWVhdHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60", "Doppie Zero", "440 Fulton St"))
        items.add(Restaurant("https://media.istockphoto.com/photos/pasta-spaghetti-with-pesto-sauce-and-basil-leaf-picture-id1362790146?b=1&k=20&m=1362790146&s=170667a&w=0&h=0IygmKfCKhx40wwjJhkVaj3dDzmnUS-O1BiaISDtEeA=", "Lupa Trattoria", "200 Market St"))
        items.add(Restaurant("https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FsYWR8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Blackwood", "1100 Union St"))
        items.add(Restaurant("https://media.istockphoto.com/photos/uzbek-cuisine-pilaf-picture-id1273602886?b=1&k=20&m=1273602886&s=170667a&w=0&h=nuSowomx_lt1Ui-Mcs924RkW68Vd07t4FWai24KHtwQ=", "Palov", "1325 Fulton St"))
        items.add(Restaurant("https://media.istockphoto.com/photos/grilled-chicken-on-bamboo-skewers-picture-id521040304?b=1&k=20&m=521040304&s=170667a&w=0&h=J6h0EtumhD_YAKax2r2PIc_kO1sZ5UyZ1gymFEbQ55o=", "Kabob", "777 Market St"))
        items.add(Restaurant("https://media.istockphoto.com/photos/somsa-meat-pies-at-breakfast-in-samarkand-uzbekistan-picture-id578823990?k=20&m=578823990&s=612x612&w=0&h=9_Krmbp3wzWaSSioSSfrjJrfZVsYpnzWDzSEPWdtCYU=", "Somsa", "500 Fillmore St"))
        items.add(Restaurant("https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Zm9vZHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60", "Bishtakes", "2020 Union St"))

        return items
    }

}