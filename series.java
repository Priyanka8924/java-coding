class series{
public static void main(String[] args){

int n=16;
int rem=0;


if(n==0||n==1){
System.out.println("1");
}

if(n%2==0){

rem=n/2;
System.out.println(Math.pow(3,rem-1));
}
else{
rem=(n+1)/2;
System.out.println(Math.pow(2,rem-1));
}


}



}