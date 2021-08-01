package com.xx1196.superherolist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HeroHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(superHero: SuperHero) {
        view.findViewById<TextView>(R.id.tvRealName).text = superHero.realName
        view.findViewById<TextView>(R.id.tvSuperHeroName).text = superHero.name
        view.findViewById<TextView>(R.id.tvPublisher).text = superHero.publisher
        Picasso.get().load(superHero.image).into(view.findViewById<ImageView>(R.id.ivHero))
    }
}