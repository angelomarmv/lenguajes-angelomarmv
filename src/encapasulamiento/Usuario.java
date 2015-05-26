/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapasulamiento;


public class Usuario {
    
    //PRIMER REGLA DE ENCAPSULAMIENTO
    private String nombre;
    private int edad;
    
    public void getNombre(String nombre ){
    this.nombre =nombre;
    
    }
    public void setEdad(int edad){
    this.edad=edad;
    }
    public String setNombre(){
    return nombre;
    
    
    }
    public int getEdad(){
    return edad; 
}
}
