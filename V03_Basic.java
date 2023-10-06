package Practice;

public class V03_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		day = 20;
		System.out.println(day);
		
		int floor = (int)5.5;
		System.out.println(floor+"층");
		
		String phoneModel = "LG V40";
		String lunch = "Burger";
		double height = 178.5;
		int homeFloor = 1;
		int lunchTime = 2;
		System.out.println();
		
		System.out.println("핸드폰 모델 명 : "+phoneModel);
		System.out.println("먹고싶은 점심 : "+lunch);
		System.out.println("점심 종료 시간 : "+lunchTime+"시");
		System.out.println("나의 키 : "+height);
		System.out.println("집의 층수 : "+homeFloor);
		
		System.out.println(homeFloor+lunchTime);
		System.out.println(homeFloor-lunchTime);
		System.out.println(homeFloor*lunchTime);
		System.out.println((double)homeFloor/lunchTime);

	}

}
