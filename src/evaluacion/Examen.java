/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author T-107
 */
//CLASE TIPO POJO SOLO TIENE ATRIBUTOS Y NO TIENE 
public  abstract class   Examen {
    
    private int calificacion;
    private float porcenntaje;

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public float getPorcenntaje() {
        return porcenntaje;
    }

    public void setPorcenntaje(float porcenntaje) {
        this.porcenntaje = porcenntaje;
    }
    
}
