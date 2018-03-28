import java.util.Scanner;
public class twoDarray{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int row,colum;

System.out.println("enter row");
row = input.nextInt();

System.out.println("enter colum");
colum = input.nextInt();

//------------------------------------------------------------

int [] [] twodarray = new int [row] [colum];

for(int i = 0 ; i<twodarray.length ; i++)
for(int j =0 ; j<twodarray[i].length ; j++){

System.out.println("enter element at ["+ i + "][" + j + "]:");
twodarray = input.nextInt();

}

//----------------------------------------------------------------------

for(int i=0 ; i<twodarray.length ; i++){
for(int j =0 ; j<twodarray[i].length ; j++)

System.out.print(twodarray[i][j] + " ");
System.out.println();
}

}

}
