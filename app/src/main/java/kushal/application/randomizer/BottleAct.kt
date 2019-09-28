package kushal.application.randomizer

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.RotateAnimation
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_bottle.*
import kotlin.random.Random

class BottleAct : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var player_count : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottle)

        ////////////////////////////////////////////////////////////////////////////////////////
        val rotateAnimation = RotateAnimation(
            0F, 360F, RotateAnimation.RELATIVE_TO_SELF, 0.5f,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f)
        rotateAnimation.duration = 1500

        Snackbar.make(container,"Please be seated equally around the device\nTap the BOTTLE to spin", Snackbar.LENGTH_LONG).show()

        val adapter = ArrayAdapter.createFromResource(this, R.array.players, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this



        bottle_img.setOnClickListener {
            bottle_img.startAnimation(rotateAnimation)
            new_anim()
            Handler().postDelayed({ bottle_img.startAnimation(new_anim()) },1390)
        }


    }

    private fun new_anim() : RotateAnimation {
        //custom stopping point
        var r = 0
        for (i in 1..20) r = (1..player_count).random()

        val rotate_cust_anim= RotateAnimation(
            0F, (360*r/player_count).toFloat(), RotateAnimation.RELATIVE_TO_SELF, 0.5f,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f)
        rotate_cust_anim.duration = 1500
        rotate_cust_anim.fillAfter = true

        return rotate_cust_anim
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        player_count = position+1

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
