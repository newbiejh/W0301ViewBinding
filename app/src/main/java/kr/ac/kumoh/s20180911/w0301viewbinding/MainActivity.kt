package kr.ac.kumoh.s20180911.w0301viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kr.ac.kumoh.s20180911.w0301viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root) // root = ConstraintLayout

        binding.btnAdd.setOnClickListener{
            binding.txtCount.text = (++count).toString()
        }

//        val txtCount = findViewById<TextView>(R.id.txt_count)
//        val btnAdd = findViewById<Button>(R.id.btn_add)
//
//        btnAdd.setOnClickListener{
//            txtCount.text = (++count).toString()
//        }
    }
}