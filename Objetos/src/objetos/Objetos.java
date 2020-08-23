/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Nescara
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pessoa 1");
        Pessoa pessoa2 = new Pessoa("Pessoa 2");
        pessoa1.dizerOla(pessoa2);
    }
    
}
