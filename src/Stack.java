package application;

// DANIELA VILLAMAR 19086
// MIRKA MONZON 18139
// SEBASTIAN MALDONADO 18003
// PROYECTO FASE 2
// FECHA DE ENTREGA: 20/03/2020

public interface Stack<E> {

   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack

}