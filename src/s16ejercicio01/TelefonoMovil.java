/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s16ejercicio01;

/**
 *
 * @author alumno
 */
class TelefonoMovil {
    
    private String Camara;    
    private String Pantalla;
    private String Procesador;

    public TelefonoMovil() {
        this.Camara = "unknow";
        this.Pantalla = "unknow";
        this.Procesador = "unknow";
    }

    public TelefonoMovil(String Camara, String Pantalla, String Procesador) {
        this.Camara = Camara;
        this.Pantalla = Pantalla;
        this.Procesador = Procesador;
    }    
    

    public String getCamara() {
        return Camara;
    }

    public void setCamara(String Camara) {
        this.Camara = Camara;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
    
    
    
}
