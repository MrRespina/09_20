package Practice;

import java.util.Scanner;

public class K04_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이름 , 생일(년 월 일 따로), 나이 , 키 , 전화번호 , 시력 , 대면여부(t/f) 콘솔 입력받아 출력할 것.
		
		String year,month,day,name,number,date,come;
		int age;
		Double height,vision;
		boolean meet;
		
		Scanner s = new Scanner(System.in);		
				
		System.out.print("이름 : ");	
		name = s.nextLine();
		
		//문자열 substring으로 분해
		System.out.print("생년월일 : ");
		date = s.next();
		year = date.substring(0,4);
		month = date.substring(4,6);
		day = date.substring(6,8);
		
		/*
		
		System.out.print("생년 : ");
		year = s.nextInt();
		
		System.out.print("생월 : ");
		month = s.nextInt();
		
		System.out.print("생일 : ");
		day = s.nextInt(); 
		
		*/
		
		System.out.print("나이 : ");
		age = s.nextInt();
		
		System.out.print("키 : ");
		height = s.nextDouble();
		
		//문자열 substring으로 분해
		System.out.print("전화번호 : ");
		number = s.next();
		number = number.substring(0,3)+"-"+number.substring(3,7)+"-"+number.substring(7,11);
		
		System.out.print("시력 : ");
		vision = s.nextDouble();
		
		System.out.print("대면여부 : ");
		meet = s.nextBoolean();
		
		if(meet==true) {
			come="참여";
		}else {
			come="불참";
		}
		
		System.out.println("-------------------------");
		System.out.printf("* 이름\t: %s\n* 생일\t: %s년 %s월 %s일\n* 나이\t: %d세\n* 키\t: %.1f\n* 전화번호\t: %s\n* 시력\t: %.2f\n* 대면여부\t: %s\n"
				,name,year,month,day,age,height,number,vision,come);
		System.out.println("-------------------------");
		
		s.close();

			
		

	}

}
