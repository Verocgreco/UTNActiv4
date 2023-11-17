
package com.mycompany.utnactiv4;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;


public class Normal implements Popularidad{

    @Override
    public void mostrarPopularidad(Cancion cancion) {         
        System.out.println(Icono.MUSICAL_NOTE.texto()+" "+cancion.getArtista()+" - "+cancion.getAlbum()+" - "+cancion.getTitulo());
        JOptionPane.showMessageDialog(null,Icono.MUSICAL_NOTE.texto()+" "+cancion.getArtista()+" - "+cancion.getAlbum()+
                " - "+cancion.getTitulo() );
        
        }
    }

   

    

    
    

