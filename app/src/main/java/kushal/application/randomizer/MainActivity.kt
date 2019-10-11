package kushal.application.randomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ll1.setOnClickListener { startActivity(Intent(this, TossActivity::class.java)) }

        ll2.setOnClickListener { startActivity(Intent(this, BottleAct::class.java)) }

        ll3.setOnClickListener { startActivity(Intent(this, DiceActvity::class.java)) }

//        ll4.setOnClickListener { startActivity(Intent(this, DiceActvity::class.java)) }

        ll5.setOnClickListener { startActivity(Intent(this, RandomNumber::class.java)) }

    }


}
