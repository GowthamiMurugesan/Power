package guvi;

import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a,b;
	a=in.nextInt();
	b=in.nextInt();
	for(int i=a;i<=b;i++){
		if((i%2==0)){
			System.out.println(i);
		}
	}
}
}
