package org.anitab.stemdiversetv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import org.anitab.stemdiversetv.databinding.ComponentItemBinding

class ComponentViewHolder(componentItemBinding: ComponentItemBinding) :
    RecyclerView.ViewHolder(componentItemBinding.root) {
    var cellItemBinding: ComponentItemBinding = componentItemBinding
    fun bind(obj: ComponentViewModel) {
        cellItemBinding.componentViewModel = obj
//        cellItemBinding.executePendingBindings()
    }

}
//
//class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.PageViewHolder>() {
//    val eventList = listOf("0", "1", "2")
//
//    // Layout "layout_demo_viewpager2_cell.xml" will be defined later
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
//        PageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false))
//
//    override fun getItemCount() = eventList.count()
//    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
//        (holder.view as? TextView)?.also{
//            it.text = "Page " + eventList.get(position)
//
//            val backgroundColorResId = if (position % 2 == 0) R.color.lb_playback_progress_secondary_color_no_theme else R.color.lb_error_background_color_opaque)
//            it.setBackgroundColor(ContextCompat.getColor(it.context, backgroundColorResId))
//        }
//    }
//
//    class PageViewHolder(val view: View) : RecyclerView.ViewHolder(view)
//}