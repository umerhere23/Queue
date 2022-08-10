/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author SP20-BSE-055
 */
public class RepeatStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
QueueInterface<String> stringQueue;
stringQueue = new ArrayBoundedQueue<String>(1);
 String line;
 for (int i = 1; i <= 3; i++)
      {
 System.out.print("Enter a line of text > ");
 line = scan.nextLine();
stringQueue.enqueue(line);
 }
 System.out.println("\nOrder is:\n");
 while (!stringQueue.isEmpty())
             

 {
 line = stringQueue.dequeue();
 System.out.println(line);
 }
 }
}

    
    

