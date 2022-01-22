package com.mrz.saskonline.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mrz.saskonline.ui.home.homework.HomeworkFragment
import com.mrz.saskonline.ui.home.schedule.ScheduleFragment
import com.mrz.saskonline.ui.home.weather.WeatherFragment

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> ScheduleFragment()
            2 -> WeatherFragment()
            else -> HomeworkFragment()
        }
    }
}