package pk;

import java.util.Random;

public class PenaltyKick {
	
	private int[] koResult;
	private int[] sgResult;	

	Random r;

	
	//생성자
	public PenaltyKick(){
		koResult = new int[5];
		sgResult = new int[5];
		r = new Random();
	}

	
	//승부차기
	/* 범위[1, 10]에서 임의의 수를 뽑는다.
	 * 임의의 수와 각 선수들의 성공률(value[1, 10])을 비교한다.  
	 * 이때 임의의 수가 성공값보다 작으면 슛성공, 크면 슛실패이다.*/
	
	public void PK(String[] sn, int[] sv, String[] kn, int[] kv) {
		
		for(int i = 0; i < 5; i++) {
			
			//세네갈선수 차례
			System.out.println("\n세네갈 선수 " + sn[i] + "이 한국 골기퍼 이광연 선수를 보며 킥을 준비합니다.");
			
			if(r.nextInt(10) <= sv[i]) {
				System.out.println(r.nextInt(10) + " " + sv[i]);
				System.out.println("슛~~~! 세네갈 " + i +"번째 슛 성공합니다.");
				sgResult[i] = 1;
			}else {
				System.out.println(r.nextInt(10) + " " + sv[i]);
				System.out.println("슛...! 세네갈 " + i + "번째 슛 실패합니다.");
				sgResult[i] = 0;
			}
			
			//한국선수 차례
			System.out.println("\n한국 선수 " + kn[i] + "이 세네갈 골기퍼 D.Ndiaye 선수를 보며 킥을 준비합니다.");
			
			if(r.nextInt(10) <= kv[i]) {
				System.out.println(r.nextInt(10) + " " + kv[i]);
				System.out.println("슛~~~! 세네갈 " + i +"번째 슛 성공합니다.");
				koResult[i] = 1;
			}else {
				System.out.println(r.nextInt(10) + " " + kv[i]);
				System.out.println("슛...! 세네갈 " + i + "번째 슛 실패합니다.");
				koResult[i] = 0;
			}
			
		}
	}
	
	
	//대진결과 출력하기
	public void printResult() {
		int ko = 0;
		int sg = 0;

		System.out.println("\n\n***** 한국 vs 세네갈 *****");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d차전: %d : %d\n", i, koResult[i], sgResult[i]);
			ko += koResult[i];
			sg += sgResult[i];
		}
		System.out.println("\n\n***** 최종 스코어 *****");
		System.out.printf("한국 %d : 세네갈 %d", ko, sg);	
	}
	
}
