package kushal.application.randomizer

import android.os.Bundle
import android.os.Handler
import android.view.animation.RotateAnimation
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottle.*

class BottleAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottle)

        val rotateAnimation = RotateAnimation(
            0F, 360F, RotateAnimation.RELATIVE_TO_SELF, 0.5f,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f
        )
        rotateAnimation.duration = 1500

        bottle_img.setOnClickListener {
            bottle_img.startAnimation(rotateAnimation)
            Handler().postDelayed({ bottle_img.startAnimation(rotateAnimation) },1390)

        }


    }
}
