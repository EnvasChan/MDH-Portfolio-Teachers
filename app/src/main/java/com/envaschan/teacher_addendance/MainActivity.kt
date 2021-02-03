package com.envaschan.teacher_addendance

import android.Manifest
//import android.R
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import 	android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = ContextCompat.checkSelfPermission(this,Manifest.permission.INTERNET)

        ActivityCompat.requestPermissions(
            this@MainActivity,
            arrayOf(Manifest.permission.INTERNET),
            1005
        )

        var road_button = findViewById<Button>(R.id.road)

        var text_num1 = findViewById<TextView>(R.id.num1)
        var text_num2 = findViewById<TextView>(R.id.num2)
        var text_num3 = findViewById<TextView>(R.id.num3)
        var text_num4 = findViewById<TextView>(R.id.num4)
        var text_num5 = findViewById<TextView>(R.id.num5)
        var text_num6 = findViewById<TextView>(R.id.num6)
        var text_num7 = findViewById<TextView>(R.id.num7)
        var text_num8 = findViewById<TextView>(R.id.num8)
        var text_num9 = findViewById<TextView>(R.id.num9)
        var text_num10 = findViewById<TextView>(R.id.num10)
        var text_num11 = findViewById<TextView>(R.id.num11)
        var text_num12 = findViewById<TextView>(R.id.num12)
        var text_num13 = findViewById<TextView>(R.id.num13)
        var text_num14 = findViewById<TextView>(R.id.num14)
        var text_num15 = findViewById<TextView>(R.id.num15)
        var text_num16 = findViewById<TextView>(R.id.num16)
        var text_num17 = findViewById<TextView>(R.id.num17)
        var text_num18 = findViewById<TextView>(R.id.num18)
        var text_num19 = findViewById<TextView>(R.id.num19)
        var text_num20 = findViewById<TextView>(R.id.num20)
        var text_num21 = findViewById<TextView>(R.id.num21)
        var text_num22 = findViewById<TextView>(R.id.num22)
        var text_num23 = findViewById<TextView>(R.id.num23)
        var text_num24 = findViewById<TextView>(R.id.num24)
        var text_num25= findViewById<TextView>(R.id.num25)
        var text_num26= findViewById<TextView>(R.id.num26)
        var text_num27= findViewById<TextView>(R.id.num27)




        road_button.setOnClickListener{



            val url = "http://218.237.246.15:8080/api/echo-json"
//           val response_text = URL("http://192.168.0.43:8080/api/echo-json").readText()

            // ...

            // Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(this)

            // Request a string response from the provided URL.

            val json_req = JsonObjectRequest(url,null,Response.Listener
            { response ->
                if (response.getBoolean("강보민") == true)
                {
                    text_num1.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("구현우") == true)
                {
                    text_num2.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("김민준") == true)
                {
                    text_num3.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("김준오") == true)
                {
                    text_num4.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("김태현") == true)
                {
                    text_num5.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("김하늘") == true)
                {
                    text_num6.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("김하종") == true)
                {
                    text_num7.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("박태민") == true)
                {
                    text_num8.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("심규선") == true)
                {
                    text_num9.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("양민혁") == true)
                {
                    text_num10.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("우승연") == true)
                {
                    text_num11.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("유재원") == true)
                {
                    text_num12.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("윤수혁") == true)
                {
                    text_num13.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("윤영관") == true)
                {
                    text_num14.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("이대연") == true)
                {
                    text_num15.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("장근우") == true)
                {
                    text_num16.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("정영석") == true)
                {
                    text_num17.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("정지원") == true)
                {
                    text_num18.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("정찬영") == true)
                {
                    text_num19.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("조혁승") == true)
                {
                    text_num20.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("조효상") == true)
                {
                    text_num21.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("최현웅") == true)
                {
                    text_num22.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("한창민") == true)
                {
                    text_num23.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("홍승범") == true)
                {
                    text_num24.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("배가람") == true)
                {
                    text_num25.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("이도현") == true)
                {
                    text_num26.setBackgroundResource(R.drawable.edge_success)
                }
                if (response.getBoolean("이현호") == true)
                {
                    text_num27.setBackgroundResource(R.drawable.edge_success)
                }
            } ,Response.ErrorListener {
                    error ->

            })
            // Add the request to the RequestQueue.
            queue.add(json_req)

        }




        }
    }









