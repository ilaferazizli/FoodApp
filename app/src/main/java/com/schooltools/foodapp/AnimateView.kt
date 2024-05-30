package com.schooltools.foodapp

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import com.schooltools.foodapp.R

class AnimateView {
    fun animateButton(view: View, context: Context) {
        val scalePressed= AnimationUtils.loadAnimation(context, R.anim.scale_pressed_anim)
        val scaleUnpressed= AnimationUtils.loadAnimation(context, R.anim.scale_unpressed_anim)
        view.startAnimation(scalePressed)
        view.startAnimation(scaleUnpressed)
    }
}