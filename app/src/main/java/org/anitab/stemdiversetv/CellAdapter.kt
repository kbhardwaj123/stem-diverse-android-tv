package org.anitab.stemdiversetv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.anitab.stemdiversetv.databinding.CellItemBinding

class CellAdapter(private val dataset: ArrayList<CellViewModel>) :
    RecyclerView.Adapter<CellViewHolder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CellViewHolder {
        val cellItemBinding: CellItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.cell_item, parent, false
            )
        // set the view's size, margins, paddings and layout parameters
        return CellViewHolder(cellItemBinding)
    }

    override fun onBindViewHolder(holder: CellViewHolder, position: Int) {
        var videoData = dataset.get(position)
        holder.bind(videoData)
    }

    override fun getItemCount() = dataset.size
}



