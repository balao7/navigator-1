package com.shaishavgandhi.navigator.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.shaishavgandhi.navigato.sampler.R
import com.shaishavgandhi.navigator.Extra
import com.shaishavgandhi.navigator.Navigator

class DetailActivity : AppCompatActivity() {

    @Extra lateinit var userList: ArrayList<User>
    @Extra var points: Points? = null
    @Extra var userId: Long? = null
    @Extra var source: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        Navigator.bind(this)

        Navigator.prepareDetailFragment()
                .setUser(userList[0])
                .bundle
        findViewById<TextView>(R.id.whatever).text = userList.first().name

    }
}
