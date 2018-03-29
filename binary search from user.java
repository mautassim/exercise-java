import java.util.Scanner;
public class binary{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int array [] ={1,2,3,4,5,6,7,8,9};
int key;

System.out.println("insert the key");
key = input.nextInt();

//-------------------------------------------------------------------

int low=0,high=array.length-1,mid
boolean found = false;

while(high >= low && !found){

mid = (low + high)/2;

if(key < array[mid])
high = mid-1;
else
if(ket > array[mid])
low = mid + 1;

else{

System.out.println(key+"has been found at"+mid);
found = true;

}

}

if(!found){

System.out.println(key+"has no found");

}
}
}
}
