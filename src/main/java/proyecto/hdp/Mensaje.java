/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

/**
 *
 * @author T-107
 */
public class Mensaje {
    String contenido;

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }

    Mensaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
