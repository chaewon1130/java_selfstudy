package Variable;

import java.util.Scanner;

/*
 * 1~10위 1-2위 5포, 3-4위 4포, 5-6위 3포, 7-8위 2포, 9-10위 1포
 * 내 예측 +1포
 */
/*
 * 맨처음 팀 선택
 * 내 승리예측 선택
 * 승리팀 출력
 * 6번 반복
 * 7 4 6 8 2 3 5 1 10 9
 */
public class Game {
	public static void main(String[] args) {
		/**
		 * 1 : SSG
		 * 2 : LG
		 * 3 : 키움
		 * 4 : KT
		 * 5 : 기아
		 * 6 : 롯데
		 * 7 : NC
		 * 8 : 삼성
		 * 9 : 두산
		 * 10 : 한화
		 */
		System.out.println("경기를 입력해주세요");
		System.out.println("1 : SSG\n" + "2 : LG\n" + "3 : 키움\n" + "4 : KT\n" + "5 : 기아\n"
				 + "6 : 롯데\n" + "7 : NC\n" + "8 : 삼성\n" + "9 : 두산\n" + "10 : 한화\n");
		int[] team = new int[10];
		String[] teamName = new String[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<team.length; i++) {
			team[i] = sc.nextInt();
			switch(team[i]) {
			case 1:
				teamName[i] = "SSG";
				break;
			case 2:
				teamName[i] = "LG";
				break;
			case 3:
				teamName[i] = "키움";
				break;
			case 4:
				teamName[i] = "KT";
				break;
			case 5:
				teamName[i] = "기아";
				break;
			case 6:
				teamName[i] = "롯데";
				break;
			case 7:
				teamName[i] = "NC";
				break;
			case 8:
				teamName[i] = "삼성";
				break;
			case 9:
				teamName[i] = "두산";
				break;
			case 10:
				teamName[i] = "한화";
				break;
			}
		}
		
		

		System.out.println("오늘의 매치업");
		int num = 1;
		for(int i=0; i<teamName.length; i+=2) {
			System.out.println(num++ + "경기 : " + teamName[i] + " VS " + teamName[i+1]);
		}
		
		
		/**
		 * 1 이면 왼쪽팀 승리, 2이면 오른쪽 팀 승리
		 */
		int[] point = new int[10];
		
		for(int i=0; i<team.length; i++) {
			switch(team[i]) {
			case 1, 2:
				point[i] = 5;
				break;
			case 3, 4:
				point[i] = 4;
				break;
			case 5, 6:
				point[i] = 3;
				break;
			case 7, 8:
				point[i] = 2;
				break;
			case 9, 10:
				point[i] = 1;
				break;
			}
		}
		
		System.out.println("본인의 승부예측을 적어주세요(1이면 왼쪽팀 승리, 2이면 오른쪽팀 승리)");
		/**
		 * 승리팀 예측
		 * 1 이면 왼쪽팀 승리, 2이면 오른쪽 팀 승리
		 */
		for(int i=0; i<10; i+=2) {
			int pre = sc.nextInt();
			if(pre == 1) {
				point[i]++;
			}else {
				point[i+1]++;
			}
		}
		for(int i=0; i<point.length; i++) {
//			System.out.println(team[i] + " : " + point[i]);
		}
		
		
		// 0.98(소수점 2자리 0~1)
//		System.out.println((double)Math.floor(Math.random()*10000)/10000 * 100);
		
		for(int j=0; j<6; j++) {
			System.out.println(j+1 + "번째 경기 ===============================");
			for(int i=0; i<point.length; i+=2) {
				double total = point[i] + point[i+1];
				double left = point[i] * 100 / total;
				double right = point[i+1] * 100 / total;
//				System.out.println("left : " + left);
//				System.out.println("right : " + right);
				double temp = (double)Math.floor(Math.random()*10000)/10000 * 100;
//				System.out.println("temp : " + temp);
				if(temp > left) {
//					System.out.println("right");
					System.out.println("(우)" + teamName[i+1]);
				}else {
//					System.out.println("left");
					System.out.println("(좌)" + teamName[i]);
				}
			}
			
		}
		
		
		
	}
}
