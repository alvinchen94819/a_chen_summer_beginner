public class beginner{
  public static void main(String[] args){
    //Prints out all the even numbers from 50 to 100 (inclusive)
    for (int i = 50 ; i <= 100; i +=2){
      System.out.println(i);
    }
    //Sums the numbers from 1 to 10 and prints out the sum one time in the end.
    int total = 0;
    for (int i = 1; i <= 10; i++){
        total += i;
        // total = total + i
    }
    System.out.println(total);

    //Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
    for (int i = 5; i<= 100; i+=10){
      System.out.println(i-1);
      System.out.prinltn(i+1);
    }

    // fib solution721
    int f1 = 0;
    int f2 = 1;
    for(int g = 0; g < 21; g++){
      f1 = f1 + f2;
        f2 = f1 + f2;
        System.out.println(f1);
        System.out.println(f2);
        }

  }
}
public class 714{
public static void main(String []args){
for (int x=50; x<100; x=x+2)
System.out.println(x);
     }}

public class 714{
public static void main(String []args){
System.out.println(1+2+3+4+5+6+7+8+9+10);
     }}

     public class assignment3 {
     public static void main(String []args){
     for(int x=5; x<=100; x=x+5)
     System.out.println(x+1);
     for(int a=5;a<=100;a=a+5)
     System.out.println(a-1);
           }}

           public class assignment4{
public static void main(String []args){
for(int a=3; a>0;a=a+1)
while (a%12>0&&(a%3<1||a%4<1))
{
System.out.println(a);
a=a+1;}}}
