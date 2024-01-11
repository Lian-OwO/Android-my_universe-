package com.my_universe_busantour.recycler

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.my_universe_busantour.ReserveslidePage01
import com.my_universe_busantour.ReserveslidePage02
import com.my_universe_busantour.ReserveslidePage03

class ReserveslideAdapter1 (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ReserveslidePage01()
            1 -> ReserveslidePage02()
            else -> ReserveslidePage03()
        }
    }
}