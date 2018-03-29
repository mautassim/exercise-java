import java.util.Scanner;
public class bubble{
static int array [] = new int [10];
public static void main(String [] args){

Scanner input = new Scanner(System.in);

for(int i=0 ; i<array.length ; i++){

System.out.println("insert an 10 numbers");
array[i] = input.nextInt();

}

bubble_sort(array);

for(int i=0 ; i<array.length ; i++){
System.out.print(array[i] + " ");

}
}

//------------------------------------------------------------------------------

static void bubble_sort(int arr[]){

for(int i=arr.length ; i>0 ; i--){
for(int j=0 ; j<i-1 ; j++)

if(array[j] > array[j+1])

swap(j , j+1);

}

//-------------------------------------------------------------------------------

static void swap(int a , int b){

int temp = array[a];
array[a] = array[b];
array[b] = temp;

}

}
