class paint{
public static void main(String[]args){
int[][]arr={{1,5,3},
	    {2,9,4},
            {3,1,7} };
int houses=3;
int colors=3;
int budget=20;
int index=-1;
int sum=0;


for(int i=0;i<arr.length;i++){
int min=Integer.MAX_VALUE;
for(int j=0;j<arr[0].length;j++){

if(arr[i][j]<min&&j!=index){
min=arr[i][j];

index=j;
}



}

System.out.println(min);
sum+=min;
}


//System.out.println(sum);
if(sum<budget){
System.out.println(sum);
}
else{
System.out.println("-1");
}

}



}