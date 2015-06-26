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
class Bebida {
    
    private String tipo;
    private String []bebidas;
    
    public String[] obtenerRecomendaciones(){
        if(tipo.equals("alcoholicas")){
        String[ ] Licor = {"Cerveza", "caballito","Michelada","Martini","Piña_colada"};
        return Licor;
        
        
      }else{
     String[] Sinal={"Aguita","Lechita","Naranjada","Limonada","Cafe"};
     return Sinal;
            
        }
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
}
