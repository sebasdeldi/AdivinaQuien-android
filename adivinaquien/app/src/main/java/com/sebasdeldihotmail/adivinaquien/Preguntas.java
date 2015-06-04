package com.sebasdeldihotmail.adivinaquien;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * En esta clase ocurren varias cosas:
 *
 *1) se crean los personajes con los valores de sus atributos.
 * 2)se insertan en el arbol
 * 3)se hace que cada una de las selecciones de los radio buttoms manden 1 o 0 a una bariable
 * 4)estas variables se convierten a String y se genera un solo String
 * 5) se convierte el String a int
 * 6)se llama la funcion search de la clase Arbol y se le pasa como parametro el int generado en el punto 5
 * 7) se saca un cuadrito de texto con el nombre de el encontrado
 * 8) dependiendo de el atributo nombre de el personaje que se haya seleccionado, se abre una acividad
 * mostrando cual fue el personaje y el recorrido que se hizo en el arbol para encontrarlo.
 *
 */

public class Preguntas extends Activity{

//declaración de variables usadas
    private static RadioGroup genero,piel,gafas,ojos,cabello,colorcabello,vello;
    private static RadioButton sgenero,sgafas,spiel,sojos,scabello,scolorcabello,svello;
    private static Button boton;
    public static String idSeleccion;
    public int bingenero,binpiel,bingafas,binojos,bincabello,bincolorcabello,binvello;
    Arbol personajes;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // se liga a la apariencia gráfica (archivo xmls)
        setContentView(R.layout.preguntas);

    //1) se crean los personajes con los valores de sus atributos.


    Personajes carlos = new Personajes("Carlos", 1, 1, 0, 0, 0, 0, 1);
    Personajes cat = new Personajes("Cat", 0, 1, 1, 0, 1, 1, 1);
    Personajes jime = new Personajes("Jime", 0, 0, 0, 0, 1, 0, 1);
    Personajes juan = new Personajes("Juan", 1, 0, 1, 1, 0, 1, 0);
    Personajes juana = new Personajes("Juana", 0, 1, 0, 0, 1, 0, 0);
    Personajes leo = new Personajes("Leo", 1, 1, 1, 0, 0, 0, 0);
    Personajes maria = new Personajes("Maria", 0, 1, 1, 0, 0, 1, 0);
    Personajes mateo = new Personajes("Mateo", 1, 0, 1, 0, 1, 0, 0);
    Personajes miguel = new Personajes("Miguel", 1, 1, 1, 0, 1, 0, 0);
    Personajes pedro = new Personajes("Pedro", 1, 1, 1, 1, 1, 1, 1);
    Personajes sarah = new Personajes("Sarah", 0, 0, 0, 0, 0, 0, 0);
    Personajes vale = new Personajes("Vale", 0, 0, 1, 0, 0, 1, 0);



    // * 2)se insertan en el arbol

    personajes = new Arbol();
    personajes.insert(carlos);
    personajes.insert(cat);
    personajes.insert(juan);
    personajes.insert(jime);
    personajes.insert(juana);
    personajes.insert(leo);
    personajes.insert(maria);
    personajes.insert(mateo);
    personajes.insert(miguel);
    personajes.insert(pedro);
    personajes.insert(sarah);
    personajes.insert(vale);

