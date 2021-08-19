package com.gunder.bluetoothtoogle

import android.bluetooth.BluetoothAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBt = findViewById<Button>(R.id.btnBt)
        val tvBt = findViewById<TextView>(R.id.tvBt)

        val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
//        on click
        btnBt.setOnClickListener {
            if (mBluetoothAdapter.isEnabled) {
                mBluetoothAdapter.disable()
                tvBt.text = "Bluetooth is OFF"
            } else {
                mBluetoothAdapter.enable()
                tvBt.text = "Bluetooth is ON"
            }
        }
    }
}