package guvi;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
	int a=0,b=1;
//c=in.nextInt();
for(int i=0;i<=3;i++){
	b=a+b;
	a=a+b;
System.out.println(b);
System.out.println(a);
}}}

