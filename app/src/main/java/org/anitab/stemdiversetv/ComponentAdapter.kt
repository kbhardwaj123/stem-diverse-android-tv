package org.anitab.stemdiversetv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.anitab.stemdiversetv.databinding.ComponentItemBinding

class ComponentAdapter(private val dataset: ArrayList<ComponentViewModel>) :
    RecyclerView.Adapter<ComponentViewHolder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComponentViewHolder {
        val componentItemBinding: ComponentItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.component_item, parent, false
            )
        // set the view's size, margins, paddings and layout parameters
        return ComponentViewHolder(componentItemBinding)
    }

    override fun onBindViewHolder(holder: ComponentViewHolder, position: Int) {
        var videoData = dataset.get(position)
        holder.bind(videoData)
    }

    override fun getItemCount() = dataset.size
}
