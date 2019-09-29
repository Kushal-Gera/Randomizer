package kushal.application.randomizer

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toss.*
import kotlin.random.Random

class TossActivity : AppCompatActivity() {
    val img_list = listOf(R.drawable.heads, R.drawable.tails)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toss)

        progress_circular.visibility = View.GONE

        btn.setOnClickListener {
            toss_img.visibility = View.INVISIBLE
            progress_circular.visibility = View.VISIBLE
            Handler().postDelayed( {

                val r = Random.nextInt(50)
                toss_img.setImageResource(img_list[r%2])
                progress_circular.visibility = View.GONE
                toss_img.visibility = View.VISIBLE
            }, 500)

        }



    }
}
