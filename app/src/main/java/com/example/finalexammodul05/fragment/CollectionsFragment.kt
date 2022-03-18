package com.example.finalexammodul05.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexammodul05.R
import com.example.finalexammodul05.adapter.CollectionsAdapter
import com.example.finalexammodul05.model.Collections

class CollectionsFragment : Fragment() {

    fun newInstance(): Fragment {
        var fragment: Fragment? = null
        if (fragment == null) {
            fragment = CollectionsFragment()
        }

        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_collection, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)

        val adapter = CollectionsAdapter(requireContext(), getAllCollections())
        recyclerView.adapter = adapter
    }

    private fun getAllCollections(): ArrayList<Collections> {
        val items: ArrayList<Collections> = ArrayList()
        items.add(
            Collections(
                "https://media.istockphoto.com/photos/clean-white-bath-towels-on-the-neatly-clean-bedroom-coziness-and-picture-id1303630250?b=1&k=20&m=1303630250&s=170667a&w=0&h=zzWNuiaNn6hv1MxXQMSHAl4tKY2Me8Yg03htMMsaxhI=",
                "Hotels"
            )
        )
        items.add(
            Collections(
                "https://media.istockphoto.com/photos/interior-of-a-modern-cozy-french-restaurant-picture-id1314951233?b=1&k=20&m=1314951233&s=170667a&w=0&h=XgyJ96HAeBPpC4c6PnvlN8pnIJw7PAkNhwySVvX2JQk=",
                "Restaurants"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1552519507-da3b142c6e3d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8Y2Fyc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
                "Cars"
            )
        )
        items.add(
            Collections(
                "https://media.istockphoto.com/photos/skillful-worker-attending-brief-meeting-in-the-factory-picture-id1299734004?k=20&m=1299734004&s=612x612&w=0&h=D-BL9fEAdswgKUXfpsVBIQGadUVEMoVXMqB4VzZxrOU=",
                "Jobs"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1616486338812-3dadae4b4ace?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGZ1cm5pdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
                "Furniture"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1605170439002-90845e8c0137?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8cGhvbmVzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
                "Phones"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1607860108855-64acf2078ed9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Y2FyJTIwd2FzaHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
                "Car Wash"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1610614819513-58e34989848b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGZhc3QlMjBmb29kfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
                "Fast Food"
            )
        )
        items.add(
            Collections(
                "https://media.istockphoto.com/photos/american-football-stadium-picture-id508552962?b=1&k=20&m=508552962&s=170667a&w=0&h=8le2_SchF5oUCwPGhxZU5hcddBNtpMlbU6gQiSytbZg=",
                "Stadiums"
            )
        )
        items.add(
            Collections(
                "https://images.unsplash.com/photo-1561840884-9dda41ed54e4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmljeWNsZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
                "Bicycles"
            )
        )

        return items
    }

}