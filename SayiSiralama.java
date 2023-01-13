package SayiSiralama;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a ,b ,c;
      System.out.println("a sayiyisini giriniz :");
      a=scan.nextInt();
      System.out.println("b sayiyisini giriniz :");
      b=scan.nextInt();
      System.out.println("c sayiyisini giriniz :");
      c=scan.nextInt();
      if(a<b && b<c) {
    	  System.out.println("a<b<c");
      }
      else if (a<c && c<b) {
    	  System.out.println("a<c<b");  
      }  else if (b<a && a<c) {
    	  System.out.println("b<a<c");  
      }  else if (b<c && c<a) {
    	  System.out.println("b<c<a");  
	}
      else if (c<a && a<b) {
    	  System.out.println("c<a<b");  }
      else if  (c<b && b<a)  {
    	  System.out.println("c<b<a");  }
      
	}
}
