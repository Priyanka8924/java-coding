class isomorphic{

public static void main(String[] args){
String str1="abc";
String str2="xxz";
int count=0;
int count2=0;

for(int i=0;i<str1.length()-1;i++){
if(str1.charAt(i)==str1.charAt(i+1)){
count++;

}
if(str2.charAt(i)==str2.charAt(i+1)){
count2++;
}

}
if(count==count2){
System.out.println("true");
}
else{
System.out.println("false");
}

}
}
