package app.murakami.takuro.count2

import android.graphics.Color
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

            if (number % 3 == 0){
                count.setTextColor(Color.GREEN)
            }else{
                count.setTextColor(Color.BLACK)
            }
        }

        minusButton.setOnClickListener {
            number--
            count.text = number.toString()
            if (number % 3 == 0){
                count.setTextColor(Color.GREEN)
            }else{
                count.setTextColor(Color.BLACK)
            }
        }





    }
}