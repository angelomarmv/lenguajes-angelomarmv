/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
    
    public static void main(String oso[]){
  
   Imc imc = new Imc(90,1.80f); 
  imc.setPeso(90);
System.out.println(imc .calcular());
    

//PRIMITIVOS INTEGRALES (QUE SOLO SON LOS ENTEROS)
   
  byte b=2;
  short s=2;
  int i=2;
  long l=2;
   
  b=(byte)s;
  s=b;
  i=(int)l;
  i=s;
  s=(short)i;
  
  float f=(float)2.0;
  double d=2.0;
 
  boolean valor=false;
  
  
  Imc otro=new Imc();
  otro.setFlaco(true);
  System.out.println(otro.isFaclo());
    
  
  
  
  
   
   
   
   
   
   
    
    
 }
    
}




