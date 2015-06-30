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
public class ModeloEvaluacion {
    
    
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws PorcrntajeException{
        
    float pParcial=cParcial.getPorcenntaje();
    float pFinal=cFinal.getPorcenntaje();
    
    if((pParcial+pFinal)!=1.0f)throw new PorcrntajeException();
    
    float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcenntaje()+cFinal.getCalificacion()*cFinal.getPorcenntaje();
    return calificacionFinal;
    }
    
}
