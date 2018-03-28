import java.util.Scanner;
public class revers_array{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int array [] = new int [10];

for(int i =0 ; i<array.length ; i++){

System.out.println("insert an 10 number");
array[i] = input.nextInt();

}

for(int i=array.length-1 ; i>0 ; i--)

System.out.print(array[i]);

}

}
