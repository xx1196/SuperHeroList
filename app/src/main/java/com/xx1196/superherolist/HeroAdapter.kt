package com.xx1196.superherolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HeroAdapter(
    private val superHeroes: List<SuperHero>
) : RecyclerView.Adapter<HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return HeroHolder(layoutInflater.inflate(R.layout.item_super_hero, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        val item = superHeroes[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superHeroes.size
}
