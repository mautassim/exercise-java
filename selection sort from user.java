import java.util.Scanner;
public class selection{
static int array [] = new int[10];
public static void main(String [] args){

Scanner input = new Scanner(System.in);

for(int i =0 ; i<array.length ; i++){

System.out.println("insert an 10 numbers");
array[i] = input.nextInt();

}

selection_sort(array);

for(int i = 0 ; i<array.length ; i++){

System.out.print(array[i] + " ");

}

}

//---------------------------------------------------------------------

static void selection_sort(int arr[]){

int min;
for(int i=0 ; i<arr.length ; i++){

min=i;

for(int j = i+1 ; j<arr.length ; j++)

if(arr[j] < arr[min])
min=j;

swap(i , min);

}

}

//---------------------------------------------------------------------------------

static void swap(int a , int b){

int temp = array[a];
array[a] = array[b];
array[b] = temp;

}

}
