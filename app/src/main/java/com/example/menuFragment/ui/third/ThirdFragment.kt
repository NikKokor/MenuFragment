package com.example.menuFragment.ui.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.menuFragment.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var thirdViewModel: ThirdViewModel
    private var _binding: FragmentThirdBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        thirdViewModel =
            ViewModelProvider(this).get(ThirdViewModel::class.java)

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textThird
        thirdViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}