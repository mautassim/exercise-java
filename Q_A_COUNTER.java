package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
 static void Q_A_COUNT(){ 
  Scanner input = new Scanner(System.in); 
 String word = " ";
int Q_A_counter = 0;
int end=0;
do{ 
System.out.print("insert an String > ");
word = input.nextLine();
   for(int i  = 0 ; i  < word.length() ; i++)
       for(int x = i + 1 ; x < word.length() ; x++)
           for(int z = x + 1 ; z < word.length() ; z++ )             
    if(word.charAt(i) == 'Q' && word.charAt(x) == 'A' && word.charAt(z) == 'Q')
      Q_A_counter++;    
   System.out.println(Q_A_counter);
   
   System.out.print("to end inter (-1) to insert eny key typ integer >");
   end = input.nextInt();
 if(end == -1)
 System.out.println("mautassim ashraf(:");
 break;
 else
 JavaApplication1.main(new String[0]);
 //ASDQBSNMQAQQ = 4
  //QAQQQZZYNOIWIN = 3      
}while(end == -1);
}   
   public static void main(String[] args)
    {
        Q_A_COUNT();
    }
} 
