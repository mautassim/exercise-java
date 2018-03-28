public class frequency{
public static void main(String [] args){

int array [] = {1,1,2,3,2,3,4,5,4,5};

for(int i =0 i<array.length ; i++){
int sum=0;

for(int j = 0 ; j<array.length ; j++){

if(array[j] == array[i])

sum++;

}

System.out.println(array[i] + " has found " + sum + "times");
}

}

}
