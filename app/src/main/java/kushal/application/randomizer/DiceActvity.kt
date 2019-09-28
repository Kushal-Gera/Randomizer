package kushal.application.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dice_actvity.*
import kotlin.random.Random

class DiceActvity : AppCompatActivity() {

    val img_list = listOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_actvity)

        progress_circular_dice.visibility = View.GONE

        btn_dice.setOnClickListener {

            dice_img.visibility = View.INVISIBLE
            progress_circular_dice.visibility = View.VISIBLE

            Handler().postDelayed( {
                val r = Random.nextInt(6)
                dice_img.setImageResource(img_list[r])
                //toast stuff
                Toast.makeText(this,"It's a ${r+1}", Toast.LENGTH_SHORT).show()
                progress_circular_dice.visibility = View.GONE
                dice_img.visibility = View.VISIBLE
            }, 500)

        }


    }
}
