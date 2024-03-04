package arrays;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the data");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length;i++) {
			if(i%2==0){
				sum+=a[i];
				
			}
			System.out.println("sum of even index: "+sum);
		}
	}

}
