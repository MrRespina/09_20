package Practice;

import java.util.Scanner;

public class K05_Tomorrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,suml;
		double sla;
		Scanner s = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		x=s.nextInt();
		
		System.out.print("y 값 입력 : ");
		y=s.nextInt();
		
		sla = ((double)x/y);
		
		System.out.println("====================");
		System.out.println("x 값 = "+x+",y 값 = "+y);
		System.out.println("x + y = "+(x+y));
		System.out.println("x - y = "+(x-y));
		System.out.println("x * y = "+(x*y));
		System.out.println("x / y = "+sla);
		
		//Math.round((a*1000)/1000.0) - 실수 세번째 자릿수에서 반올림. 10^n
		System.out.println("x / y = "+(Math.round(sla*1000)/1000.0));
		
		System.out.println("====================");
		s.close();
		
	}

}
