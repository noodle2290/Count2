package app.murakami.takuro.count2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            number++
            count.text = number.toString()
        }

        minusButton.setOnClickListener {
            number--
            count.text = number.toString()
        }





    }
}