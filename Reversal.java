package Tathastu;

import java.util.Scanner;

public class Reversal {
		public static void main(String[] args) {
			
			String reverse;
			Scanner sc=new Scanner(System.in);
			sc= new Scanner(System.in);
			
			System.out.print("Enter String to Reverse its Letters =  ");
			reverse = sc.nextLine();
			
			String[] strArray = reverse.split(" ");
			
			for(int i = 0; i < strArray.length; i++) 
			{
				char[] ch = strArray[i].toCharArray();
				for(int j = ch.length - 1; j >= 0; j--) 
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}

