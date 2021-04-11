package com.amirhusseinsoori.mvvmRoomCleanArc.ui.tasks

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirhusseinsoori.mvvmRoomCleanArc.R
import com.amirhusseinsoori.mvvmRoomCleanArc.databinding.FragmentTasksBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class TasksFragment : Fragment(R.layout.fragment_tasks) {
    lateinit var binding: FragmentTasksBinding
    lateinit var taskAdapter: TasksAdapter


    private val viewModel: TasksViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentTasksBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        taskAdapter = TasksAdapter()



        binding.apply {
            recyclerViewTasks.apply {
                adapter = taskAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }
        lifecycleScope.launchWhenStarted {
            viewModel.tasks.collect {
                taskAdapter.submitList(it)
            }
        }

    }
}
