package com.collectionframework;

public class Main{
	public static void main(String args[]) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter the size of the array -: ");
		int n = in.nextInt();
		System.out.println("Enter the String : ");
		char str[] = new char[n];
		
		for(int i=0; i<n; i++) {
			str[i] = in.next().charAt(0);
		}
		System.out.print("Array : ");
		for(int i=0; i<n; i++) {
			System.out.print(str[i]+ " ");
		}
		//start to rotation the string at right position.
		System.out.println("Enter the rotation of right position of the array : ");
		int r = in.nextInt();
		/* r = r%n; */
		char strtemp[] = str;
		/*
		 * char temp = 0; for(int j = 0; j<r; j++) { for(int i=n-1; i>=0; i--) {
		 * if(i==n-1) { temp = str[i]; } if(i==0) { str[i] = temp; break; } str[i] =
		 * str[i-1];
		 * 
		 * } } //check unchanged index int count = 0; for(int i=0; i<n; i++) {
		 * if(str[i]==strtemp[i]) { count++; } }
		 */
		int count = 0;
		int j=0;
		for(int i=0; i<n-1; i++) {
			j = (r+i)%n;
			if(str[i]==str[j]) {
				count++;
			}
		}
		System.out.print("After "+r+" times rotation Array : ");
		for(int i=0; i<n; i++) {
			System.out.print(str[i]+ " ");
		}
		System.out.println("\n"+count);
		
	}
	
	
}

