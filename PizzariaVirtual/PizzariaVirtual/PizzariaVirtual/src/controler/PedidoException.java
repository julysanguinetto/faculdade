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
public class PedidoException extends Exception{

    /**
     * Construtor da classe
     */
    public PedidoException() {
        super();
    }

    /**
     * Construtor da classe
     *
     * @param msg - mensagem para apresentar na tela
     */
    public PedidoException(String msg) {
        super(msg);
    }
}
