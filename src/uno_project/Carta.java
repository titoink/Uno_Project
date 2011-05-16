/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uno_project;

import javax.swing.ImageIcon;

/**
 *
 * @author -DN-
 */
class Carta {
     private int myNumero;
   private int tipo; //1 para carta normal 0-9 2 carta especial
   private String myColor;
   private ImageIcon myImagen;

    public Carta(int numero,int color,ImageIcon imagen, int tipo)
    {
        if(color == 1)
            this.myColor = "Rojo";
        if(color == 2)
            this.myColor = "Azul";
        if(color == 3)
            this.myColor = "Verde";
        if(color == 4)
            this.myColor = "Amarillo";

        this.tipo = tipo;
        this.myNumero = numero;
        this.myImagen = imagen;
    }

    public String getColor()
    {
        return this.myColor;
    }

    public int getNumero()
    {
        return this.myNumero;
    }

    public ImageIcon getMyImagen()
    {
        return this.myImagen;
    }

}
