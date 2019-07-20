package com.ucsdextandroid2.screennavigation.util

import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import com.ucsdextandroid2.screennavigation.listeners.OnClickAtIndexListener

/**
 * Created by rjaylward on 2019-07-19
 */
class PlaceholderDataGenerator(count: Int, private val viewBinder: PlaceholderViewBinder) {

    private val items = generate(count)

    val getItemCount: Int = items.size

    fun bindView(index: Int, view: View, clickListener: OnClickAtIndexListener?) {

        val profileView = findViewById<ImageView>(view, viewBinder.profileViewResId)
        val imageView = findViewById<View>(view, viewBinder.imageViewResId)
        val title = findViewById<TextView>(view, viewBinder.titleViewResId)
        val details = findViewById<TextView>(view, viewBinder.detailsViewResId)
        val longDetails = findViewById<TextView>(view, viewBinder.longDetailsViewResId)

        val indexView = findViewById<TextView>(view, viewBinder.indexViewResId)

        val item = items[index]

        profileView?.setImageDrawable(ColorDrawable(item.profileColor))
        imageView?.setBackgroundColor(item.imageColor)
        title?.text = item.title
        details?.text = item.details
        longDetails?.text = item.longDetails
        indexView?.text = index.toString()

        imageView?.setOnClickListener {
            clickListener?.onClickAtIndex(index)
        }

        view.setOnClickListener {
            clickListener?.onClickAtIndex(index)
        }
    }

    @NonNull
    fun <T : View> findViewById(view: View, @IdRes id: Int): T? {
        return if(id != 0) view.findViewById<T>(id) else null
    }

    private fun generate(count: Int): List<PlaceholderData> {
        val list = mutableListOf<PlaceholderData>()

        for(item in 0 until count) {
            list.add(
                PlaceholderData(
                    profileColor = ColorUtil.getRandomColor(),
                    imageColor = ColorUtil.getRandomColor(),
                    title = WordUtil.getRandomWord(5, 12),
                    details = WordUtil.getRandomSentence(2, 5),
                    longDetails = WordUtil.getRandomSentence(8, 15)
                )
            )
        }

        return list
    }

}

class PlaceholderViewBinder(
    val profileViewResId: Int = 0,
    val imageViewResId: Int = 0,
    val titleViewResId: Int = 0,
    val detailsViewResId: Int = 0,
    val longDetailsViewResId: Int = 0,
    val indexViewResId: Int = 0
)

class PlaceholderData(
    val profileColor: Int = 0,
    val imageColor: Int = 0,
    val title: String? = null,
    val details: String? = null,
    val longDetails: String? = null
)

