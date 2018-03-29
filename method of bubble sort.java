int temp;
for(int i=array.length ; i>0 ; i--){
for(int j=0 ; j<i-1 ; j++){
if(array[j] > array[j+1])
temp = array[j];
array[j] = array[j+1];
arrat[j+1] = temp;
}
}
