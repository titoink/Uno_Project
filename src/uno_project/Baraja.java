/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uno_project;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author -DN-
 */
class Baraja {

   
    ArrayList <Carta> deck;
    ImageIcon cartasImg[][] = new ImageIcon[4][10];

    public Baraja(){
        this.deck = new ArrayList<Carta>();
        for(int i = 0; i<this.cartasImg.length; i++)
        {
            for(int j = 0; j<this.cartasImg[i].length; j++)
            {
                if(i == 0)
                cartasImg[i][j] = new ImageIcon("/Users/-DN-/Documents/NetBeansProjects/UNO/src/Imagenes/Rojo/"+j+".png");
                if (i == 1)
                cartasImg[i][j] = new ImageIcon("/Users/-DN-/Documents/NetBeansProjects/UNO/src/Imagenes/Azul/"+j+".png");
                if(i == 2)
                cartasImg[i][j] = new ImageIcon("/Users/-DN-/Documents/NetBeansProjects/UNO/src/Imagenes/Amarillo/"+j+".png");
                if(i == 3)
                cartasImg[i][j] = new ImageIcon("/Users/-DN-/Documents/NetBeansProjects/UNO/src/Imagenes/Verde/"+j+".png");
            }
        }
       for(int color = 1; color<5; color++)
       {
            for(int numero = 0; numero<19; numero++)
            {
                if(numero>0)
                {
                    for(int repetido = 0; repetido<2; repetido++)
                    {
                        Carta temp;
                        temp = new Carta(numero, color, null, 1);
                        this.deck.add(temp);
                    }
                }
                else
                {
                    System.out.println("AKI");

                        this.deck.add(new Carta(numero, color, this.cartasImg[color-1][0], 1));
                }
            }
       }

    }

    public Carta sacarCarta()
    {
        Carta temp;
        temp = this.deck.get(0);
        this.deck.remove(0);
        return temp;
    }

    public void agregarCarta(Carta card)
    {
        deck.add(card);
    }
}



