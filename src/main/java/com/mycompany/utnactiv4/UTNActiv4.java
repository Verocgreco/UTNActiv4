

package com.mycompany.utnactiv4;


public class UTNActiv4 {

    public static void main(String[] args) {
       Cancion cancion = new Cancion("Coldplay", "The Scientist", "A Rush of Blood to the head", 2002);
       cancion.reproducir(); //nota musical
       cancion.setReproducciones(1200);        
       cancion.reproducir();//cohete       
       cancion.setDislikes(12000);
       cancion.reproducir();//nota musical
       cancion.setReproducciones(60000);
       cancion.setLikes(30000);
       cancion.reproducir();//fueguito
       cancion.setUlt24hs(false);
       cancion.reproducir();//nota musical
    }
}
