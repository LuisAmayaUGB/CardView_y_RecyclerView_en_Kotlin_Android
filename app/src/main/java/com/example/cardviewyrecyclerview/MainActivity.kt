package com.example.cardviewyrecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
       recyclerView.layoutManager = LinearLayoutManager(this, VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Alumno1", "La Unión","12",R.drawable.uno1))
        users.add(User("Alumno2", "San Vicente","23",R.drawable.ic_baseline_beach_access_24))
        users.add(User("Alumno3", "Santa Ana","34",3))
        users.add(User("Alumno4", "Usulután","22",1))
        users.add(User("Alumno5", "San Miguel","222",1))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}