/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
//Heredando la clase Thread
public class PrimerThread  extends Thread{

    public  void run(){
        while(true){
        try{
        Thread.sleep(1000);
            System.out.println("YO SOY EL PRIMER THRAED");
        }catch(InterruptedException e){//
        
        
        }
    
  }// a qui se cierra el while
    }//se cierra el run
}
