public class common{
public static void main(String [] args){

int array1 [] = {1,2,3,5,7,9};
int array2 [] ={2,4,6,8,9,10};

for(int i =0 ; i<array1.length ; i++){

System.out.print(array1[i] + " ");

}
System.out.println();

for(int i =0 ; i<array2.length ; i++){

System.out.print(array2[i] + " ");

}
System.out.println();

//------------------------------------------------------------------

for(int i=0 ; i<array1.length ; i++)
for(int j=0 ; j<array2.length ; j++)

if(array1[i] == array2[j]);
System.out.print(array1[i] + " and ");

}

}
