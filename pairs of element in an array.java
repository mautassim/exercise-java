public class pairs{
public static void main(String [] args){

int array [] ={1,2,3,4,5,6};
int number=7;

System.out.println("paris of elements and their sum");

for(int i=0 ; i<array.length ; i++){
for(int j = i+1<array.length ; j++)
if(array[i] + array[j] == number)

System.out.println(array[i] + "+" + array[j] + "=" + number);

}

}

}
