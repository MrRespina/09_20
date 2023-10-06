package Practice;

import java.util.Scanner;

public class K01_Input {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		System.out.print("이름 : ");
		String name = s.next();
		
		System.out.println("반갑습니다 "+name+"님. 나이가 몇살이신가요?");
		System.out.print("나이 : ");
		int age = s.nextInt();
		
		System.out.println(age+"세 이시군요.");
		System.out.print("키는 어떻게 되시나요?\n키 : ");
		double height = s.nextDouble();
		
		System.out.println(height+"cm 이시군요.");
		s.close();
		
	}

}
