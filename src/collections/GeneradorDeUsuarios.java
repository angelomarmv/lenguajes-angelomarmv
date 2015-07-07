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
    Usuario u2=new Usuario("pedro",25,"angemv@hotmail.com");
    Usuario u3=new Usuario("juan",30,"angelomar@hotmail.com");
    
    usuarios=new ArrayList<Usuario>();
}

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
