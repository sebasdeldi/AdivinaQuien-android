package com.sebasdeldihotmail.adivinaquien;


import android.app.Activity;
import android.widget.Toast;

/**
 * Esta clase contiene atributos de los personajes y genera sus identificadores apartir de estos
 */

public class Personajes  {
    //declaración de variables
    private int genero;
    private int piel;
    private int cabello;
    private int vello;
    private int gafas;
    private int ojos;
    private int colorCabello;

    private String id;
    private int number;
    public final String nombre;

    /**
     * Crea un personaje
     * @param nombre Nombre del personaje
     * @param genero 1 si es hombre, 0 si es mujer
     * @param piel 1 si es clara, 0 si es oscura
     * @param cabello 1 si es largo, 0 corto
     * @param vello 1 si tiene, 0 si  no tiene
     * @param gafas 1 si tiene, 0 si no
     * @param ojos 1 si son claros, 0 si no
     * @param colorCabello 1 si es claro, 0 si es oscuro.
     */
    public Personajes(String nombre, int genero, int piel, int cabello, int vello, int gafas, int ojos, int colorCabello)
    {
        this.genero = genero;
        this.piel = piel;
        this.cabello = cabello;
        this.vello = vello;
        this.gafas = gafas;
        this.ojos = ojos;
        this.colorCabello = colorCabello;
        this.nombre = nombre;

        //se llama a la funcion que crea el id
        generateId();
    }

    //funcion que crea el id
    private void generateId()
    {
        //convierte a strings y los suma
        id = Integer.toString(genero) + Integer.toString(piel) + Integer.toString(cabello) + Integer.toString(vello) +
                Integer.toString(gafas) + Integer.toString(ojos) + Integer.toString(colorCabello);
        //convierte a int
        number = Integer.parseInt(id, 2);
    }


    //getters
    public String getId()
    {
        return id;
    }

    public int getNumber()
    {
        return number;
    }





}
