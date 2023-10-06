package Practice;

import java.util.Scanner;

public class K02_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int kor,math,english,sum;
		double avg;
				
		System.out.print("국어 점수를 입력해주세요 : ");
		kor=s.nextInt();
		
		System.out.print("수학 점수를 입력해주세요 : ");
		math=s.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 : ");
		english=s.nextInt();
		
		sum = kor+math+english;
		avg = (double)sum/3;
		
		System.out.printf("국어 점수 : %d점\n수학 점수 : %d점\n영어 점수 : %d점\n총 점수 : %d점\n평균 점수 : %.2f점",kor,math,english,sum,avg);
		
		s.close();
		
	}

}
