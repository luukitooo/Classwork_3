package com.example.classwork_3

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classwork_3.databinding.PreferenceItemBinding

class PreferenceAdapter : RecyclerView.Adapter<PreferenceAdapter.PreferenceViewHolder>() {

    class PreferenceViewHolder(val binding: PreferenceItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PreferenceViewHolder(
        PreferenceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PreferenceViewHolder, position: Int) {
        setData(holder, position)
    }

    private fun setData(holder: PreferenceViewHolder, position: Int) {
        val preference = PreferencesList.preferencesList[holder.adapterPosition]
        holder.binding.apply {
            prefImage.setImageResource(preference.icon)
            prefTitle.text = preference.text
            prefHint.text = preference.hint

            if (holder.adapterPosition == PreferencesList.preferencesList.lastIndex) {
                root.removeView(prefArrow)
                root.removeView(prefSwitch)
                prefImage.setColorFilter(Color.RED)
                prefTitle.setTextColor(Color.RED)
            }

            if (preference.isSwitch) {
                prefSwitch.visibility = View.VISIBLE
                root.removeView(prefArrow)
            } else {
                root.removeView(prefSwitch)
            }
        }
    }

    override fun getItemCount() = PreferencesList.preferencesList.size

}