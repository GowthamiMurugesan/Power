package guvi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int num;
num=in.nextInt();
		int n=num;
	//	int a=0;
		int r=0;
					while(n!=0){
				r=r*10;
				r=r+n%10;
				n=n/10;
			}
		if(r==num){
		System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
		}

}
