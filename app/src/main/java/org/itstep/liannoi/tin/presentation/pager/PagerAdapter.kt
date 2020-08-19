package org.itstep.liannoi.tin.presentation.pager

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.itstep.liannoi.tin.R
import org.itstep.liannoi.tin.presentation.main.MainFragment

class PagerAdapter constructor(
    private val context: Context,
    private val manager: FragmentManager
) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList: List<Fragment> = listOf<Fragment>(
        MainFragment(),
        MainFragment(),
        MainFragment()
    )

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence =
        context.resources.getStringArray(R.array.tabs_titles)[position]
}
