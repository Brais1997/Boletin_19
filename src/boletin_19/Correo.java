/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19;

/**
 *
 * @author balva
 */
public class Correo {
    private boolean lido=false;
    private String contido;
    Correo(String contido, boolean lido){
        this.lido=lido;
        this.contido=contido;
    }
    public boolean lido(){
        return lido;
    }

    @Override
  public String toString() {
        return "Correo{" + "lido=" + lido + ", contido=" + contido + '}';
    }
    
}
