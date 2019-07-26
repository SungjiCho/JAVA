package pk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class SenegalTeam {
	
	String[] SenegalKickers; //세네갈 키커 선수명단
	int[] SenegalValues; //세네갈 키커들의 킥성공률
	
	//세네갈 전체 선수명단(이름, 킥성공률)
	private static final HashMap<String, Integer> SenegalPlayers;
	static{
		SenegalPlayers = new HashMap<String, Integer>();
	
//		SenegalPlayers.put("D.Ndiaye", 2);
		SenegalPlayers.put("S.Aw", 8);
		SenegalPlayers.put("S.Cisse", 9);
		SenegalPlayers.put("M.Ndiaye", 7);
		SenegalPlayers.put("O.Cavin Diange", 6);
		SenegalPlayers.put("A.Ciss", 7);
		SenegalPlayers.put("A.Dionkou", 6);
		SenegalPlayers.put("I.Niane", 5);
		SenegalPlayers.put("O.Niang", 4);
		SenegalPlayers.put("A.Sagna", 4);
		SenegalPlayers.put("Y.Badji", 5);		
	}
	
	
	//전체 선수명단에서 이름 출력하기
	public void printAllPlayers() {
		
		Set<String> key = SenegalPlayers.keySet();
		
		System.out.println("\n*세네갈 선발선수 라인업*");
		for(Iterator<String> iterator = key.iterator(); iterator.hasNext();) {
			String keyValue = (String) iterator.next();			
			System.out.println(keyValue);
		}
		System.out.println("=====================");
	}
	
	
	//생성자
	public SenegalTeam() {
		this.SenegalKickers = new String[5];
		this.SenegalValues = new int[5];
	}
	
	//세네갈 키커 랜덤으로 뽑기
	public void randomKickers() {
		ArrayList<String> PlayersList = new ArrayList<String>(SenegalPlayers.keySet());		
		
		int[] r = getRandomArr();
		
		for(int i = 0; i < r.length; i++) {
			SenegalKickers[i] = PlayersList.get(i);			
		}
		
	}
	
	
	//중복없이 임의의 수 뽑기
	public int[] getRandomArr() {
				
		int[] randomArr = new int[5];
		
		for(int i = 0; i < randomArr.length; i++) {								
			randomArr[i] = (int)(Math.random()*10);			
			for(int j = 0; j < i; j++) {
				if(randomArr[i] == randomArr[j]) {
					i--;
					break;
				}
			}			
		}		
		return randomArr;		
	}
	
	
	// 세네갈 키커 선수명단 가져오기
	public String[] getKickers() {
		return SenegalKickers;
	}

	
	// 세네갈 키커 선수명단 출력하기
	public void printKickers() {
		System.out.println("*세네갈 승부차기 라인업*");
		for(int i = 0; i < SenegalKickers.length; i++) {
			System.out.println(i + "번째 키커 : " + SenegalKickers[i]);
		}
	}
	
	// 세네갈 키커 선수들의 킥성공률 가져오기
	public int[] getKickersValue(){
		for(int i = 0; i < SenegalValues.length; i++) {
			SenegalValues[i] = SenegalPlayers.get(SenegalKickers[i]);
		}
		return SenegalValues;
	}
		
}
