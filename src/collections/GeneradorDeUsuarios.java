/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List; // este lo tenemos que imoportar para que el commpilador lo vea


public class GeneradorDeUsuarios {
    
private List<Usuario>usuarios;  // ATRIBUTO  

public GeneradorDeUsuarios(){//constructor
    
    Usuario u1=new Usuario("omar",21,"angelomar49@hotmail.com");
    Usuario u2=new Usuario("pedro",25,"pedritoo@hotmail.com");
    Usuario u3=new Usuario("juan",30,"juanam@hotmail.com");
    Usuario u4=new Usuario("paco",27,"paco12@hotmail.com");
    
    usuarios=new ArrayList<Usuario>();
    usuarios.add(u1);
    usuarios.add(u2);
    usuarios.add(u3);
    usuarios.add(u4);
}

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
   // para agregar un nuevo usuario 
    public String agregarUsuario(String nombre, int edad, String email){
    Usuario u=new Usuario(nombre,edad,email);
    usuarios.add(u);
    return "usuario agregado con exito";
    
    }
    
}
