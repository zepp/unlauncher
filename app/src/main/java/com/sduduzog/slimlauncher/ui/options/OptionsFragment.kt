package com.sduduzog.slimlauncher.ui.options

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sduduzog.slimlauncher.R
import com.sduduzog.slimlauncher.ui.BaseFragment
import kotlinx.android.synthetic.main.options_fragment.*

class OptionsFragment : BaseFragment() {
    override fun getFragmentView(): View = options_fragment as View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.options_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        options_fragment_customise_apps.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_optionsFragment_to_customiseAppsFragment))
    }
}