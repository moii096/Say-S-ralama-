package SayiSiralama;

import java.util.Scanner;

public class SayiSiralamadöngü {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n,n1;
	        int max = -2147483647, min =2147483647;
	        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
	        n = input.nextInt();

	        for (int i=1; i<=n;i++){

	            System.out.print(i + ". Sayıyı Giriniz: ");
	             n1 = input.nextInt();

	             if(n1>max){
	                 max =n1;
	             }
	             if (n1<min){
	                 min=n1;
	             }
	        }
	        System.out.println("En Büyük Sayı: " + max);
	        System.out.print("En Küçük Sayı: "+ min);
	    }


}
