package com.example.aviasales.ui.aviabilets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aviasales.base.BaseFragment
import com.example.aviasales.components.adapters.OffersAdapter
import com.example.aviasales.databinding.FragmentAviabiletsBinding
import com.example.aviasales.view_model.OffersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AviabiletsFragment :
    BaseFragment<FragmentAviabiletsBinding>(FragmentAviabiletsBinding::inflate) {

    private lateinit var offersAdapter: OffersAdapter
    private val offersViewModel: OffersViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        offersAdapter = OffersAdapter { offer ->
        }
        initView()
        observeViewModel()
    }

    private fun initView() {
        binding.recyclerViewOffers.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        binding.recyclerViewOffers.adapter = offersAdapter
    }

    private fun observeViewModel() {
        offersViewModel.offersData.observe(viewLifecycleOwner, { offersList ->
            offersAdapter.setData(offersList)
        })
    }
}