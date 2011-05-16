package uno_project;


import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -DN-
 */

public class Player {
  private  ArrayList <Carta> misCartas;
  private String nombre;
    
    public Player(String nombre){
        this.nombre = nombre;
    }
    //agrega nueva carta
    public void agregarCarta(Carta nueva){
        this.misCartas.add(nueva);
    }
    //retorna una carta
    public Carta sacarCarta(){
        Carta temp;
        temp = this.misCartas.get(0);
        this.misCartas.remove(0);
        return temp;
    }

}
