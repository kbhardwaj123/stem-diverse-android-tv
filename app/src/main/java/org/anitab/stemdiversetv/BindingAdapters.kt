package org.anitab.stemdiversetv

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


@BindingAdapter("bind:cellAdapter")
fun RecyclerView.setCellAdapter(content: ArrayList<CellViewModel>) {

    var viewManager = LinearLayoutManager(
        this.context,
        LinearLayoutManager.HORIZONTAL,
        false
    )
    var viewAdapter = CellAdapter(content)

    this.setHasFixedSize(true)
    this.layoutManager = viewManager
    this.adapter = viewAdapter
}

@BindingAdapter("bind:componentAdapter")
fun RecyclerView.setComponentAdapter(content: ArrayList<ComponentViewModel>) {

    var viewManager = LinearLayoutManager(
        this.context,
        LinearLayoutManager.VERTICAL,
        false
    )
    var viewAdapter = ComponentAdapter(content)

    this.setHasFixedSize(true)
    this.layoutManager = viewManager
    this.adapter = viewAdapter
}
