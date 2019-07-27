//Q1
public class Qone{
  public static void main(String[]args){
  int a= 85;
  if(a>=0&&a<=60){
  System.out.println("F");
}
else if (a>=61&&a<=70){
  System.out.println("D");
}
else if(a>=71&&a<=80){
  System.out.println("C");
}
else if(a>=81&&a<=90){
  System.out.println("B");
}
else{
  System.out.println("A");
}
}
}
//Q2
public class Qtwo{
  public static void main(String[]args){
for(int a=3; a>0;a=a+1)
while (a%12>0&&(a%3<1||a%4<1))
{
System.out.println(a);
a=a+1;
}
}
}
//Q3
public class Qthree{
public static void main(String[] args){
  int a[]=new int[3];
  a[0]=1;
  a[1]=2;
  a[2]=3;

for(int i=0;i<a.length;i++)
  System.out.println(a[i]);
  }}
//Q5

public class Qfive{
public static void main(String[] args){
int[] intArr= new int[6];
intArr[0]=3;
intArr[1]=4;
intArr[2]=5;
intArr[3]=6;
intArr[4]=7;
System.out.println(intArr[2]);
}}
