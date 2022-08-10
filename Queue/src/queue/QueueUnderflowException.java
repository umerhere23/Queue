/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author SP20-BSE-055
 */
class QueueUnderflowException extends RuntimeException {
     public QueueUnderflowException() {
	 super();
 }
 public QueueUnderflowException(String message) {
	 super(message);
 }
    
}
