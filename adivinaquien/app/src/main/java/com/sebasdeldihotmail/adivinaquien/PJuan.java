package com.sebasdeldihotmail.adivinaquien;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;


public class PJuan extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.tu_personaje_es_juan);

        ImageView gif = (ImageView)findViewById(R.id.gif_juan);

        Ion.with(gif).load("android.resource://com.sebasdeldihotmail.adivinaquien/" + R.drawable.gifjuan);
    }
}
