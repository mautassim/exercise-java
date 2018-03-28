public class remove{
public static void main(Stering [] args){

     //intex =  0,1,2,3,4,5,6,7,8
int array [] = {1,2,3,4,5,6,7,8,9};

for(int i=0 ; i<array.length ; i++)

System.out.print(array[i]);//show the old array
System.out.println();

int removIntex=1;//remove the intex of 1 ========>> element = 2

for(int i =removIntex ; i<array.length -1 ; i++){

array[i] = array[i+1];//Put the intex of 3 on place of intex 2 and remov the intex 2 he mack's swap to stel the intex out of array 
//    2           3
}

for(int i =0 ; i<array.length -1 ; i++)
System.out.print(array[i] + " ");//shwo the new array
System.out.println();

}

}
