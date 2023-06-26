package com.act.code.generate

import com.act.code.Config
import com.act.code.FileUtils.listPackage
import com.act.code.tools.generateFunName
import com.act.code.tools.generateLayoutId

object GenerateLayoutFun {

    private fun generateView(): String {
        return "<View android:id=\"@+id/view_${generateLayoutId()}\" android:layout_width=\"${(0..400).random()}dp\" android:layout_height=\"${(0..400).random()}dp\" android:layout_centerHorizontal=\"true\" android:layout_marginTop=\"${(0..400).random()}dp\" />"
    }

    private fun generateTextView(): String {
        return "<TextView android:id=\"@+id/text_view_${generateLayoutId()}\" android:layout_centerVertical=\"true\" android:layout_centerHorizontal=\"true\" android:layout_width=\"wrap_content\" android:layout_height=\"wrap_content\" android:text=\"${generateFunName()}\" android:textColor=\"#ffffff\" android:textSize=\"18dp\" />"
    }

    private fun generateButtonView(): String {
        return "<Button android:id=\"@+id/betting_${generateLayoutId()}\" android:layout_width=\"140dp\"  android:text=\"${generateLayoutId()}\"  android:layout_height=\"50dp\" android:layout_alignParentBottom=\"true\" android:layout_marginEnd=\"40dp\" android:layout_alignParentEnd=\"true\"/>"
    }

    private fun generateImageView(): String {
        return "<ImageView android:id=\"@+id/iv_${generateLayoutId()}\"  android:layout_width=\"wrap_content\" android:layout_height=\"wrap_content\" android:layout_marginBottom=\"${(0..400).random()}dp\" android:src=\"@null\" android:visibility=\"gone\" />"
    }


    fun generateRelativeLayoutView(): String {
        val buffer = StringBuffer()
        buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
        buffer.append("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\" xmlns:app=\"http://schemas.android.com/apk/res-auto\" android:id=\"@+id/center\" android:layout_width=\"match_parent\" android:layout_height=\"match_parent\"> \n")

        repeat((3..8).random()) {
            val str = when ((0..3).random()) {
                0 -> generateView()
                1 -> generateTextView()
                2 -> generateButtonView()
                3 -> generateImageView()
                else -> ""
            }
            buffer.append(str).append("\n")
        }
        buffer.append(" </RelativeLayout>")

        return buffer.toString()
    }


    fun generateLinerLayoutView(): String {
        val buffer = StringBuffer()
        buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
        buffer.append("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  android:orientation=\"vertical\" xmlns:app=\"http://schemas.android.com/apk/res-auto\" android:id=\"@+id/center\" android:layout_width=\"match_parent\" android:layout_height=\"match_parent\"> \n")

        repeat((3..8).random()) {
            val str = when ((0..3).random()) {
                0 -> generateView()
                1 -> generateTextView()
                2 -> generateButtonView()
                3 -> generateImageView()
                else -> ""
            }
            buffer.append(str).append("\n")
        }
        buffer.append(" </RelativeLayout>")

        return buffer.toString()
    }


}