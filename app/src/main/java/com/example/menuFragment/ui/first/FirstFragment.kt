package com.example.menuFragment.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.menuFragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var firstViewModel: FirstViewModel
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        firstViewModel =
            ViewModelProvider(this).get(FirstViewModel::class.java)

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFirst
        firstViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}