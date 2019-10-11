package kushal.application.randomizer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_random_number.*
import kotlin.random.Random

class RandomNumber : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)


        generate.setOnClickListener {

            var start = 0
            var end = Int.MAX_VALUE

            if (!TextUtils.isEmpty(et1.text))
                start = et1.text.toString().toInt()

            if (!TextUtils.isEmpty(et2.text))
                end = et2.text.toString().toInt()

            val random = Random.nextInt(end - start) + start

            display.text = random.toString()
            display.setTextColor(Color.BLACK)


        }


    }
}
