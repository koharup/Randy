package app.sano.picchi.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //画像を見えなくする
//        commentTextView.isVisible = false

        nameButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.randy_image)
            profileTextView.text = "名前"
            commentTextView.text = "Androidメンターのランディだよ！"

        }

        foodButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.donut_image)
            profileTextView.text = "好きな食べ物"
            commentTextView.text = "キャンディーやドーナツが一番好きかな"
        }

        sportButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.baseball_image)
            profileTextView.text = "好きなスポーツ"
            commentTextView.text = "野球が好きでスタジアムによく通ってるよ"
        }

        hobbyButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.gadget_image)
            profileTextView.text = "趣味"
            commentTextView.text = "ガジェットを集めて動かすこと"

        }
    }



}
