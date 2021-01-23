import java.util.*;
class Main{
  public static void main(String []args)
 {
    Scanner kbd=new Scanner(System.in);
    int a,b;
   a=kbd.nextInt();
   b=kbd.nextInt();
   int r1=0,r2=0;
   for(int i=0;i<=2;i++){
     r1+=(a%10)*Math.pow(10,2-i);
     r2+=(b%10)*Math.pow(10,2-i);
     a/=10;
     b/=10;        
    }
    if(r1>r2){
      System.out.print(r1);
    }
    else{
      System.out.print(r2);
    }
  }
}