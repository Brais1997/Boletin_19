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
public class Boletin_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon msg =new Buzon();
        msg.numeroDeCorreos();
        msg.engade(new Correo ("Sii?",true));
        msg.engade(new Correo ("Dis",false));
        msg.engade(new Correo ("Tu?",false));
        msg.engade(new Correo (";D",false));
        msg.porLeer();
        msg.primerNoLeido();
        msg.amosa(3);
    }
    
}