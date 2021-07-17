package com.test.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.myapplication.databinding.ListItemsBinding
import com.test.myapplication.model.Affirmation

class ItemAdapter(private val context: Context,private val dataset: List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding:ListItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //val binding=ListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val binding=ListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item=dataset[position]
//        holder.binding.itemTitle.text=context.resources.getString(item.stringResourceId)

        with(holder){
            with(dataset[position]){
                binding.itemTitle.text = context.resources.getString(this.stringResourceId)
                binding.itemImage.setImageResource(this.imageResourceId)
                //binding.tvExp.text = this.exp
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}