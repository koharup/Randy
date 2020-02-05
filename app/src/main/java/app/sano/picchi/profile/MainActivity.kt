package app.sano.picchi.profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.CollapsibleActionView
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

            nameButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(108,149,100))

            sportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            foodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            hobbyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))


        }

        foodButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.donut_image)
            profileTextView.text = "好きな食べ物"
            commentTextView.text = "キャンディーやドーナツが一番好きかな"

            foodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(108,149,100))
            sportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            nameButton.backgroundTintList  = ColorStateList.valueOf(Color.rgb(67,87,62))
            hobbyButton.backgroundTintList  =ColorStateList.valueOf(Color.rgb(67,87,62))
        }

        sportButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.baseball_image)
            profileTextView.text = "好きなスポーツ"
            commentTextView.text = "野球が好きでスタジアムによく通ってるよ"

            foodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            sportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(108,149,100))
            nameButton.backgroundTintList  = ColorStateList.valueOf(Color.rgb(67,87,62))
            hobbyButton.backgroundTintList  =ColorStateList.valueOf(Color.rgb(67,87,62))
        }

        hobbyButton.setOnClickListener {
            profileImageView.setImageResource(R.drawable.gadget_image)
            profileTextView.text = "趣味"
            commentTextView.text = "ガジェットを集めて動かすこと"

            foodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            sportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(67,87,62))
            nameButton.backgroundTintList  = ColorStateList.valueOf(Color.rgb(67,87,62))
            hobbyButton.backgroundTintList  =ColorStateList.valueOf(Color.rgb(108,149,100))

        }
    }



}
