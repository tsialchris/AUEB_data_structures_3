import java.io.*;
import java.util.*;

public class main {
   public static void main(String[] args) {
	   CharQueueImpl A = new CharQueueImpl();
	   
	   boolean x=A.isEmpty();
	   System.out.println(x);
	   
	  
	   A.put('A');
	   A.put('B');
	   A.put('C');
	   A.put('D');
	   
	   x=A.isEmpty();
	   System.out.println(x);
	   
	   A.printQueue(System.out);
	   A.get();
	   System.out.println(A.get());
	   A.peek();
	   A.printQueue(System.out);
	   System.out.println(A.size());
	   
   }
}