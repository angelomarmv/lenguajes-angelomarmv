/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class FinDeCuatri {
    public static void main(String[] args) {
        
        
        //  creamos un objeto de tipo examen parcial
        ExamenParcial eParcial=new ExamenParcial();
                      eParcial.setCalificacion(8);
                      eParcial.setPorcenntaje(0.4F);
    ExamenFinal eFinal=new ExamenFinal();
                eFinal.setCalificacion(6);
                eFinal.setPorcenntaje(0.6f);
                
    //CREAMOS EL MODELO
                
              ModeloEvaluacion modelo=new ModeloEvaluacion();
              
        try {
            System.out.println(modelo.evaluar(eParcial, eFinal));
        } catch (PorcrntajeException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
}
