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
public class ArrayBoundedQueue<T> implements QueueInterface<T>  {

    protected final int DEFCAP=100;
    protected T[] elements;
    protected int numElements=0;
    protected int front=0;
    protected int rear;
    public ArrayBoundedQueue(){
        elements =(T[])new Object [DEFCAP];
        rear=DEFCAP-1;
    }
public ArrayBoundedQueue(int maxSize){
elements=(T[]) new Object[DEFCAP];
rear= maxSize-1;
}
public boolean isFull(){
 return(numElements==elements.length) ;  
}
public boolean isEmpty(){
    return(numElements==0);
}

public void enqueue(T element){
    if (isFull())
        throw new QueueOverflowException1("Enqueue attempted on a full queue");

        else{
                rear=(rear+1)%elements.length;
                elements[rear]=element;
                numElements=numElements+1;
                }
}
public T dequeue(){
    if(isEmpty())
        throw new QueueUnderflowException("Dequeue attempted on empty");
    else{
        T toReturn =elements[front];
        elements[front]=null;
        front = (front+1)%elements.length;
        numElements=numElements-1;
        return toReturn;
        
    }}
public int size(){
    return numElements;
}
}
    
