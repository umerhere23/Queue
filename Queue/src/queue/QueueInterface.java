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
public interface QueueInterface<T> {

    /**
     * @param 
     * @param args the command line arguments
     */
  
        

 void enqueue(T element) throws QueueOverflowException1;

 T dequeue() throws QueueUnderflowException;
 
 boolean isFull();



 boolean isEmpty();
 
 int size();

    public String enqueue();
}

    
    

