package com.dino.library.dinorecyclerview

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.DiffUtil

open class DinoListAdapter(
    @LayoutRes private val layoutRes: Int,
    diffCallback: DiffUtil.ItemCallback<Any>
) : androidx.recyclerview.widget.ListAdapter<Any, DinoViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DinoViewHolder(layoutRes = layoutRes, parent = parent)

    override fun onBindViewHolder(holderDino: DinoViewHolder, position: Int) =
        holderDino.onBindViewHolder(getItem(position))
}