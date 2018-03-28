import java.util.Scanner;
public class sum_array{
public static void main(String [] args){

Scanner input = nwe Scanner(System.in);

int array [] = new int [5];
int sum=0;

for(int i =0 ; i<array.length ; i++){

System.out.println("enter an 5 number to sum");
array[i] = input.nextInt();

sum+=array[i];

}

System.out.println("sum =" + sum);


}
