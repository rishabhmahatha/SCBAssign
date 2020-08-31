package com.app.scbassigment.ui.personaldetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.app.scbassigment.R
import com.app.scbassigment.databinding.FragmentPersonalDetailsBinding
import com.app.scbassigment.ui.MainActivity
import com.app.scbassigment.ui.professionaldetails.ProfessionalDetailsFragment
import com.app.scbassigment.utils.CommonUtils
import com.app.scbassigment.utils.getCustomView
import com.app.scbassigment.utils.snackbar
import kotlinx.android.synthetic.main.fragment_personal_details.*

class PersonalDetailsFragment : Fragment(), PersonalDetailsListener {

    private var viewModel: PersonalDetailsViewModel? = null

    private var hashMap = LinkedHashMap<String, String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding: FragmentPersonalDetailsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_personal_details, container, false)
        viewModel =
            ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application)
                .create(PersonalDetailsViewModel::class.java)
        dataBinding.personalDetailsViewModel = viewModel
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel?.firstFormListener = this
        viewModel?.errorLiveData?.observe(requireActivity(), Observer {
            if (it.isBlank()) {
                (requireActivity() as MainActivity).hmUserDetails.putAll(hashMap)
                CommonUtils.addFragment(
                    requireActivity() as AppCompatActivity,
                    R.id.flContainer,
                    this,
                    ProfessionalDetailsFragment(),
                    false
                )
            } else {
                view.snackbar(it)
            }
        })
        inflateDynamicUi()
    }

    private fun inflateDynamicUi() {
        val firstForm = viewModel?.getDynamicView()
        for (element in firstForm!!) {
            llParent.addView(context?.getCustomView(element))
        }
    }


    override fun onNextClick() {
        hashMap = CommonUtils.getHashMapOfData(llParent)
        viewModel?.hashMap = hashMap
    }
}