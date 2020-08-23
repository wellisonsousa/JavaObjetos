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
public class Pessoa {
    
    private String nome;
    
    public  Pessoa (String nome){
        this.nome = nome;
    }
      /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void dizerOla(Pessoa outraPessoa){
        System.out.println(this.nome + ": Olá, "+outraPessoa.getNome()+"!");
        outraPessoa.responderOla(this);
    }

    public void responderOla(Pessoa outraPessoa){
        System.out.println(this.nome + ": Olá, "+outraPessoa.getNome()+".");
    }
}