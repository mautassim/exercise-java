mid =(low+high)/2;
if(key < array[mid])
high = mid-1;
else
if(key > array[mid])
high = mid+1;
else{
System.out.println(key+"found"+mid);
found=true;
}
if(!found){
System.out.println(key+"not found");
}
