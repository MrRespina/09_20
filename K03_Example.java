package Practice;

import java.util.Scanner;

public class K03_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메뉴, 가격, 칼로리, 평점(5점만점)
		String menu="";
		int price=0;
		double kcal=0,avgPoint=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 먹은 점심은 무엇입니까 ? : ");
		menu = s.nextLine();
			
		System.out.print("가격은 얼마였습니까 ? : ");
		price = s.nextInt();
		
		System.out.print("칼로리는 어느정도였습니까 ? : ");
		kcal = s.nextDouble();
		
		System.out.print("별점을 매긴다면 ? : ");	
		avgPoint = s.nextDouble();
		
		System.out.printf("오늘 먹은 점심 : %s\n가격 : %d 원\n칼로리 : %.0f kcal\n별점 : %.1f ☆",menu,price,kcal,avgPoint);
		
		s.close();

	}

}