        onClickListenerButton();



    }

    public void onClickListenerButton (){

        //inicializacion de los radios buttoms, radio groups y el boton
        genero = (RadioGroup)findViewById(R.id.genero);
        boton = (Button) findViewById(R.id.button);
        piel = (RadioGroup)findViewById(R.id.piel);
        gafas = (RadioGroup)findViewById(R.id.gafas);
        ojos = (RadioGroup)findViewById(R.id.colorojos);
        cabello = (RadioGroup)findViewById(R.id.cabello);
        colorcabello = (RadioGroup)findViewById(R.id.colorcabello);
        vello = (RadioGroup)findViewById(R.id.vellofacial);

        boton.setOnClickListener(

                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        //Implementación de los radio buttoms

                        int seleccionGenero = genero.getCheckedRadioButtonId();
                        sgenero = (RadioButton) findViewById(seleccionGenero);

                        int seleccionPiel = piel.getCheckedRadioButtonId();
                        spiel = (RadioButton) findViewById(seleccionPiel);

                        int seleccionGafas = gafas.getCheckedRadioButtonId();
                        sgafas = (RadioButton) findViewById(seleccionGafas);

                        int seleccionOjos = ojos.getCheckedRadioButtonId();
                        sojos = (RadioButton) findViewById(seleccionOjos);

                        int seleccionCabello = cabello.getCheckedRadioButtonId();
                        scabello = (RadioButton) findViewById(seleccionCabello);

                        int seleccionColorCabello = colorcabello.getCheckedRadioButtonId();
                        scolorcabello = (RadioButton) findViewById(seleccionColorCabello);

                        int seleccionVello = vello.getCheckedRadioButtonId();
                        svello = (RadioButton) findViewById(seleccionVello);

                        // * 3)se hace que cada una de las selecciones de los radio buttoms manden 1 o 0 a una bariable

                        if (sgenero.getText().toString().equals("MASCULINO")) {
                            bingenero = 1;
                        }
                        else
                            bingenero = 0;


                        if (spiel.getText().toString().equals("CLARA")) {
                            binpiel = 1;
                        }
                        else
                            binpiel = 0;


                        if (sgafas.getText().toString().equals("SI")) {
                            bingafas = 1;
                        }
                        else
                            bingafas = 0;


                        if (sojos.getText().toString().equals("CLAROS")) {
                            binojos = 1;
                        }
                        else
                            binojos = 0;

                        if (scabello.getText().toString().equals("LARGO (F) / NO CALVO (M)")) {
                            bincabello = 1;
                        }
                        else
                            bincabello = 0;

                        if (scolorcabello.getText().toString().equals("CLARO")) {
                            bincolorcabello = 1;
                        }
                        else
                            bincolorcabello = 0;


                        if (svello.getText().toString().equals("SI")) {
                            binvello = 1;
                        }
                        else
                            binvello = 0;

                        // * 4)estas variables se convierten a String y se genera un solo String

                        idSeleccion = Integer.toString(bingenero) + Integer.toString(binpiel) + Integer.toString(bincabello) + Integer.toString(binvello) +
                                Integer.toString(bingafas) + Integer.toString(binojos) + Integer.toString(bincolorcabello);

                        // * 5) se convierte el String a int

                        int idNum = Integer.parseInt(idSeleccion,2);



                        // * 6)se llama la funcion search de la clase Arbol y se le pasa como parametro el int generado en el punto 5

                        Personajes respuesta = personajes.search(idNum);

                        // * 7) se saca un cuadrito de texto con el nombre de el encontrado

                        Toast.makeText(Preguntas.this,respuesta.nombre , Toast.LENGTH_LONG).show();




                        //* 8) dependiendo de el atributo nombre de el personaje que se haya seleccionado, se abre una acividad
                         //mostrando cual fue el personaje y el recorrido que se hizo en el arbol para encontrarlo.

                        if (respuesta.nombre.equals("Carlos")){
                            startActivity(new Intent(Preguntas.this, PCarlos.class));

                        }

                        else if (respuesta.nombre.equals("Cat")){
                            startActivity(new Intent(Preguntas.this, PCat.class));

                        }

                        else if (respuesta.nombre.equals("Jime")){
                            startActivity(new Intent(Preguntas.this, PJime.class));

                        }


                        else if (respuesta.nombre.equals("Juan")){
                            startActivity(new Intent(Preguntas.this, PJuan.class));

                        }


                        else if (respuesta.nombre.equals("Juana")){
                            startActivity(new Intent(Preguntas.this, PJuana.class));

                        }


                        else if (respuesta.nombre.equals("Leo")){
                            startActivity(new Intent(Preguntas.this, PLeo.class));

                        }


                        else if (respuesta.nombre.equals("Maria")){
                            startActivity(new Intent(Preguntas.this, PMaria.class));

                        }


                        else if (respuesta.nombre.equals("Mateo")){
                            startActivity(new Intent(Preguntas.this, PMateo.class));

                        }


                        else if (respuesta.nombre.equals("Miguel")){
                            startActivity(new Intent(Preguntas.this, PMiguel.class));

                        }


                        else if (respuesta.nombre.equals("Pedro")){
                            startActivity(new Intent(Preguntas.this, PPedro.class));

                        }


                        else if (respuesta.nombre.equals("Sarah")){
                            startActivity(new Intent(Preguntas.this, PSarah.class));

                        }


                        else if (respuesta.nombre.equals("Vale")){
                            startActivity(new Intent(Preguntas.this, PVale.class));

                        }

                        else {

                            Toast.makeText(Preguntas.this, "Las caracteristicas no coinciden con ningún personaje", Toast.LENGTH_LONG).show();
                        }


                    }

                }
        );







    }
}
