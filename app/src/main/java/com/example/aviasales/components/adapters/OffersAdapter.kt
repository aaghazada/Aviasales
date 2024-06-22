package com.example.aviasales.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.aviasales.base.BaseRecyclerAdapter
import com.example.aviasales.components.view_holders.OffersViewHolder
import com.example.aviasales.databinding.ItemOffersViewBinding
import com.example.aviasales.model.remote.OffersModel

class OffersAdapter(val OnClick: (OffersModel) -> Unit) :
    BaseRecyclerAdapter<OffersModel, ItemOffersViewBinding, OffersViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemOffersViewBinding {
        return ItemOffersViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(binding: ItemOffersViewBinding, viewType: Int): OffersViewHolder {
        return OffersViewHolder(binding, OnClick)
    }
}