package iti.test.day5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction
import iti.test.day5.fragments.FragmentOne

class MainActivity3 : AppCompatActivity() {
    private lateinit var fragmentOne: FragmentOne
    private lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (savedInstanceState == null) {
            fragmentOne = FragmentOne()
            transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.fragment_container, fragmentOne, "Fragment")
            transaction.commit()
        } else {
            fragmentOne = supportFragmentManager.findFragmentByTag("Fragment") as FragmentOne
        }
    }
}