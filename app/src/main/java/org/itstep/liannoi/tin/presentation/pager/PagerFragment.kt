package org.itstep.liannoi.tin.presentation.pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import org.itstep.liannoi.tin.R

class PagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_pager, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupTabLayout()
    }

    ///////////////////////////////////////////////////////////////////////////
    // Helpers
    ///////////////////////////////////////////////////////////////////////////

    private fun setupTabLayout() {
        val tabLayout: TabLayout = requireView().findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(setupViewPager())
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_home)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_sport)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_update)
    }

    private fun setupViewPager(): ViewPager {
        val viewPager: ViewPager = requireView().findViewById(R.id.view_pager)

        fragmentManager?.also { manager ->
            PagerAdapter(requireContext(), manager).also { viewPager.adapter = it }
        }

        return viewPager
    }
}
