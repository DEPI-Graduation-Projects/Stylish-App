package com.example.stylish.ui.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.stylish.R
import com.example.stylish.data.models.Product
import com.example.stylish.databinding.FragmentProductsBinding
import com.example.stylish.ui.main.adapter.ProductAdapter
import com.example.stylish.ui.main.view_model.MainViewModel

class ProductsFragment : Fragment() , ProductAdapter.ProductClickListner{

    lateinit var binding: FragmentProductsBinding
    var product: MutableList<Product> = mutableListOf()
    lateinit var productAdapter: ProductAdapter
    private val viewModel: MainViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsBinding.inflate(inflater, container, false)

        binding.rvProducts.adapter = productAdapter
        val gridLayoutManager = GridLayoutManager(context, 2)
        binding.rvProducts.layoutManager = gridLayoutManager

        return binding.root
    }

    override fun onProductClick(product: Product) {
        //TODO: go to product details
    }

    override fun onResume() {
        super.onResume()
        viewModel.getProducts().observe(this, Observer { products ->
            products?.let {
                productAdapter.submitList(it)
            }
        })
    }
}