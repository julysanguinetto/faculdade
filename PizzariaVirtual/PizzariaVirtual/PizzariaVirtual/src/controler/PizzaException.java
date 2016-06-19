/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author San
 */
public class PizzaException extends Exception{

    /**
     * Construtor da classe
     */
    public PizzaException() {
        super();
    }

    /**
     * Construtor da classe
     *
     * @param msg - mensagem para apresentar na tela
     */
    public PizzaException(String msg) {
        super(msg);
    }
}
