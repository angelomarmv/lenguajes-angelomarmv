/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;

/**
 *
 * @author T-107
 */
public class probarArreglos {
    
    public static void main(String[] args) {
     GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
                          generadora.agregarUsuario("diana", 14, "diana12@hotmail.com");
      ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generadora.getUsuarios();
                           System.out.println(usuarios.size());
     for(Usuario u:usuarios){
         System.out.println(u.getNombre()+"edad:"+u.getEdad()+"email:"+u.getEmail());
     
     }
    }
    
}
