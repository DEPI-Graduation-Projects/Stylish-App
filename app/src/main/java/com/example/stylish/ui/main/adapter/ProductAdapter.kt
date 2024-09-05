package com.example.stylish.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.stylish.data.models.Product
import com.example.stylish.databinding.ItemProductBinding

class ProductAdapter(val data: List<Product>, val productClickListener: ProductClickListner): ListAdapter<Product, ProductAdapter.ProductViewHolder>(
    UserItemDiffCallback()) {

    interface ProductClickListner {
        fun onProductClick(product: Product)
    }

    class ProductViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object{
            fun from(parent: ViewGroup): ProductViewHolder{
                val layout = LayoutInflater.from(parent.context)
                val binding = ItemProductBinding.inflate(layout, parent, false)
                return ProductViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.binding.product = data[position]
        holder.binding.img.setImageResource(data.get(position).image)
        holder.binding.root.setOnClickListener {
            productClickListener.onProductClick(data.get(position))
        }
    }
}

class UserItemDiffCallback(): DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }

}

