package com.example.android.jci


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment(), View.OnClickListener {


    private  var homeView:View?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        /*return inflater.inflate(R.layout.fragment_home, container, false)*/
        homeView= inflater.inflate(R.layout.fragment_home, container, false)
        val home = homeView?.findViewById<View>(R.id.homebutton) as Button
        home.setOnClickListener(this)
        val mission = homeView?.findViewById<View>(R.id.Missionbutton) as Button
        mission.setOnClickListener(this)
        val founder = homeView?.findViewById<View>(R.id.foundersbutton) as Button
        founder.setOnClickListener(this)
        val vision = homeView?.findViewById<View>(R.id.visionbutton) as Button
        vision.setOnClickListener(this)
        val creed = homeView?.findViewById<View>(R.id.creedbutton) as Button
        creed.setOnClickListener(this)
        val theory = homeView?.findViewById<View>(R.id.theorybutton) as Button
        theory.setOnClickListener(this)
        return homeView
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.homebutton -> {
                // do your code
                val label1 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label1.text = getResources().getString(R.string.homelabel)
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.VISIBLE
                val desc2 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc2.text = getResources().getString(R.string.home)
            }

            R.id.Missionbutton-> {
                // do your code
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label2 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label2.text=getResources().getString(R.string.missionlabel)
                val desc2 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc2.text = getResources().getString(R.string.mission)
            }

            R.id.foundersbutton -> {
                // do your code
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label3 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label3.text = getResources().getString(R.string.founderslabel)
                val desc3 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc3.text = getResources().getString(R.string.founders)
            }
            R.id.visionbutton -> {
                // do your code
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label4 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label4.text = getResources().getString(R.string.visionlabel)
                val desc4 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc4.text = getResources().getString(R.string.vision)
            }
            R.id.creedbutton -> {
                // do your code
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label5 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label5.text = getResources().getString(R.string.creedlabel)
                val desc5 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc5.text = getResources().getString(R.string.creed)
            }
            R.id.theorybutton -> {
                // do your code
                val imgView = homeView?.findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label6 = homeView?.findViewById<View>(R.id.textview1) as TextView
                label6.text = getResources().getString(R.string.theorylabel)
                val desc6 = homeView?.findViewById<View>(R.id.textview2) as TextView
                desc6.text = getResources().getString(R.string.theory)
            }

            else -> {
                val output = homeView?.findViewById<View>(R.id.textview1) as TextView
                output.text = "t"
            }
        }

    }

}
