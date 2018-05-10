package com.example.android.jci
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
//import android.widget.Toolbar
import android.support.v7.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private var mDrawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        mDrawerLayout = findViewById(R.id.drawer_layout)
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu)




        mDrawerLayout?.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                // Respond when the drawer's position changes
            }

            override fun onDrawerOpened(drawerView: View) {
                // Respond when the drawer is opened
            }

            override fun onDrawerClosed(drawerView: View) {
                // Respond when the drawer is closed
            }

            override fun onDrawerStateChanged(newState: Int) {
                // Respond when the drawer motion state changes
            }
        })

        val navigationView = findViewById<NavigationView>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { menuItem ->
            // set item as selected to persist highlight
            menuItem.isChecked = true
            // close drawer when item is tapped
            mDrawerLayout?.closeDrawers()



            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here
            val fragment = Base1Fragment()
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.activity_main_framelayout, fragment)
            ft.commit()

            true
        })
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                mDrawerLayout!!.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)

        /* switch(item.getItemId()) {
            case R.id.nav_camera:
                Intent intent = new Intent(this, Sample.class);
                this.startActivity(intent);
                break;
            case R.id.nav_gallery:
                Intent intent1 = new Intent(this, Sample.class);
                this.startActivity(intent1);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }*/


    }
}

/*
        // Find the view pager that will allow the user to swipe between fragments
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager

        // Create an adapter that knows which fragment should be shown on each page
        val adapter = SimpleFragmentPagerAdapter(supportFragmentManager,this@MainActivity)

        // Set the adapter onto the view pager
        viewPager.adapter = adapter

        val tabLayout = findViewById<View>(R.id.sliding_tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)*/







        /* // calling onClick() method
         val home = findViewById<View>(R.id.homebutton) as Button
         home.setOnClickListener(this)
         val mission = findViewById<View>(R.id.Missionbutton) as Button
         mission.setOnClickListener(this)
         val founder = findViewById<View>(R.id.foundersbutton) as Button
         founder.setOnClickListener(this)
         val vision = findViewById<View>(R.id.visionbutton) as Button
         vision.setOnClickListener(this)
         val creed = findViewById<View>(R.id.creedbutton) as Button
         creed.setOnClickListener(this)
         val theory = findViewById<View>(R.id.theorybutton) as Button
         theory.setOnClickListener(this)*/



  /*  override fun onClick(v: View) {
        // default method for handling onClick Events..
        when (v.id) {

            R.id.homebutton -> {
                // do your code
                val label1 = findViewById<View>(R.id.textview1) as TextView
                label1.text = getResources().getString(R.string.homelabel)
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.VISIBLE
                val desc2 = findViewById<View>(R.id.textview2) as TextView
                desc2.text = getResources().getString(R.string.home)
            }

            R.id.Missionbutton-> {
                // do your code
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label2 = findViewById<View>(R.id.textview1) as TextView
                label2.text=getResources().getString(R.string.missionlabel)
                val desc2 = findViewById<View>(R.id.textview2) as TextView
                desc2.text = getResources().getString(R.string.mission)
            }

            R.id.foundersbutton -> {
                // do your code
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label3 = findViewById<View>(R.id.textview1) as TextView
                label3.text = getResources().getString(R.string.founderslabel)
                val desc3 = findViewById<View>(R.id.textview2) as TextView
                desc3.text = getResources().getString(R.string.founders)
            }
            R.id.visionbutton -> {
                // do your code
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label4 = findViewById<View>(R.id.textview1) as TextView
                label4.text = getResources().getString(R.string.visionlabel)
                val desc4 = findViewById<View>(R.id.textview2) as TextView
                desc4.text = getResources().getString(R.string.vision)
            }
            R.id.creedbutton -> {
                // do your code
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label5 = findViewById<View>(R.id.textview1) as TextView
                label5.text = getResources().getString(R.string.creedlabel)
                val desc5 = findViewById<View>(R.id.textview2) as TextView
                desc5.text = getResources().getString(R.string.creed)
            }
            R.id.theorybutton -> {
                // do your code
                val imgView = findViewById<View>(R.id.homeimage) as? ImageView
                imgView?.visibility = View.INVISIBLE
                val label6 = findViewById<View>(R.id.textview1) as TextView
                label6.text = getResources().getString(R.string.theorylabel)
                val desc6 = findViewById<View>(R.id.textview2) as TextView
                desc6.text = getResources().getString(R.string.theory)
            }

            else -> {
                val output = findViewById<View>(R.id.textview1) as TextView
                output.text = "t"
            }
        }
*/


/*
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Context.MODE_PRIVATE



class MainActivity : AppCompatActivity() {



    */
/*private lateinit var FirstMessage:TextView*//*


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 */
/*       FirstMessage = this.findViewById<TextView>(R.id.FirstMessage)
        checkAppRun()*//*


    }
  */
/*  *//*
*/
/**for checking app run info wheather first tme or not*//*
*/
/*

    fun checkAppRun()
    {
        val sharedPreferences = baseContext.getSharedPreferences(
                "MyAppPreference", MODE_PRIVATE
        )
        val IsFirstRun = sharedPreferences.getBoolean("IsFirstRun", true)
        if (IsFirstRun) {
            FirstMessage.text = "App running first time"
            val editor = sharedPreferences.edit()
            editor.putBoolean("IsFirstRun", false)
            editor.commit()
        } else {
            FirstMessage.text = "App not running for first time"
        }

    }*//*

}*/
