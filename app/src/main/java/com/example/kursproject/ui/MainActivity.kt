package com.example.kursproject.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kursproject.R
import com.example.kursproject.databinding.ActivityMainBinding
import com.example.kursproject.ui.AddTea.AddTeaData
import com.example.kursproject.ui.AddTea.AddteaAdpter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<AddTeaData>
    private lateinit var tempArrayList : ArrayList<AddTeaData>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var tea : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.TeaParty, R.id.Favorite,R.id.Add_Tea,R.id.Profile
            )
        )
        navView.setupWithNavController(navController)
        imageId = arrayOf(
            R.drawable.tea1,
            R.drawable.tea2
        )
        heading = arrayOf(
            "чай тесс",
            "чай слоняра",
            "чай какой то",
            "чай липтон"
        )
        newRecylerview=findViewById(R.id.recyclerview)
        newRecylerview.layoutManager=LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)

        newArrayList= arrayListOf<AddTeaData>()
        getUserData()



    }
    private fun getUserData(){
        for (i in imageId.indices){
            val tea =AddTeaData(imageId[i],heading[i])
            newArrayList.add(tea)
        }
        newRecylerview.adapter=AddteaAdpter(newArrayList)

    }
}