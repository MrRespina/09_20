package Practice;

public class V04_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int year=2023,month=9,day=20;
		String name="지병천",live_Gu="강서",live_Si="서울";
		double vision=0.05;
		boolean java_Used=true;
		
		System.out.printf("안녕하세요. 제 이름은 %s입니다.\n오늘은 %d년 %02d월 %d일입니다.\n",name,year,month,day);
		System.out.printf("현재 %s시 %s구에서 거주하고있고,",live_Si,live_Gu);
		System.out.printf("현재 시력은 %.2f정도입니다.\n",vision);
		System.out.printf("자바 사용경험 유무는 %b입니다. (%s)",java_Used,useCheck(java_Used));

	}
	
	public static String useCheck(boolean b) {
		
		String used="";
		
		if(b == true) {
			used = "사용해봤음";
		}else {
			used = "사용해보지 않았음";
		}
		return used;
		
	}

}
