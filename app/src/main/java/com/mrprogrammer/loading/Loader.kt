package com.mrprogrammer.loading

import android.app.Dialog
import android.content.Context
import android.view.ViewGroup

import com.airbnb.lottie.LottieAnimationView

class Loader(var context: Context,var rawRes : Int) {

    private val dialog = Dialog(context)
    var lottie=LottieAnimationView(context);

    fun show() {
        dialog.setContentView(R.layout.dialog_layout);

        lottie=dialog.findViewById(R.id.lotti);
        lottie.setAnimation(rawRes)

        dialog.window?.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent);
        if (!dialog.isShowing)
            dialog.show();
    }


    fun dismiss() {
        if (dialog.isShowing)
            dialog.dismiss()
    }
}