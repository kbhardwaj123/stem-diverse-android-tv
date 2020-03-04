package org.anitab.stemdiversetv

import androidx.recyclerview.widget.RecyclerView
import org.anitab.stemdiversetv.databinding.CellItemBinding

class CellViewHolder(cellItemBinding: CellItemBinding) :
    RecyclerView.ViewHolder(cellItemBinding.root) {
    var cellItemBinding: CellItemBinding = cellItemBinding
    fun bind(obj: CellViewModel) {
        cellItemBinding.cellViewModel = obj
//        cellItemBinding.executePendingBindings()
    }
}

