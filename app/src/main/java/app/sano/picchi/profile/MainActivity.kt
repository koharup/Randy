package app.sano.picchi.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像を見えなくする
        profileImageView.isVisible = false
        commentTextView.isVisible = false

        button1.setOnClickListener {
            profileImageView.isVisible = true
            commentTextView.isVisible = true

        }
    }



}
