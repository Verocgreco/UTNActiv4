
package com.mycompany.utnactiv4;

import javax.swing.JOptionPane;

/**
 *
 * @author veron
 */
public class EnTendencia implements Popularidad{

    @Override
    public void mostrarPopularidad(Cancion cancion) {
         System.out.println(Icono.FIRE.texto() + cancion.getArtista()+" - "+cancion.getTitulo()+" ("+cancion.getAlbum()+
                " - "+cancion.getAnio()+" )");
         JOptionPane.showMessageDialog(null,Icono.FIRE.texto()+" "+cancion.getArtista()+" - "+cancion.getTitulo()+" ("+cancion.getAlbum()+
                " - "+cancion.getAnio()+" )" );
         
    }
    
}
 