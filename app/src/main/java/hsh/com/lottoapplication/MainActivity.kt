package hsh.com.lottoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomCard.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
//            val result = ArrayList(getRandomLottoNumbers())
//            val result = ArrayList(getShuffleLottoNumbers())
          val result = ArrayList(LottoNumberMaker.getShuffleLottoNumbers())
            intent.putIntegerArrayListExtra("result", result)
            startActivity(intent)
        }
        constellationCard.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        nameCard.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
}

fun getRandomLottoNumber(): Int {
    return Random.nextInt(45) + 1
}

fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()
    for(i in 1..6){
        var number = 0
        do {
        	number = getRandomLottoNumber()
        }while (lottoNumbers.contains(number))
        lottoNumbers.add(number)
    }
    return lottoNumbers
}

fun getShuffleLottoNumbers(): MutableList<Int> {
    val list = mutableListOf<Int>()
    for(number in 1..45) list.add(number)
    list.shuffle()
    return list.subList(0,6)
}








