package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Member

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bmi:Int = 0
        var bmr:Int = 0
        var tdee:Int = 0
        var hstack:Double = 0.00

        //activ 1="นั่งทำงานอยู่กับที่", 2="ออกกำลังกายหรือเล่นกีฬาเล็กน้อย", 3="ออกกำลังกายหรือเล่นกีฬาปานกลาง", 4="ออกกำลังกายหรือเล่นกีฬาอย่างหนัก", 5="ออกกำลังกายหรือเล่นกีฬาอย่างหนักหน่วง"

        bCal.setOnClickListener{
            if (sex.text.toString() == "" || kilo.text.toString() == "" || cm.text.toString() == "" || age.text.toString() == "" || activ.text.toString() == ""){
                Toast.makeText(this, "Some field blank.", Toast.LENGTH_SHORT).show()
            }else{
                var akilo = kilo.text.toString().toDouble()
                var acm = cm.text.toString().toDouble()
                var aage = age.text.toString().toInt()
                if (sex.text.toString().toInt() == 1 && activ.text.toString().toInt() == 1){
                    hstack = acm * acm
                    bmi = akilo / hstack
                    tbmi.setText("$bmi")

                }
            }

        }
    }
}