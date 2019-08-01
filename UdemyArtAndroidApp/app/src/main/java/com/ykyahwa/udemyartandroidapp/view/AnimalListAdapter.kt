package com.ykyahwa.udemyartandroidapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ykyahwa.udemyartandroidapp.R
import com.ykyahwa.udemyartandroidapp.model.Animal
import kotlinx.android.synthetic.main.item_animal.view.*

class AnimalListAdapter(private val animalList: ArrayList<Animal>) :
    RecyclerView.Adapter<AnimalListAdapter.ANimalViewHolder>(){

    fun updateAnimalList(newAnimalList: List<Animal>) {
        animalList.clear()
        animalList.addAll(newAnimalList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ANimalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_animal, parent, false)
        return ANimalViewHolder(view)
    }

    override fun getItemCount()= animalList.size

    override fun onBindViewHolder(holder: ANimalViewHolder, position: Int) {
        holder.view.animalName.text = animalList[position].name
    }

    class ANimalViewHolder(var view: View) : RecyclerView.ViewHolder(view)
}