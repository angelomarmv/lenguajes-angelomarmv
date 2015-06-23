/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author T-107
 */
public class UsuarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Direccion d1=new Direccion(07550,"Ecatepec");
        
        
        Usuario u1=new Usuario("juan",42,"jcampos@gmail.com" ,new Direccion(07550,"Ecatepec"));
        System.out.println(u1.getDireccion().getMunicipio());
       
    }
    
}
