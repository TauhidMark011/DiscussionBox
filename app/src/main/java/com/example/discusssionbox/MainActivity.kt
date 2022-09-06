package com.example.discusssionbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.discusssionbox.ui.Box
import com.example.discusssionbox.ui.BoxAdapter

class MainActivity : AppCompatActivity() {

   private lateinit var recyclerView: RecyclerView
   private lateinit var boxList: ArrayList<Box>
   private lateinit var boxAdapter: BoxAdapter
   private lateinit var imageId : Array<Int>
   private lateinit var name : Array<String>
   private lateinit var rating : Array<Int>
   private lateinit var posting : Array<String>
   private lateinit var likes : Array<Int>
   private lateinit var comment : Array<Int>
   private lateinit var share : Array<Int>
   private lateinit var alertBox : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        boxList  = ArrayList()


        imageId = arrayOf(
            R.drawable.woman,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
        )

        name = arrayOf(

            "Alexa",
            "Somudra",
            "Devdoot",
            "Ashwini",
            "Robin",
            "Surojit",
            "Karim"
        )

        rating = arrayOf(
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,

        )

        posting = arrayOf(

            "This is the Discussion box, make it more awesome by exploring knowledge with us",
            "Mathematics for Biomedical Physics is an open access peer-reviewed textbook",
            "topics are presented in their simplest but rigorous form so that students can easily understand",
            "the advanced form of these topics when the need arises. Several end-of-chapter problems and chapter",
            "examples relate the applications of mathematics to biomedical physics. After mastering the topics of this book",
            "students would be ready to embark on quantitative thinking in various topics of biology and medicine",
            "students would be ready to embark on quantitative thinking in various topics of biology and medicine"
        )

        likes = arrayOf(

            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,
            R.drawable.star,

        )

        comment = arrayOf(

            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment,
        )

        share = arrayOf(
            R.drawable.share,
            R.drawable.share,
            R.drawable.share,
            R.drawable.share,
            R.drawable.share,
            R.drawable.share,
            R.drawable.share,
        )

        alertBox = arrayOf(

            R.drawable.alert,
            R.drawable.alert,
            R.drawable.alert,
            R.drawable.alert,
            R.drawable.alert,
            R.drawable.alert,
            R.drawable.alert,

        )

        boxAdapter = BoxAdapter(boxList)
        recyclerView.adapter = boxAdapter

         recyclerView =findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        boxList = arrayListOf<Box>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in imageId.indices){

            val box = Box(imageId[i],name[i],posting[i],likes[i],comment[i],share[i],rating[i],alertBox[i])
            boxList.add(box)

        }

        recyclerView.adapter = BoxAdapter(boxList)

    }
}
