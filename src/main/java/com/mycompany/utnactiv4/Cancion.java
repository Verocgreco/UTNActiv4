package com.mycompany.utnactiv4;

import java.time.LocalDateTime;

/**
 *
 * @author veron
 */
public class Cancion {

    private String artista;
    private String album;
    private String titulo;
    private int anio;
    private int likes;
    private int dislikes;
    private int reproducciones;
    private boolean ult24hs;
    private Popularidad pop;

    public Cancion(String artista, String album, String titulo, int anio) {
        this.artista = artista;
        this.album = album;
        this.titulo = titulo;
        this.anio = anio;
//        this.likes = 0;
//        this.dislikes = 0;
//        this.reproducciones = 0;
//        this.ult24hs = false;
        this.pop = new Normal();
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reprod) {
        this.reproducciones = reprod;
    }

    public boolean isUlt24hs() {
        return ult24hs;
    }

    public void setUlt24hs(boolean ult24hs) {
        this.ult24hs = ult24hs;
    }

    public Popularidad getPop() {
        return pop;
    }

    public void setPop(Popularidad pop) {
        this.pop = pop;
    }

    public void reproducir() {
        if (pop instanceof Normal) {
            if (reproducciones > 1000) {
                setPop(new EnAuge());
            }
        }
        if (pop instanceof EnTendencia) {
            if (!ult24hs) {
                setPop(new Normal());
            }
        }
        if (pop instanceof EnAuge) {
            if (reproducciones > 50000 && likes > 20000) {
                setPop(new EnTendencia());
            }else if(dislikes > 5000) {
                setPop(new Normal());
            }
        }
        pop.mostrarPopularidad(this);

    }
}
