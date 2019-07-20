package com.example.weather.presentation.master


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.weather.R
import com.google.android.material.tabs.TabLayout

class MasterWeatherFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    private val tabsIcons = arrayOf(R.drawable.sun, R.drawable.forceast)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_master_weather, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTabLayout(view)

        initViewPager(view)

        registerListeners()
    }


    private fun initTabLayout(view: View){
        tabLayout = view.findViewById(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.today_fragment_title)))
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.forecast_fragment_title)))

        tabLayout.getTabAt(0)?.setIcon(tabsIcons[0])
        tabLayout.getTabAt(1)?.setIcon(tabsIcons[1])

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

    }

    private fun initViewPager(view: View) {
        val adapter =
            WeatherPagerAdapter(requireFragmentManager(), tabLayout.tabCount)

        viewPager = view.findViewById(R.id.viewPager)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

    }
    private fun registerListeners(){

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }
}