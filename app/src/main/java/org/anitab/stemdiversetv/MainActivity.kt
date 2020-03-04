/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.anitab.stemdiversetv

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.anitab.stemdiversetv.databinding.ActivityMainBinding


class MainActivity : Activity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    var videoData = arrayListOf(CellViewModel("one title", "one"), CellViewModel("two title", "two"),CellViewModel("three title", "three"), CellViewModel("four title", "four"),CellViewModel("five title", "five"), CellViewModel("six title", "six"))
    var componentsData = arrayListOf(ComponentViewModel("header 1",videoData), ComponentViewModel("header 2",videoData))
    var pageData = PageViewModel("first page", componentsData)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main)
        binding.pageViewModel = pageData
//        setContentView(R.layout.activity_main)
//        viewManager = LinearLayoutManager(
//            this,
//            LinearLayoutManager.VERTICAL,
//            false
//        )
//        viewAdapter = ComponentAdapter(componentsData)
//
//        recyclerView = findViewById<RecyclerView>(R.id.components_list).apply {
//            setHasFixedSize(true)
//            layoutManager = viewManager
//            adapter = viewAdapter
//
//        }
//        viewManager = LinearLayoutManager(
//            this,
//            LinearLayoutManager.HORIZONTAL,
//            false
//        )
//        viewAdapter = CellAdapter(videoData)
//
//        recyclerView = findViewById<RecyclerView>(R.id.components_list).apply {
//            setHasFixedSize(true)
//            layoutManager = viewManager
//            adapter = viewAdapter
//
//        }
    }
}

