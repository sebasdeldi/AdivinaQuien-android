package com.sebasdeldihotmail.adivinaquien;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Esta clase contiene un menú de personajes, cada personaje se puede precionar para ir a una vista
 * ampliada de el mismo para poder ver mejor sus caracteristicas.
 *
 * También tiene un botón que lleva a la Actividad donde están las preguntas.
 */


public class MenuPersonajes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.menu_personajes);


        ImageButton btn = (ImageButton)findViewById(R.id.juanBoton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, JuanAmp.class));



            }
        });





        ImageButton btn2 = (ImageButton)findViewById(R.id.leoBoton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, LeoAmp.class));



            }
        });



        ImageButton btn3 = (ImageButton)findViewById(R.id.carlosBoton);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPersonajes.this, CarlosAmp.class));






            }


        });


        ImageButton btn4 = (ImageButton)findViewById(R.id.mateoBoton);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, MateoAmp.class));



            }
        });

        ImageButton btn5 = (ImageButton)findViewById(R.id.pedroBoton);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, PedroAmp.class));



            }
        });




        ImageButton btn6 = (ImageButton)findViewById(R.id.miguelBoton);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, MiguelAmp.class));



            }
        });



        ImageButton btn7 = (ImageButton)findViewById(R.id.catBoton);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, CatAmp.class));



            }
        });




        ImageButton btn8 = (ImageButton)findViewById(R.id.jimeBoton);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, JimeAmp.class));



            }
        });



        ImageButton btn9 = (ImageButton)findViewById(R.id.sarahBoton);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, SarahAmp.class));



            }
        });



        ImageButton btn10 = (ImageButton)findViewById(R.id.juanaBoton);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, JuanaAmp.class));



            }
        });



        ImageButton btn11 = (ImageButton)findViewById(R.id.valeBoton);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPersonajes.this, ValeAmp.class));



            }
        });


        ImageButton btn12 = (ImageButton)findViewById(R.id.mariaBoton);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, MariaAmp.class));



            }
        });


        Button btnInicio = (Button)findViewById(R.id.button2);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuPersonajes.this, Preguntas.class));


            }
        });


    }







}
