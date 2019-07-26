package pk;

import java.util.Scanner;

import pk.PenaltyKick;
import pk.SenegalTeam;


public class Main {
	public static void main(String[] args) {
		
		System.out.println("한국 vs. 세네갈 승부차기 게임에 오신 것을 환영합니다.");
		System.out.println("당신은 이제부터 한국팀 축구감독이 되어 승부차기 선수들을 선발해야 합니다.\n");	
		
		Scanner stdIn = new Scanner(System.in);
		SenegalTeam s = new SenegalTeam(); //세네갈팀 객체생성
		KoreaTeam k = new KoreaTeam(); //한국팀 객체생성		
			
		//세네갈 전체명단 출력하기
		while(true) {
			System.out.println("먼저 세네갈 선수들의 전체명단을 확인하시겠습니까?(단, 한 번만 열람 가능)");
			System.out.print("(1)네  (2)아니오 : ");
			int check = stdIn.nextInt();
			
			if(check == 1) {
				s.printAllPlayers();
				break;				
			}else if(check == 2) {
				System.out.println("\n세네갈 선발선수 라인업 확인 기회가 끝나셨습니다.");
				break;
			}else {
				System.out.println("\n잘못 입력하셨습니다.");
			}
		}
		
		
		//한국 전체명단 출력하기
		System.out.println("\n당신은 한국팀의 감독입니다. 선수들을 확인해주세요.\n");
		k.printAllPlayers();
		
		
		//사용자가 선발한 키커이름 입력받기
		System.out.println("\n한국선수 명단에서 승부차기 키커 5명을 선택해주세요(단, 이름을 정확히 입력).");
		int n = 0;
		while(n < 5) {		
			System.out.print((n+1) + "번째 키커 입력 : ");
			int j = k.selectKickers(n, stdIn.next());
			n = j;
		}
		
		//사용자가 선발한 한국 키커명단 출력하기
		System.out.println("\n당신이 선발한 한국 승부차기 선수명단입니다.\n");
		k.printKickers();
		
		//랜덤으로 선발한 세네갈 키커명단 출력하기
		System.out.println("\n세네갈 감독이 승부차기 선수들을 공개합니다.");		
		s.randomKickers();
		s.printKickers();
		
		
		
		
		//승부차기 시작
		System.out.println("\n이제 본격적으로 승부차기를 시작하겠습니다.");					
		
		String[] sgName = s.getKickers();  //세네갈 키커들의 이름
		int[] sgValue = s.getKickersValue();   //세네갈 키커들의 슛 성공률		
		String[] koName = k.getKickers();  //한국 키커들의 이름
		int[] koValue = k.getKickersValue();     //한국 키커들의 슛 성공률
		
		PenaltyKick p = new PenaltyKick();
		
		
		System.out.println("삑~~~! 승부차기를 시작합니다.");
		
		p.PK(sgName, sgValue, koName, koValue); //승부차기 메소드
		p.printResult(); //승부차기 결과출력
		
		stdIn.close();

	}
}
