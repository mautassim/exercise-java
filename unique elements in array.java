import java.util.Scanner;
public class unique_elements{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int array [] = {1,2,1,3,2,4,3,4};

for(int i=0 ; i<array.length ; i++){

boolean found = false;

for(int j = i-1 ; j>=0 ; j--)

if(array[j] == array[i])
found == true;

if(! found)  //or used eles

System.out.println(array[j]);//or array[i]

}

}

}
