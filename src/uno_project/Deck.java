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
public class Deck {
    ArrayList <Carta> deck;


    public Deck(){
        for (int color = 1; color <5; color ++){
            for (int numero = 0 ; numero <19; numero ++){

                    if(numero >0){
                        for (int repetido = 0 ; repetido<2; repetido ++){
                             Carta temp;
                             temp = new Carta (numero, color, null, 1);
                             this.deck.add(temp);
                }

            }
                    else{
                        Carta temp;
                        temp = new Carta (numero, color, null, 1 );
                        this.deck.add(temp);
                    }
        }
      }
    }


    public Carta sacarCarta(){
        Carta temp;
        temp = deck.get(0);
        return temp;
    }
    public void agregarCarta(Carta card){
        deck.add(card);
    }





}
