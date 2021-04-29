package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Jaka Dwi", "Laki-laki", "jaka_19520004@stimata.ac.id"
        ,"083848691855", "Malang")
        )
        listTeman.add(
            MyFriend("Pelolong", "Laki-laki","pelolong24@gmail.com"
        ,"083848691855", "Malang juga")
        )
        listTeman.add(
            MyFriend("Adika", "Laki-laki","adika@gmail.com"
                ,"0888888888888", "Malang juga")
        )
        listTeman.add(
            MyFriend("Sukijan", "Laki-laki","Sukijan@gmail.com"
                ,"089696969693", "Malang juga")
        )
        listTeman.add(
            MyFriend("Anak Mama", "Laki-laki","anakmama@gmail.com"
                ,"084525362245", "Malang juga")
        )
    }

    private fun tampilTeman() {
        rv_listMyfriend.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriend.adapter=MyFriendAdapter(activity!!, listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend , container , false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}