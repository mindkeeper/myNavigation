package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mynavigation.databinding.FragmentCategoryBinding
import com.example.mynavigation.databinding.FragmentHomeBinding


class CategoryFragment : Fragment() {
    private var _binding : FragmentCategoryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToLifestyle.setOnClickListener{
            Navigation.createNavigateOnClickListener(R.id.action_categoryFragment_to_detailCategoryFragment)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}