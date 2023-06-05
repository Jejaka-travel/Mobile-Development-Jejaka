package com.jejaka.jejaka_app.ui.detail_place

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jejaka.jejaka_app.R
import com.jejaka.jejaka_app.databinding.FragmentDetailPlaceBinding

class DetailPlaceFragment : Fragment() {

    private var _binding: FragmentDetailPlaceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailPlaceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager = parentFragmentManager

        binding.btnMoreInfo.setOnClickListener {
            val aboutPlaceFragment = AboutPlaceFragment()
            fragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, aboutPlaceFragment, AboutPlaceFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

}