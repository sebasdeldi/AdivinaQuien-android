package com.sebasdeldihotmail.adivinaquien;

/**
 * contiene el nodo y su asignación
 */

public class Nodo
{
    public final Personajes personaje;
    public Nodo left;
    public Nodo right;

    public Nodo(Personajes personaje)
    {
        this.personaje = personaje;
    }

    public Personajes getPersonaje()
    {
        return personaje;
    }
}
