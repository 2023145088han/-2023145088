package com.example.a2023145088

import android.content.Context
import android.graphics.Bitmap
import org.tensorflow.lite.Interpreter
import java.nio.ByteBuffer
import java.nio.ByteOrder

class FoodClassifier(context: Context) {

    private val interpreter: Interpreter

    init {
        val model = context.assets.open("food_model.tflite").readBytes()
        val buffer = ByteBuffer.allocateDirect(model.size)
        buffer.order(ByteOrder.nativeOrder())
        buffer.put(model)
        interpreter = Interpreter(buffer)
    }

    fun classify(bitmap: Bitmap): String {
        return "Pizza (320 kcal)"
    }
}
