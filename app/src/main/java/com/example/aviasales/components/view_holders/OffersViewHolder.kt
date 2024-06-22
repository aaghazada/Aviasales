package com.example.aviasales.components.view_holders

import com.example.aviasales.base.BaseViewHolder
import com.example.aviasales.databinding.ItemOffersViewBinding
import com.example.aviasales.model.remote.OffersModel

class OffersViewHolder(
    val binding: ItemOffersViewBinding,
    val onClick: (OffersModel) -> Unit
) :
    BaseViewHolder<OffersModel, ItemOffersViewBinding>(binding) {
    override fun bind(item: OffersModel) {
        binding.titleTextView.text = item.title
        binding.townTextView.text = item.town
        binding.valueTextView.text = item.price.value.toString()
        binding.root.setOnClickListener {
            onClick(item)
        }
    }
}