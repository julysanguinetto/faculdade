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
public class CartaoException extends Exception{
    
    /**
     * Construtor da classe
     */
    public CartaoException() {
        super();
    }

    /**
     * Construtor da classe
     * @param msg - mensagem para apresentar na tela
     */
    public CartaoException(String msg) {
        super(msg);
    }
}
 