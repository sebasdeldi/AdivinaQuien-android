package com.sebasdeldihotmail.adivinaquien;


/**
 * Esta clase crea el arbol, de modo que cuando se inserta un nuevo personaje, dependiendo de el valor de su id
 * lo ubica a la derecha si es mayor o a la izquierda si es menor que el nodo padre o raíz.
 *
 * tambíen tiene el metodo de busqueda que toma el id de el nodo actual y compara si es el mismo id de el personaje
 * que se busca, sino mira si es mayor o menor para ver que ruta tomar.
 */

public class Arbol
{

    private Nodo root;

    private void insert_(Nodo current, Nodo nodo)
    {
        //si no hay raiz, el nodo que se incerta es la nueva raiz
        if(root == null){
            root = nodo;
            return;
        }
        //si el que se inserta es mayor que el actual y la derecha esta vacía lo mete a la derecha,
        //sino llama a este mismo metodo.
        if(nodo.personaje.getNumber() > current.personaje.getNumber())
            if(current.right == null)
                current.right = nodo;
            else
                insert_(current.right, nodo);

        //si el que se inserta es menor que el actual lo mete a la izquierda siempre y cuando este vacia,
        //sino llama a este mismo metodo
        else if(nodo.personaje.getNumber() < current.personaje.getNumber())
            if(current.left == null)
                current.left = nodo;
            else
                insert_(current.left, nodo);
    }

    public void insert(Personajes personaje)
    {
        insert_(root, new Nodo(personaje));
    }

    private Personajes search_(Nodo current, int nodo)
    {
        if(current == null) return  null;
        //si el actual tiene el mismo id que el que se busca lo encontró de una
        if(current.personaje.getNumber() == nodo)
            return current.personaje;
        //si es mayor, pues lo busca a la derecha
        else if(nodo > current.personaje.getNumber())
            return search_(current.right, nodo);
        else
        //si es menor lo busca  a la izquiera
            return search_(current.left, nodo);
    }

    public Personajes search(int personaje)
    {

        return search_(root, personaje);
    }
}