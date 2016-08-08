package guvi;

import java.util.Scanner;

public class Powe {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int power=in.nextInt();
int sum;
//	while(number!=0){
		sum=(int) Math.pow(number,power);

	System.out.println(sum);

}
}
