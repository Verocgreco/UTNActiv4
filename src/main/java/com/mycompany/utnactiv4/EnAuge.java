
package com.mycompany.utnactiv4;

import javax.swing.JOptionPane;


public class EnAuge implements Popularidad {

    @Override
    public void mostrarPopularidad(Cancion cancion) {
        System.out.println(Icono.ROCKET.texto()+" "+cancion.getArtista()+" - "+cancion.getTitulo()+" ("+cancion.getAlbum()+
                " - "+cancion.getAnio()+" )");
        JOptionPane.showMessageDialog(null,Icono.ROCKET.texto()+" "+cancion.getArtista()+" - "+cancion.getTitulo()+" ("+cancion.getAlbum()+
                " - "+cancion.getAnio()+" )" );       
       
    }
    
}
