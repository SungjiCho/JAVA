package pk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KoreaTeam {

	
	String[] KoreaKickers; //한국 키커 선수명단
	int[] KoreaValues; //한국 키커들의 킥성공률
	
	
	//한국 전체 선수명단(이름, 킥성공률)
	private static final HashMap<String, Integer> KoreanPlayers;  
	static{
		KoreanPlayers = new HashMap<String, Integer>();
	
		KoreanPlayers.put("이강인", 9);
		KoreanPlayers.put("오세훈", 7);
		KoreanPlayers.put("엄원상", 8);
		KoreanPlayers.put("조영욱", 7);
		KoreanPlayers.put("정호진", 4);
		KoreanPlayers.put("김세윤", 4);
		KoreanPlayers.put("황태현", 4);
		KoreanPlayers.put("이재익", 3);
		KoreanPlayers.put("김현우", 3);
		KoreanPlayers.put("이지솔", 7);
	}
	

	//전체 선수명단에서 이름 출력하기
	public void printAllPlayers() {
		
		Set<String> key = KoreanPlayers.keySet();
		
		System.out.println("*한국 선발선수 라인업*");
		for(Iterator<String> iterator = key.iterator(); iterator.hasNext();) {
			String keyValue = (String) iterator.next();			
			System.out.println(keyValue);
		}
		System.out.println("=====================");
	}
	
	
	//생성자
	public KoreaTeam() {
		this.KoreaKickers = new String[5];
		this.KoreaValues = new int[5];
	}
	
	//한국 키커선수들을 사용자에게 입력받기
	public int selectKickers(int j, String name) {
		
		if(containsKickers(name)) {
			KoreaKickers[j] = name;
			j++;
		}else {
			System.out.println("선수명단에 없는 이름입니다. 다시 입력해주세요.\n");
		}
		return j;
	}
	
	//전체 선수명단에 입력받은 이름이 있는지 확인하기
	public boolean containsKickers(String name){
		
		for(int i = 0; i < KoreanPlayers.size(); i++) {
			if(!KoreanPlayers.containsKey(name)) {
				return false;	
			}
		}
		return true;				
	}
	
	// 한국 키커 선수명단 가져오기
	public String[] getKickers() {
		return KoreaKickers;
	}
	
	// 한국 키커 선수명단 출력하기
	public void printKickers() {
		System.out.println("*한국 승부차기 라인업*");
		for(int i = 0; i < KoreaKickers.length; i++) {
			System.out.println(i + "번째 키커 : " + KoreaKickers[i]);
		}
	}
	
	// 한국 키커 선수들의 킥성공률 가져오기
	public int[] getKickersValue(){
		
		for(int i = 0; i < 5; i++) {
			KoreaValues[i] = KoreanPlayers.get(KoreaKickers[i]);
		}
		return KoreaValues;
	}
	
	
}
