package kushal.application.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.RotateAnimation
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dice_actvity.*
import kotlin.random.Random

class DiceActvity : AppCompatActivity() {

    val img_list = listOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_actvity)

        val listener = View.OnClickListener{
            val rotateAnimation = RotateAnimation(0F, 360F,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF , 0.5f)
            rotateAnimation.duration = 1100

            dice_img.startAnimation(rotateAnimation)
            dice_img.animate().scaleX(-3f).scaleY(-3f).duration = 1000
            Handler().postDelayed( {
                val r = (0..5).random()
                dice_img.setImageResource(img_list[r])
                dice_img.animate().scaleX(1f).scaleY(1f)

            }, 300)
        }

        btn_dice.setOnClickListener(listener)
        title_dice.setOnClickListener(listener)

    }
}
