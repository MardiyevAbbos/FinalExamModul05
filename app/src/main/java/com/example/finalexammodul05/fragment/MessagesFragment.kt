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
import com.example.finalexammodul05.model.Collections
import com.example.finalexammodul05.model.Messages

class MessagesFragment : Fragment() {

    fun newInstance(): Fragment {
        var fragment: Fragment? = null
        if (fragment == null){
            fragment = MessagesFragment()
        }
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_messages, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)

        val adapter = MessagesAdapter(requireContext(), getAllMessages())
        recyclerView.adapter = adapter
    }

    private fun getAllMessages(): ArrayList<Messages>{
        val items: ArrayList<Messages> = ArrayList()
        items.add(Messages("https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Z2lybHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Maria", "This looks like a great deal \uD83D\uDCA5 • 14:22"))
        items.add(Messages("https://images.unsplash.com/photo-1552642986-ccb41e7059e7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fGJveXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60", "Marco Zapacosta", "Let`s da the deal \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25 • 14:20"))
        items.add(Messages("https://images.unsplash.com/photo-1515542622106-78bda8ba0e5b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGl0YWx5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Jeff Smith", "Can you do $4.0000 thought? \uD83D\uDE4F • 14:19"))
        items.add(Messages("https://media.istockphoto.com/photos/panoramic-aerial-view-to-the-illuminated-cityscape-of-london-picture-id1313895046?b=1&k=20&m=1313895046&s=170667a&w=0&h=DYmffKDEbm-cQrk10rwhuTDziA5sMMypyddQjuCKVv4=", "Antoine", "Can you give the more details? • 14:04"))
        items.add(Messages("https://images.unsplash.com/photo-1493713838217-28e23b41b798?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8d2F0ZXJmYWxsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Craig Federighi", "Can I get a 10% discount on it? • 13:41"))

        return items
    }

}