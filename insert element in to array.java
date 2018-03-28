import java.util.Scanner;
public class insert{
piblic static void main(String [] args){

Scanner input = new Scanner(System.in);

int array [] = {1,2,3,4,5,6,7,8,9};
int intex_position;
int newelement;

System.out.println("insert position");
intex_position = input.nextInt();

System.out.println("insert element");
newelement = input.nextInt();

for(int i =0 ; i<arrat.length ; i++){

System.out.print(array[i] + " ");
System.out.println();
}
//------------------------------------------------------------------------------------------------

for(int i = array.length -1 ; i> intex_position ; i--){

array[i] = array[i - 1];

}

array[intex_position] = newelement;

for(int i = 0 ; i<array.length ; i++)
System.out.print(array[i] + " ");
System.out.println();

}

}
