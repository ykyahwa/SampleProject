package com.ykyahwa.udemyartandroidapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ykyahwa.udemyartandroidapp.R
import com.ykyahwa.udemyartandroidapp.model.Animal
import com.ykyahwa.udemyartandroidapp.util.getProgressDrawable
import com.ykyahwa.udemyartandroidapp.util.loadImage
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
        holder.view.animalImage.loadImage(animalList[position].imageUrl, getProgressDrawable(holder.view.context))
        holder.view.animalLayout.setOnClickListener {
            val action = ListFragmentDirections.actionDetail(animalList[position])
            Navigation.findNavController(holder.view).navigate(action)


        }
    }

    class ANimalViewHolder(var view: View) : RecyclerView.ViewHolder(view)
}