package HW;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		
		
		Scanner stdIn = new Scanner(System.in);
		
		// 인턴평가점수 - 최종합계 150점이 넘으면 정직원 전환
		int internScore1 = 0; //업무처리
		int internScore2 = 0; //현장체험
		
		
		/* 미생 시뮬레이션 시작*/
		System.out.println("미생 인턴 시뮬레이션에 오신 것을 환영합니다.");
		System.out.println("(1)시작  (2)배경이야기  (3)나가기");		
		System.out.print("입력: "); int option1 = stdIn.nextInt();
		
		//시작 옵션을 제외한 나머지 모든 경우의 수를 조건문으로 처리하기
		switch(option1) {
		
		case 3:
			System.out.println("미생 시뮬레이션을 종료합니다.");
			break;
		
		case 2:
			System.out.println("---------------------------------*미생 배경이야기*---------------------------------");
			System.out.println("프로 바둑기사 입단이 좌절된 후, 원인터내셔널에 입사한 장그래");
			System.out.println("유일한 여자 동기 안영이, 엘리트 사원 장백기, 현장 중시 한석율이 등장하여");
			System.out.println("직장 동료간의 갈등, 업무과정 및 회사생활을 그린 시뮬레이션입니다.");
			System.out.println("인턴 시뮬레이션의 배경이 되는 원인터내셔널은 실제 회사인 대우인터내셔널을 모티브로 하였습니다.");
			System.out.println("무역상사 원인터내셔널의 인턴이 되어 정직원을 목표로 고군분투하는 회사생활을 체험할 수 있습니다.");
			System.out.println("인턴 평가 점수가 100점이 넘으면 정직원이 될 수 있습니다.");

			System.out.println("시뮬레이션을 시작하시겠습니까?");
			System.out.println("(1)시작  (0)나가기");		
			System.out.print("입력: "); option1 = stdIn.nextInt();
			
			if(option1 == 0) {
				System.out.println("아쉽지만 다음 기회에 만나요.");
				System.out.println("미생 시뮬레이션을 종료합니다.");
				break;
			}
			
		case 1:
			System.out.println("\n미생 시뮬레이션을 시작하겠습니다.");
			System.out.println("미생 등장인물 중 한 명을 선택하여 해당 등장인물로 인턴생활을 체험하게 됩니다.");
			System.out.println("각 등장인물에 대한 설명을 열람하실 수 있습니다.");
			System.out.println("캐릭터 설명을 먼저 확인하시겠습니까?");
			System.out.println("(1)설명보기  (2)스킵하기");
			System.out.print("입력: ");
			
			//하나의 경우의 수로 캐릭터 설명보기
			if(stdIn.nextInt() == 1) {
				System.out.println("---------------------------------*미생 캐릭터 설명*---------------------------------");
				System.out.println("원인터네셔널 신입사원들은 장그래, 안영이, 장백기, 한석율이 있습니다.");
				System.out.println("총 4명의 캐릭터 중 한 명을 선택하여 신입사원의 삶을 체험할 수 있습니다.");
				System.out.println("*장그래: 영업3팀 계약직 직원");
				System.out.println("프로 바둑기사 입단이 좌절된 후 고졸학력으로 원인터네셔널에 인턴으로 입사해 우여곡절을 겪게됩니다.");
				System.out.println("*안영이: 자원2팀 정사원");
				System.out.println("유일한 여자 신입사원으로 모든 부분에서 완벽한 실력자지만 찌질한 상관들 밑에서 일하면서 속앓이를 하게 됩니다.");
				System.out.println("\n자, 그럼 캐릭터를 결정해 볼까요?");
			}
			
			//캐릭터 결정하기
			System.out.println("\n다음 캐릭터 중 한 명을 선택해주세요.");
			System.out.println("(1)장그래\n(2)안영이");
			System.out.print("입력: "); int option2 = stdIn.nextInt();
			
			//변수opt2값 예외처리 - 주인공 장그래로 자동 캐릭터 결정해주기
			if(option2 != 1 && option2 != 2) {
				System.out.println("\n마음에 드는 캐릭터가 없으신가요? 캐릭터 선정에 실패하였습니다.");
				System.out.println("아쉽지만 인생의 결정을 여러 차례 번복하기는 어렵죠.");
				System.out.println("본 시뮬레이션에서는 자동으로 미생 원작의 주인공인 장그래로 결정됩니다.");
				System.out.println("캐릭터 장그래로 시작하시겠습니까?");
				System.out.println("(1)예  (2)나가기");
				System.out.print("입력: "); int temp = stdIn.nextInt();
					
				if(temp == 1) {
					option2 = temp;
					System.out.println("주인공으로 자동 결정되었습니다.");
					
				}else if(temp == 2){
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
					
				}else {
					System.out.println("자동 캐릭터 선정에 실패하셨습니다.");
					System.out.println("본 시뮬레이션은 주어진 등장인물 중 캐릭터 선정이 반드시 필요합니다.");
					System.out.println("아쉽지만 다음 기회에 만나도록 하죠.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
			}
			
			
			/* 사용자 결정에 따른 각 캐릭터의 인턴생활 시뮬레이션 시작 */
			switch(option2) {
			
			case 1:	//장그래	
				
				System.out.println("\n당신은 이제부터 원인터네셔널 인턴 장그래입니다.");
				System.out.println("자, 준비되셨나요? 출발합니다!");
				System.out.println("\n---------------------------------*1장. 장그래의 집*---------------------------------");
				System.out.println("인턴 첫날, 출근 준비를 하기 위해 양복 윗도리를 입고 거울 앞에 선 당신");
				System.out.println("조금 헐렁한 느낌, 품은 크고 소매와 다리는 좀 짧다.");
				System.out.println("어머니가 다가 오시더니 매여져 있는 넥타이를 들고 오신다.");
				System.out.println("\n어머니: \"구식이라도 아버지 것 중에 제일 고급이야. 하루만 입어. 오늘 사둘게\"");
				System.out.println("\n당신은 일찍 돌아가신 아버지 생각에 힘 없이 웃으며 넥타이를 받았다.");
				System.out.println("어머니에게 어떻게 답할 것인가? (단, 보기에 없는 값 입력 시에도 계속 진행)");
				System.out.println("(1)\"어머니, 제 것으로 하고 갈게요.\"");
				System.out.println("(2)\"어머니, 아직 안버리셨어요? 하고 갈게요.\"");
				System.out.print("입력: ");

				if(stdIn.nextInt() == 1) {
					System.out.println("\n어머니: \"그래...아버지 것은 다 낡았구나...그러렴 그래야.\"");
				}else {
					System.out.println("\n어머니: \"그래, 아버지 힘을 받아서 회사에서 주눅들지 말어.\"");
				}
				
				System.out.println("당신은 넥타이 매듭을 당기면서 어머니를 보고 방긋 웃는다.");
				System.out.println("시계를 보니 어느새 출발해야할 시간이다.");
				System.out.println("\n어머니: \"그래야, 밥 먹고 가야지\"");
				System.out.println("어머니에게 어떻게 답할 것인가? (단, 보기에 없는 값 입력 시에도 계속 진행)");
				System.out.println("(1)\"너무 늦었어요. 가면서 사먹을게요.\"");
				System.out.println("(2)\"빨리 먹고 갈게요 그럼.\"");
				System.out.print("입력: ");

				if(stdIn.nextInt() == 1) {
					System.out.println("\n당신은 공복상태로 어머니에게 짧게 인사를 건네고는 문을 나선다.");
				}else {
					System.out.println("\n당신은 허겁지겁 밥에 물을 말아 마시고는 문을 나선다.");
				}
								
				//2장으로 장면 전환하기
				System.out.println("\n2장으로 가시겠습니까?");
				System.out.println("(1)네  (0)종료  (단, 잘못 입력시 자동전환)");
				System.out.print("입력: "); 
				
				if(stdIn.nextInt() == 0) {
					System.out.println("아쉽군요. 첫 출근을 포기하다뇨.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
				
				System.out.println("\n---------------------------------*2장. 원인터네셔널 첫 출근*---------------------------------");
				
				System.out.println("당신은 원인터네셔널 건물에 도착했다.");
				System.out.println("회사건물 안으로 들어가 영업3팀 자리에 도착했다.");
				System.out.println("이리 저리 전화 하는 사람들, 서거나 앉아서 컴퓨터를 들여다 보는 사람들이 보인다.");
				System.out.println("빈 영업 3팀 안에서 바쁘게 돌아가는 원인터 풍경을 멍~하게 바라보고 앉아 있는데,");
				System.out.println("정신없이 통화하고 있는 남자분이 영업3팀 자리로 온다. 사원증에는 김동식 대리라고 적혀있다.");
				System.out.println("\n김동식 대리: \"(전화하며)네, 사장님 드래프트 보내주세요. 확인하고 컨펌 드릴께요.\"");
				System.out.println("그때 대리님이 어색하게 굳은 몸짓으로 있는 당신을 눈으로 쫓으며 본다. ");
				System.out.println("대리님은 전화를 끊고 이메일을 보내는데, 당신은 뭘 해야 할지 몰라 엉거주춤 서 있다.");
				System.out.println("김동식 대리는 당신을 답답한 듯 후~보다가 들고 있던 문서를 휙 준다.");
				System.out.println("\n김동식 대리: \"복사 좀 해 와요. 26년 동안 복사 한번은 해봤겠지.\"");
				System.out.println("\n이런...당신은 복사를 한번도 해본적이 없다. 심지어 복사기가 어디에 있는지, 몇 장을 해야하는지도 모르겠다.");
				System.out.println("김동식 대리님께 물어볼 것인가? (단, 보기에 없는 값 입력 시에도 계속 진행)");
				System.out.println("(1)복사기가 어디있는지, 몇장을 헤야하는지 여쭤본다.");
				System.out.println("(2)복사기가 어디있는지만 여쭤본다.");
				System.out.println("(3)몇장을 해야하는지만 여쭤본다.");
				System.out.print("입력: "); int gChoice1 = stdIn.nextInt();
				System.out.println();
				
				
				/* 복사하기 - 업무처리 점수 */
				switch(gChoice1){			
				
				//복사기 위치 및 장수 물어본 경우
				case 1: 
					System.out.println("당신은 대리님께 복사기는 어디있는지, 몇 장씩 해야 하는지 여쭤보았다.");
					System.out.println("대리님이 놀라고 울컥한 표정을 짓는다.");
					System.out.println("김동식 대리: \"(꾹 참고 복사기 방향 가리키며) 저기에, 그리고 한. 장. 씩.\"");
					System.out.println("허겁지겁 복사하러 가는데 뒤에서 대리님의 말소리가 들린다.");
					System.out.println("\n김동식 대리: \"업무처리 30점밖에 못주겠네...허~참\"");
					System.out.println("당신은 업무처리에서 100점 만점에 30점을 받았다..."); internScore1 = 30;
					System.out.println("\n당신의 업무처리 평가점수는 " + internScore1 + "점 입니다. 인정하시겠습니까?");
					System.out.println("(1)확인  (2)퇴사  (단, 잘못 입력 시 자동 진행)");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 첫날부터 퇴사라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;
					}
									
					System.out.println("\n당신이 민망하여 얼른 의자에서 일어나서 복사실로 달려간다.");					
					System.out.println("허겁지겁 뛰어오니 복사실이 보인다. 숨이 가쁘다.");
					System.out.println("그런데 복사기가 용지없음을 알리고 있다...!");
					System.out.println("마침 들어오는 인턴 이상현, 판에 박힌 미소를 지으며 나에게 목례하고 커피를 탄다.");
					System.out.println("당신은 인턴 이상현에게 복사용지가 어딨는지 물어볼 것인가?");
					System.out.println("(1)물어본다.  (2)혼자 해결한다.");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n당신은 복사용지를 어디서 채우면 되는지 결국 물어보았다.");
						System.out.println("이상현 인턴: \"거기 밑에 수납장 열어 보세요.\"");
						System.out.println("당신이 열어 보는데 없어서 당황하며 다른 곳을 물어본다.");
						System.out.println("이상현 인턴: \"(웃으며) 그럼 비품실에서 갖고 오셔야죠.\"");
						System.out.println("\n당신은 고맙다고 이야기한 후 급히 비품실로 달려나가려는데 김동식 대리가 들어온다.");
						System.out.println("김동식 대리: \"장그래씨 무슨 복사를 한나절이나 해요. 용지가 없네. 어디있는지 알고 있어요?");
						System.out.println("당신은 어디라고 대답하겠는가? 정답 시 업무처리 추가점수가 부여된다. (힌트: 이상현 인턴의 대답, 3글자)");
						System.out.print("띄어쓰기 없이 정확히 입력: ");
						
						if(stdIn.next() == "비품실") {
							System.out.println("\n정답입니다.");
							System.out.println("업무처리에 10점이 추가되었습니다."); internScore1 += 10;
							System.out.println("\n김동식 대리: \"알고 있네? 얼른 갔다와요!\"");
						}else {
							System.out.println("\n오답입니다.");
							System.out.println("아쉽군요. 추가점수가 없습니다.");
							System.out.println("\n하...한숨 나오는 구만. 비품실에 있어요. 얼른 갔다와요.");
						}											

					}else {
						System.out.println("\n당신이 어찌할 줄 몰라 멍하니 있는데 또 다른 인턴이 탕비실로 들어온다.");
						System.out.println("가볍게 목례하고 다시 복사기를 우두커니 보고 있는데 뒤에서 속닥이는 소리가 들린다.");
						System.out.println("\n인턴2: \"어? 저기 나가는 친구가 그 친군가 봐요.\"");
						System.out.println("이상현 인턴: \"그 친구요?\"");
						System.out.println("인턴2: \"(속닥)낙하산~!\"");
						System.out.println("이상현 인턴: \"아~!! 어쩐지이~");
						System.out.println("\n다 들어버린 당신은 어찌할 바를 모르고 있는데, 김동식 대리가 들어온다.");	
						System.out.println("김동식 대리: \"아, 진짜 무슨 복사를 한나절이나 하냐구요. 복사용지도 없구만.\"");
						System.out.println("다른 인턴 둘이 당신이 혼나는 모습을 보며 수군거린다.");
						System.out.println("김동식 대리가 눈치를 주자 대리님께 가볍게 목례하고는 웃으면서 복사실을 나간다.");
						System.out.println("\n김동식 대리: \"A4용지도 없구만? 어디있는지 모르겠지. 얼른 비품실에 다녀와요.\"");
						System.out.println("당신은 다급히 비품실로 향했다.");
					}
					
					// 비품실에 가서 복사용지 가져오기
					System.out.println("당신은 비품실에 들러 무거운 A4 상자를 발견한다.");
					System.out.println("김동식 대리가 당신에게 건네준 문서는 총 50장이다.");
					System.out.println("몇 장의 A4용지가 필요한가? (힌트: 김동식 대리가 문서 한 장당 몇 장씩 복사해야 한다고 가르쳐주었다.)");
					System.out.print("숫자만 정확히 입력: ");
					
					if(stdIn.nextInt() == 50) {
						System.out.println("\n정답입니다.");
						System.out.println("업무처리에 10점이 추가되었습니다."); internScore1 += 10;
						System.out.println("\n당신은 A4용지 50장을 챙긴채 복사실로 달려갔다.");
						System.out.println("김동식 대리가 당신 손에 있는 용지를 보면서 말한다.");
						System.out.println("김동식 대리: \"그래도 잘 챙겨왔네요.\"");
						System.out.println("김동식 대리: \"(문서를 낚아채 일괄기능으로 작동하며) 정말 복사 안 해 봤어요? 26년 동안?");
						System.out.println("\n당신은 당혹스러워하며 죄송하다고 말씀드린다.");
						System.out.println("김동식 대리는 얕은 한숨을 쉬며 궁금한 것이 있으면 물어보라고 말하며 복사실을 나갔다.");
					}else {
						System.out.println("\n오답입니다.");
						System.out.println("아쉽군요. 추가점수가 없습니다.");
						System.out.println("\n당신은 다급하여 용지 한 통째 들고 복사실로 달려갔다.");
						System.out.println("김동식 대리가 어이 없이 보면서 복장 터져한다.");
						System.out.println("김동식 대리: \"아이, 뭐합니까아~? 뭐해요오~! 내가 한장씩 한다고 말했죠!\"");
						System.out.println("김동식 대리: \"(답답해 하며 용지박스를 열며) 정말 복사도 안해봤구나, 장그래씨.\"");
						System.out.println("\n당신은 당혹스러워 연신 죄송하다고 하였다.");
						System.out.println("김동식 대리는 복사를 끝내고는 개운치 않은 표정으로 나가버렸다.");
					}				
					break;
				
				//복사기 위치만 물어본 경우	
				case 2: 
					System.out.println("당신은 두리번거리다 결국 대리님께 복사기의 위치를 묻는다.");
					System.out.println("대리님이 놀란 표정을 짓는다.");
					System.out.println("김동식 대리: \"(헐? 복사기 방향 가리키며) 저기에\"");
					System.out.println("당신이 민망하여 허겁지겁 복사기가 있는 방향으로 뛰어가는데, 대리님의 말소리가 들린다.");
					System.out.println("\n김동식 대리: \"업무처리 50점밖에 못주겠네...허~참\"");
					System.out.println("당신은 업무처리에서 100점 만점에 50점을 받았다..."); internScore1 = 50;
					System.out.println("\n당신의 업무처리 평가점수는 " + internScore1 + "점 입니다. 인정하시겠습니까?");
					System.out.println("(1)확인  (2)퇴사  (단, 잘못 입력 시 자동 진행)");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 첫날부터 퇴사라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;
					}
					
					System.out.println("\n당신이 민망하여 얼른 의자에서 일어나서 복사실로 달려간다.");					
					System.out.println("허겁지겁 뛰어오니 복사실이 보인다. 숨이 가쁘다.");
					System.out.println("그런데 복사기가 용지없음을 알리고 있다...!");
					System.out.println("종이를 찾기 위해 두리번거리는데 때마침 김동식 대리님이 들어온다.");
					System.out.println("\n김동식 대리: \"장그래씨 문서당 복사본이 몇개나 필요한지 아세요?\"");
					System.out.println("김동식 대리: \"뭐야 용지도 없잖아. A4용지 어디있는지 알아 장그래씨?\"");
					System.out.println("\n당신은 대리님께 어떻게 대답할 것인가?");
					System.out.println("(1)보통 비품실에 있지 않나요?");
					System.out.println("(2)부서 수납장에 있지 않나요?.");
					System.out.println("(3)카페테리아 창고에 있지 않나요?");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n정답입니다.");
						System.out.println("업무처리에 10점이 추가되었습니다."); internScore1 += 10;
						System.out.println("\n김동식 대리: \"어? 그래도 사전교육은 열심히 들었나보네? 잘 찍는건가?\"");
						System.out.println("김동식 대리: \"얼른 비품실에서 복사용지 가지고 와요.\"");						
					}else {
						System.out.println("\n오답입니다.");
						System.out.println("아쉽군요. 추가점수가 없습니다.");
						System.out.println("\n김동식 대리: \"사전교육도 열심히 안들었나보네...\"");
						System.out.println("김동식 대리: \"도대체 할 수 있는게(한숨). 비품실에 있어. 갔다와요.\"");						
					}
					
					// 비품실에 가서 복사용지 가져오기
					System.out.println("당신은 비품실에 들러 무거운 A4 상자를 발견한다.");
					System.out.println("허겁지겁 통째로 들고 오는데 마침 커피 타러 들어오던 인턴 안영이가 멈칫 선다.");
					System.out.println("안영이씨가 용지 박스를 보면서 말한다.");
					System.out.println("\n안영이 인턴: \"그거 통째로 가지고 다니시면...한 뭉치만 들고 가도 될 것 같은데...수고하세요.\"");
					System.out.println("당신은 안영이 인턴의 말을 들을 것인가? 아니면 우선 대량으로 가지고 갈 것인가?");
					System.out.println("(1)대량으로 가져간다.  (2)소분된 양만 들고 간다.");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("당신은 안영이에게 감사하다는 뜻으로 목례하고는 통째로 우선 들고간다.");
						System.out.println("\n김동식 대리: \"아니...장그래씨 이걸 다들고 왔어요? 몇장씩 해야하는지도 몰라요?\"");
						System.out.println("대리님이 복장터지는 모습을 보게 되었다.");
						System.out.println("김동식 대리: \"내가 복사할테니까 비켜봐요.\"");
						System.out.println("김동식 대리는 능숙한 듯 문서를 복사하고는 개운치 않은 표정으로 복사실을 나가버렸다.");
					}else {
						System.out.println("당신은 안영이에게 감사하다고 말하고는 한 뭉치만 남긴채 큰 박스는 내려 놓았다.");
						System.out.println("큰 박스를 다시 탕비실에 가져다 놓고는 복사실로 허겁지겁 뛰어왔다.");
						System.out.println("\n김동식 대리: \"왜 이렇게 늦었...그래도 잘 가져왔네요.\"");
						System.out.println("\n업무처리에 10점이 추가되었습니다."); internScore1 += 10;
						System.out.println("김동식 대리: \"급하니까 복사는 내가 할게요.\"");
						System.out.println("김동식 대리는 능숙한 듯 문서를 복사하고는 황급히 복사실을 나갔다.");
					}
					break;
				
				//복사 장수만 물어본 경우	
				case 3: 
					System.out.println("당신은 몇 장씩 하면 되는지 결국 여쭤보았다.");
					System.out.println("대리님은 울컥한 표정을 짓는다.");
					System.out.println("김동식 대리: \"(울컥하지만 꾹 참고) 한. 장. 씩.\"");
					System.out.println("당신이 민망하여 얼른 의자에서 일어나서 나가려는데 대리님의 말소리가 들린다.");
					System.out.println("\n김동식 대리: \"업무처리 70점밖에 못주겠네...허~참\"");
					System.out.println("당신은 업무처리에서 100점 만점에 70점을 받았다..."); internScore1 = 70;
					System.out.println("\n당신의 업무처리 평가점수는 " + internScore1 + "점 입니다. 인정하시겠습니까?");
					System.out.println("(1)확인  (2)퇴사  (단, 잘못 입력 시 자동 진행)");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 첫날부터 퇴사라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;
					}
					
					System.out.println("\n당신이 민망하여 얼른 의자에서 일어났다.");					
					System.out.println("무작정 부서를 빠져나와 걷고 있는데, 복사실이 도무지 어디인지 모르겠다...");
					System.out.println("마침 장백기 인턴이 앞을 지나가고 있다.");
					System.out.println("당신은 장백기 인턴에게 복사실이 어디인지 묻겠는가?");
					System.out.println("(1)묻기  (2)지나가기");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n당신은 가볍게 인사하고는 장백기에게 복사실이 어딨는지 물었다.");
						System.out.println("장백기는 그것도 모르냐는 표정을 짓더니 이내 방향을 가르쳐주었다.");
						System.out.println("당신은 그 방향으로 터벅터벅 걸어갔다.");
						System.out.println("복사실 앞에 도착하니 김동식 대리가 마침 들어가는 중이었다.");
						System.out.println("김동식 대리: \"얼른 안오고 뭐했어요? 바빠죽겠는데? 얼른 들어와요.\"");
					}else {
						System.out.println("\n당신은 가볍게 목례하고는 다시 정처없이 회사 안을 돌아다녔다.");
						System.out.println("그때 저멀리 김동식 대리님이 다가온다.");
						System.out.println("김동식 대리: \"아니, 장그래씨 복사실에 있어야할 사람이 왜 여기있어요? 황당하네.\"");
						System.out.println("당신은 당황하여 복사실 위치를 못찾겠다고 이야기한다.");
						System.out.println("김동식 대리: \"장그래씨, 그러면 물어봐야죠~! 일바빠 죽겠는데 뭐해요!\"");
						System.out.println("\n당신의 업무처리 점수가 10점 감점되었습니다."); internScore1 -= 10;
						System.out.println("\n김동식 대리는 언짢은 듯 나에게 손짓하며 따라오고 한다.");	
					}
					
					System.out.println("\n*복사실 안*");
					System.out.println("김동식 대리: \"아 진짜 무슨 복사를 한나절이나 하러 가냐구요. 어라? 복사용지가 없는데?\"");
					System.out.println("김동식 대리는 투덜대더니 능숙하게 부족한 용지를 복사기에 채운다.");
					System.out.println("김동식 대리: \"장그래씨, 내가 너무 바쁘니까 이거 설정 좀 하고 있어봐요.\"");
					System.out.println("\n당신은 두려운 마음으로 복사기 앞으로 다가간다. 한 장당 몇 장씩 복사해야 하는지 묻고 있다.");
					System.out.println("당신은 어떤 옵션을 설정하겠는가?");
					System.out.println("(1)1장씩  (2)2장씩  (3)3장씩   (힌트: 김동식 대리의 설명)");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n당신은 1장씩 문서를 복사하여 정리를 하였다.");
						System.out.println("한참 정리하고 있는데 김동식 대리가 볼일을 마치고 복사실로 돌아왔다.");
						System.out.println("김동식 대리: \"용케 복사는 잘 해놨네요? 그대로 줘요.\"");
						System.out.println("\n업무처리에 10점이 추가되었습니다."); internScore1 += 10;
						System.out.println("\n대리님은 정신 없다는 듯 허겁지겁 복사본을 가지고 복사실을 나갔다.");
					}else {
						System.out.println("\n당신은 몇 부의 문서를 복사하고 있다가 문득 대리님이 1장씩 하라는 말이 기억났다.");
						System.out.println("그러나 때마침 김동식 대리가 볼일을 마치고 복사실로 들어오는 중이었다.");
						System.out.println("\n김동식 대리: \"아니 장그래씨, 내가 한장씩이라고 설명했잖아요오~! 이게 뭔가 정말.\"");
						System.out.println("\n업무처리에서 10점이 감점되었습니다."); internScore1 -= 10;
						System.out.println("\n대리님은 화난다는 듯한 표정으로 한부만 복사본을 휙 가져가더니 이내 밖으로 나갔다.");
					}					
					break;
					
				//복사 보기에 없는 값을 입력한 경우	
				default: 
					System.out.println("당신은 너무 긴장한 나머지 화장실에 가고 싶다.");
					System.out.println("그런데 화장실이 어디있는지 모르겠다...");
					System.out.println("어쩔 수 없이 대리님께 화장실이 어디있는지 여쭤보았다.");
					System.out.println("대리님은 황당하고 울컥한 표정을 짓는다.");
					System.out.println("김동식 대리: \"저기 뒤에! 그래씨 화장실까지 가르쳐야해? 다시 줘! 내가 복사할거야.");
					System.out.println("화난 대리님의 얼굴을 뒤로 하고 당신은 화장실로 뛰어갔다. 그때 대리님의 말소리가 저멀리서 들린다.");
					System.out.println("\n김동식 대리: \"업무처리 0점!\"");
					System.out.println("당신은 업무처리에서 100점 만점에 0점을 받았다...");
					System.out.println("\n당신의 업무처리 평가점수는 " + internScore1 + "점 입니다. 인정하시겠습니까?");
					System.out.println("(1)확인  (2)퇴사  (단, 잘못 입력 시 자동 진행)");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 첫날부터 퇴사라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;
					}
					
					System.out.println("\n당신이 정신없이 화장실에 왔다.");
					System.out.println("볼일을 본 후 눈을 들어보니 장백기 인턴이 손을 닦고 있다.");
					System.out.println("당신은 급한 나머지 장백기에게 다짜고짜 복사실이 어디있는지 물었다.");
					System.out.println("\n장백기 인턴: \"(황당한듯) 밖으로 나가서 왼쪽으로 가면 있잖아요?\"");
					System.out.println("\n당신은 장백기에게 고맙다며 말을 전하고는 황급히 복사실로 간다.");
					System.out.println("그런데 마침 김동식 대리가 이미 복사를 마친 묹서를 들고 부서로 유유히 빠져나가고 있었다.");
					
					break;						
				}
				
				System.out.println("당신은 복사실에서 잠시 숨을 돌린다.");
				System.out.println("그러다 문득 아버지가 돌아가시던 밤, 너무나 어두웠던 그 밤이 떠오른다.");
				System.out.println("독백: \"그래 너무 아프니까.\"");
				System.out.println("독백: \"난 그냥 열심히 하지 않은 편이어야 한다.\"");
				System.out.println("독백: \"난 열심히 하지 않아서 세상으로 나온 거다.\"");
				System.out.println("독백: \"난 열심히 하지 않아서 버려진 것 뿐이다.\"");
				System.out.println("\n당신은 스스로 다짐하듯 외우고, 이내 첫 출근 일정이 끝나갔다.");
				
				
				//3장으로 장면 전환하기
				System.out.println("\n3장으로 가시겠습니까?");
				System.out.println("(1)네  (0)종료  (단, 잘못 입력시 자동전환)");
				System.out.print("입력: "); 
				
				if(stdIn.nextInt() == 0) {
					System.out.println("아쉽군요. 여기서 포기하다뇨.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
				
				System.out.println("\n---------------------------------*3장. 젓갈 공장*---------------------------------");
				
				System.out.println("오늘은 아침부터 모든 인턴들이 모여있다.");
				System.out.println("당신은 어머니가 신경 써주신 새 양복을 입고 서있다.");
				System.out.println("오상식 과장: \"인턴 여러분, 저는 오상식 과장입니다. 다들 오늘 현장체험 있는건 알죠?\"");
				System.out.println("오상식 과장: \"(나의 새 옷을 흘끗 보며) 젓갈 만들어서 미국에 보낼 건데 말이야.\"");
				System.out.println("오상식 과장: \"거기에 꼴뚜기가 섞여 있음 그게 오징어젓이야? 꼴뚜기 젓이야?\"");
				System.out.println("오상식 과장: \"그럼 원인터 망신은 꼴뚜기가 다 시키겠지? 무슨 일이 있어도 꼴뚜기 찾아내.\"");
				System.out.println("\n모든 인턴들이 당황하는 표정을 보인다.");
				System.out.println("오상식 과장: \"분위기 왜 이래? 시베리아 가서 에어컨 팔아 오란 것도 아닌데?\"");
				System.out.println("모든 인턴들이 심린하지만 표정을 관리하는 것이 보인다.");
				System.out.println("\n젓갈 공장으로 이동하시겠습니까?");
				System.out.println("(1)출발  (2)퇴사  (단, 잘못 입력 시 자동 진행)");
				System.out.print("입력: ");
				
				if(stdIn.nextInt() == 2) {
					System.out.println("아쉽군요. 도전을 포기하다뇨.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
				
				System.out.println("\n당신은 다른 인턴들과 함께 젓갈 공장에 도착했다.");
				System.out.println("이리저리 주변을 둘러보고 있는데 어느새 다른 인턴들의 웅성거리는 소리가 들려 찾아가 본다.");
				System.out.println("\n거기에는 공장장이 오셨다.");
				System.out.println("공장장: \"원인터 인턴들 맞지예? 현장체험 하시모 기본 태도점수 50점 나옵니더.\"");
				System.out.println("공장장: \"도와주실거모 여기 현장리스트 본인이름에다 체크하이소.\"");
				System.out.println("당신은 현장체험에 참여할 것인가?");
				System.out.println("(1)참여  (2)나가기");
				
				if(stdIn.nextInt() == 1) {
					System.out.println("\n당신의 태도점수에 50점이 추가되었습니다."); internScore2 += 50;
					System.out.println("\n공장장: \"참여해주시는 분들 감사합니더. 여기 안짝서 작업복 챙겨야 할낍니더.\"");
					System.out.println("\n공장장의 말을 듣고 장백기, 이상현이 재빠르게 모든 도구들을 챙겼다.");
					System.out.println("석호와 당신에게는 고무장화와 고무장갑만 덩그러니 주어졌다.");
					System.out.println("새 옷이라 난감해하자 공장장이 말을 한다.");
					System.out.println("\n공장장: \"작업복이 모자라가 우얍니꺼? 최대한 옷 버리지 않게 조심하이소.\"");

					System.out.println("\n당신은 이내 아침에 새 양복을 꺼내주던 어머니가 떠올랐다.");
					System.out.println("당신은 공장장에게 작업복을 청하겠는가?");
					System.out.println("(1)요청한다.  (2)묵묵히 있는다.");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("당신은 정중히 새 양복임을 말씀드리고 작업복을 부탁드렸다.");
						System.out.println("공장장: \"하이고마, 읎어예~ 우찌 할 방법이 없는기라예.\"");
						System.out.println("\n당신의 태도점수가 10점 감소합니다."); internScore2 -= 10;
					}
					
					/* 꼴뚜기게임 - 현장체험 */
					System.out.println("\n공장장: \"냉장 트럭이라 쪼매 추우니까네~ 웃도리 단디 입고 해야 할낍니더.\"");
					System.out.println("공장장이 따라 오라는 손짓을 한 후 급한 걸음으로 걸어간다.");
					System.out.println("나머지 인턴 일동이 각각의 표정으로 뒤를 따르고, 당신도 걸어간다.");
					System.out.println("\n공장장: \"우리가 선별할 시간도 음고 포대 체로 기계에 드가 뿌믄 우리가 우찌할 방법이 읎어예.\"");
					System.out.println("공장장: \"(뒷마당에 냉장 트럭 앞에 도착하고) 해산물은 쉬이 상하이까네 오늘 중으로 최대한 빨리 볼가야 합니다.\"");
					System.out.println("공장장: \"자! 꼴뚜기 있나 찾는 법을 나가 단디 알려 드릴라니 이리 모이소.\"");
					System.out.println("\n*꼴뚜기 찾기 방법*\n");
					System.out.println("    1   2   3   4");
					System.out.println("1 { @,  @,  @,  @ }\n");   //(1, 4)
					System.out.println("2 { @,  @,  @,  @ }\n");
					System.out.println("3 { @,  @,  @,  @ }\n");   //(3, 2)
					System.out.println("4 { @,  @,  @,  @ }\n");   //(4, 3)
					System.out.println("\n위 그림은 꼴뚜기가 숨어 있는 좌표 지도이다. 여기에는 총 세 마리가 숨어있다.");
					System.out.println("시작 위치는 좌표(1, 1)이다. 여기서 총 3번 움직일 수 있으며, 그 안에 꼴뚜기를 찾으면 승리한다.");
					System.out.println("이동방향은 가로, 세로, 대각선으로 움직일 수 있으며, 한번에 한보 이동할 수 있다.");
					
					System.out.println("\n꼴뚜기 찾기를 시작하시겠습니까? (단, 잘못 입력시 자동진행)");
					System.out.println("(1)시작  (2)퇴사");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 여기서 멈추다뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;
					}else {
						System.out.println("꼴뚜기 찾기를 시작합니다.");
						System.out.println("당신은 좌표(1, 1)에 있습니다."); int x = 1, y = 1;
						System.out.println("\n어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
						System.out.println("(1)가로  (2)세로  (3)대각선"); int direction = stdIn.nextInt();
						
						if(direction == 1) { //1
							System.out.println("가로로 한 보 이동합니다.");
							System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
							System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
							System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
							
							if(direction == 1) { //1-1
								System.out.println("가로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //1-1-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n축하합니다. 여기에 @꼴뚜기@가 있었네요.");
									System.out.println("태도 평가에서 50점이 추가됩니다."); internScore2 += 50;
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //1-1-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //1-1-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //1-1-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else if(direction == 2){ //1-2
								System.out.println("세로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //1-2-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //1-2-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //1-2-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //1-2-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}							
								
							}else if(direction == 3){ //1-3								
								System.out.println("대각선으로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //1-3-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //1-3-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //1-3-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //1-3-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
																
							}else { //1-4
								System.out.println("두 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
								System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
							}
							
						}else if(direction == 2) { //2
							System.out.println("세로로 한 보 이동합니다.");
							System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
							System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
							System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
							
							if(direction == 1) { //2-1
								System.out.println("가로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //2-1-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //2-1-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //2-1-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //2-2-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else if(direction == 2){ //2-2
								System.out.println("세로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //2-2-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n축하합니다. 여기에 @꼴뚜기@가 있었네요.");
									System.out.println("태도 평가에서 50점이 추가됩니다."); internScore2 += 50;
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //2-2-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //2-2-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //2-2-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else if(direction == 3){ //2-3
								System.out.println("대각선으로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //2-3-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //2-3-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //2-3-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //2-3-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else { //2-4
								System.out.println("두 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
								System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
							}
						
						}else if(direction == 3){ //3
							System.out.println("대각선으로 한 보 이동합니다.");
							System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
							System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
							System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
							
							if(direction == 1) { //3-1
								System.out.println("가로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //3-1-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //3-1-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //3-1-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //3-1-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}	
								
							}else if(direction == 2){ //3-2
								System.out.println("세로로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //3-2-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n축하합니다. 여기에 @꼴뚜기@가 있었네요.");
									System.out.println("이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //3-2-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //3-2-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //3-2-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else if(direction == 3){ //3-3
								System.out.println("대각선으로 한 보 이동합니다.");
								System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
								System.out.println("\n다음은 어떤 방향으로 이동하시겠습니까? (단, 보기에 없는 방향 입력시 게임기회가 사라집니다.)");
								System.out.println("(1)가로  (2)세로  (3)대각선"); direction = stdIn.nextInt();
								
								if(direction == 1) { //3-3-1
									System.out.println("가로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 2) { //3-3-2
									System.out.println("세로로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", x, ++y);
									System.out.println("\n축하합니다. 여기에 @꼴뚜기@가 있었네요.");
									System.out.println("태도 평가에서 50점이 추가됩니다."); internScore2 += 50;
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else if(direction == 3) { //3-3-3
									System.out.println("대각선으로 한 보 이동합니다.");
									System.out.printf("당신의 현재 위치는 (%d, %d)입니다.", ++x, ++y);
									System.out.println("\n이런 여기에는 꼴뚜기가 없군요. 아쉽네요.");
									System.out.println("꼴뚜기 찾기가 종료됩니다.");
									
								}else { //3-3-4
									System.out.println("세 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
									System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
								}
								
							}else { //3-4
								System.out.println("두 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
								System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
							}
							
						}else { //4
							System.out.println("첫 번째 이동에서 보기에 없는 방향을 입력하셨군요.");
							System.out.println("이동 가능한 방향이 없어 꼴뚜기 잡기가 끝납니다.");
						}
					}
					
				}else {
					System.out.println("\n당신은 결국 현장체험에 참여하지 않는다.");
					System.out.println("기본 태도점수를 얻는데 실패하였다.");
				}
				
				System.out.println("원인터네셔널에서의 현장체험 날도 끝이 났다.");
				System.out.println("\n당신의 인턴평가 점수는 다음과 같다.");
				System.out.printf("장그래: 업무평가 %d점, 태도평가 %d점, 총 합계 %d점\n\n", internScore1, internScore2, internScore1+internScore2);
				
				// 인턴평가점수 150점이 넘으면 정직원으로 입사
				if(internScore1+internScore2 > 150) {
					System.out.println("장그래씨 축하드립니다.");
					System.out.println("당신은 정식 사원이 되었습니다.");
					System.out.println("미생 인턴 체험을 종료합니다.");
				}else {
					System.out.println("장그래씨 아쉽네요.");
					System.out.println("당신은 정직 시원이 되지 못하였습니다.");
					System.out.println("미생 인턴 체험을 종료합니다.");
				}
							
				break;
				
			
			case 2: //안영이
				
				System.out.println("\n당신은 이제부터 원인터네셔널 인턴 안영이입니다.");
				System.out.println("자, 준비되셨나요? 출발합니다!");
				System.out.println("\n---------------------------------*1장. 섬유3팀 첫 출근*---------------------------------");
				
				System.out.println("당신은 원인터네셔널 건물에 도착했다.");
				System.out.println("회사건물 안으로 들어가 섬유3팀 자리에 도착했다.");
				System.out.println("이리 저리 전화 하는 사람들, 서거나 앉아서 컴퓨터를 들여다 보는 사람들이 보인다.");
				System.out.println("당신은 이미 무역상사에 다녀본 경험이 있다.");
				System.out.println("다만 이전 직장이 원인터와 경쟁사임을 감안해서 경력을 밝히지 않으리라 다짐한다.");
				System.out.println("입술을 꾹 다물고 있는데 마침 섬유3팀 과장님이 급하게 다가오신다.");
				System.out.println("\n섬유3팀 과장: \"자네가 안영이씨? 오늘 인턴 첫날이지?\"");
				System.out.println("섬유3팀 과장: \"(아쉽다는 표정으로) 우리가 말이야, 일이 힘든 부서라서 남자를 원했는데...\"");				
				System.out.println("\n당신은 입술을 꾹 깨물었다. 궂은 일은 일부러 다 도맡아 해야겠다는 결심이 선다.");
				System.out.println("당신은 과장님께 어떤 자세로 일에 대해 여쭤볼 것인가? (단, 보기에 없는 값 입력 시에도 자동 진행)");
				System.out.println("(1)\"과장님, 섬유3팀에서 현재 진행 중인 사업이 있나요?\"");
				System.out.println("(2)\"과장님, 혹시 복사가 필요한 문서나 데이터 정리가 필요한 파일이 있으신가요?\"");
				System.out.print("입력: ");

				if(stdIn.nextInt() == 1) {
					System.out.println("\n섬유3팀 과장: \"그럼! 지금 진행하는 사업이 너무 많아서 인력 모자라던 참이야.\"");
				}else {
					System.out.println("\n섬유3팀 과장: 그런건 다들 바쁘니까 알아서 하는 편이고 진행 중인 사업들이 많지.\"");
				}
				
				System.out.println("\n섬유3팀 과장: \"여자니까 말이지? 흠...야 김사원 대리!\"");
				System.out.println("섬유3팀 과장: \"이번에 엉딩이 뽕인가? 그거 섬유 특수재질로 찍어낸거, 클라이언트 만나야 하잖아?\"");
				System.out.println("김사원 대리: \"네, 그렇습니다. (당신을 보며) 이름이 안영이씨? 반가워요.\"");
				System.out.println("섬유3팀 과장: \"제대로 인사는 나중에 하고, 그게 지금 진행 중인 사업인데 우리 전부 남자라 영 민망해~\"");
				System.out.println("섬유3팀 과장: \"김사원 대리랑 한번 진행해 봐. 곧 그거 미국에 팔아야 해...아니면 우리 부서 적자야.\"");
				System.out.println("섬유3팀 과장: \"안영이씨 무역상사인데 영어는 기본이잖아? 어느 정도 하나?\"");
				System.out.println("\n당신은 그간 성실히 영어회화를 익혔지만, 해외에 나가본 적은 없다.");
				System.out.println("당신의 영어 실력을 어떻게 표현하겠는가? (단, 보기에 없는 값 입력 시에도 자동 진행)");
				System.out.println("(1)\"최선을 다해 공부했지만 해외에 직접 나가본적은 없습니다.\"");
				System.out.println("(2)\"해외에 나가본적은 없지만 적극 배웠습니다.\"");
				System.out.print("입력: ");

				if(stdIn.nextInt() == 1) {
					System.out.println("\n섬유3팀 과장: \"최선은 학교 다닐 때나 하는 소리고~\"");
					System.out.println("섬유3팀 과장: \"직장은 결과만 보여지는 곳이지? 어떻게든 클라이언트는 상대해야 할꺼야.\"");
				}else {
					System.out.println("\n섬유3팀 과장: 국내파구나? 그래도 스펙이 좋아서 말이야.\"");
					System.out.println("섬유3팀 과장: \"클라이언트도 적극적으로 상대해야 할꺼야. 상대는 미국인이거든.\"");
				}
				
				System.out.println("섬유3팀 과장: \"우리가 자체 생산한 섬유재질로 만든 엉덩이 뽕을 팔아야 하는 거야.\"");
				System.out.println("섬유3팀 과장: \"상대는 럭스 사장인데 적극적으로 표현하고, 직접 제품의 유용성을 두 눈으로 보여줘야 할거야.\"");
				System.out.println("\n당신은 걱정이 앞섰지만, 과장님이 정보를 주신 것을 잊지 않아야 겠다고 생각한다.");
				
				
				//2장으로 장면 전환하기
				System.out.println("\n2장으로 가시겠습니까?");
				System.out.println("(1)네  (0)종료  (단, 잘못 입력시 자동전환)");
				System.out.print("입력: "); 
				
				if(stdIn.nextInt() == 0) {
					System.out.println("\n아쉽군요. 첫 과제를 포기하다뇨.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
				
				System.out.println("\n---------------------------------*2장. 영업 준비*---------------------------------");
				System.out.println("당신은 과장님의 말씀을 되새기며 럭스 사장에게 어떻게 제품을 팔 수 있을지 고민중이다.");
				System.out.println("때마침 김사원 대리가 다가온다.");
				System.out.println("\n김사원 대리: \"안영이씨? 이게 엉덩이뽕이에요.\"");
				System.out.println("김사원 대리: \"오늘 3시에 럭스 사장하고 미팅있으니까 준비하고.\"");
				System.out.println("\n당신은 가볍게 목례하고는 엉덩이뽕을 바라본다.");
				System.out.println("주변 부서 사람들이 흘끗 처다보는게 느껴진다. 민망하다.");
				System.out.println("어느 장소로 이동하겠는가? (단, 잘못 입력 시에도 자동 진행)");
				System.out.println("(1)화장실  (2)옥상");
				System.out.print("입력: ");
				
				if(stdIn.nextInt() == 1) {
					System.out.println("\n당신은 허겁지겁 화장실로 향한다.");
				}else {
					System.out.println("\n당신은 허겁지겁 옥상으로 간다.");
					System.out.println("옥상 문을 여는 순간 수많은 사원들이 담배를 피거나 자판기 커피를 마시며 옹기종기 모여있다.");
					System.out.println("도저히 있을 수 없어 뽕을 들고 화장실로 간다.");
				}
				
				//본격 준비
				System.out.println("\n* 화장실 *");
				
				int yChoice = 0;  //엉덩이뽕 직접 착용여부
				
				System.out.println("당신은 화장실에 들어와서 얕은 한숨을 쉬었다.");
				System.out.println("이제는 본격적인 제품 팔기에 앞서 준비를 해야 한다.");
				System.out.println("문득 당신이 직접 엉덩이 뽕을 차는 것은 어떤가 하는 아이디어가 떠오른다.");
				System.out.println("어찌 하겠는가? 당신의 대답에 따라 영업 스킬이 결정된다. (단, 잘못 입력 시에도 자동 진행)");
				System.out.println("(1)직접 엉덩이뽕을 착용한다.");
				System.out.println("(2)다른 방법을 강구한다.");
				System.out.println("입력: ");
				
				if(stdIn.nextInt() == 1) {
					System.out.println("\n당신은 과장님의 말씀을 제대로 이해했다.");
					System.out.println("럭스 사장과의 미팅 시 더 유리하게 작용한다."); yChoice++;
					System.out.println("\n그러고보니 아까 김대리님이 엉덩이뽕 여분을 하나 더 주셨다.");
					System.out.println("두 개를 전부 착용하겠는가? (단, 잘못 입력 시에도 자동 진행)");
					System.out.println("(1)예  (2)아니오");
					System.out.println("입력: ");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n역시 두 개는 착용해야 직접 보여드릴 수 있겠다.");
						System.out.println("영업스킬이 더욱 높아진다."); yChoice++;
						System.out.println("이제는 만반의 준비가 끝났다. 곧 미팅이 시작되는 시간이다.");
					}else {
						System.out.println("\n우선 엉덩이뽕 한 개로 만족한다.");
						System.out.println("이제는 준비가 끝났다. 곧 미팅이 시작되는 시간이다.");
					}
								
				}else {
					System.out.println("\n다른 방법을 열심히 생각해 본다.");
					System.out.println("하지만 쉽사리 다른 방도가 떠오르지 않는다.");
					System.out.println("이제는 가야한다. 곧 미팅이 시작되는 시간이다.");
				}
				
				//3장으로 장면 전환하기
				System.out.println("\n3장으로 가시겠습니까?");
				System.out.println("(1)네  (0)종료  (단, 잘못 입력시 자동전환)");
				System.out.print("입력: "); 
				
				if(stdIn.nextInt() == 0) {
					System.out.println("\n아쉽군요. 첫 과제를 포기하다뇨.");
					System.out.println("미생 시뮬레이션을 종료합니다.");
					break;
				}
				
				System.out.println("\n---------------------------------*3장. 클라이언트와의 만남*---------------------------------");
				System.out.println("당신은 준비를 마치고 화장실에서 나왔다.");
				System.out.println("클라이언트와의 미팅은 몇시에 시작인가? (힌트: 김동식 대리의 정보)");
				System.out.println("몇 시인지 숫자로 정확히 입력: ");
				
				if(stdIn.nextInt() == 3) {
					System.out.println("\n정답입니다.");
					System.out.println("업무처리에 50점이 추가되었습니다."); internScore1 += 50;
				}else {
					System.out.println("\n오답입니다.");
					System.out.println("아쉽군요. 추가점수가 없습니다.");
				}
				
				System.out.println("당신 손목에 차고 있는 시계를 보니 어느새 곧 3시다.");
				System.out.println("허겁지겁 클라이언트가 도착한다는 섬유2팀 회의실에 도착하였다.");
				System.out.println("문을 열고 들어가니 어느새 럭스 사장이 도착하여 짐을 풀고 있었다.");
				System.out.println("당신은 럭스 사장에게 어떻게 인사를 건네야 할까? (단, 보기에 없는 값 입력시 오답 처리)");
				System.out.println("(1)Hello ~ !");
				System.out.println("(2)Hola ~ !");
				System.out.println("(3)Nihao ~ !");
				System.out.println("입력: ");
				
				if(stdIn.nextInt() == 1) {
					System.out.println("\n정답입니다.");
					System.out.println("업무처리에 25점이 추가되었습니다."); internScore1 += 25;
					System.out.println("\n당신은 반갑게 영어로 인사하며 악수를 청했다.");
				}else {
					System.out.println("\n오답입니다.");
					System.out.println("아쉽군요. 추가점수가 없습니다.");
					System.out.println("\n당신은 럭스 사장의 국적을 깜빡하여 머쓱해하며 아무 말 없이 악수를 청했다.");
				}
				
				System.out.println("럭스 사장은 본격적으로 제품과 관련한 이야기를 하고자 했다.");
				System.out.println("당신은 긴장한 얼굴로 럭스 사장을 쳐다보다가 이윽고, 서류를 내려 놓았다.");
				System.out.println("(참고: 이제부터 럭스와 안영이의 대화는 한국어로 번역되어 제공됩니다.)");
				
				switch(yChoice) {
				
				//엉덩이뽕 착용 안한 경우
				case 0:
					
					System.out.println("당신은 급하게 김대리에게 받았던 엉덩이뽕 샘플을 럭스 사장에게 건넨다.");
					System.out.println("그러자 이윽고 럭스는 뽕을 꼼꼼하게 조물조물 만져보고는 당신을 바라본다.");
					System.out.println("\n럭스: \"소비자의 입장이 되어 제품을 직접 착용해볼 생각은 못했나요?\"");
					System.out.println("럭스: \"좀 전에 과장님이 저에게 안영이씨 현장점수를 매기라고 하셨어요. 큰 점수는 못드리겠네요.\"");
					System.out.println("\n당신은 럭스에게 기본점수로 30점을 획득하였습니다."); internScore1 += 30;
					System.out.println("점수를 인정하십니까? (단, 잘못 입력 시에도 계속 진행)");
					System.out.println("(1)확인  (2)나가기");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 거의 다 왔는데 포기라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;						
					}
					
					System.out.println("\n딩신은 아쉬움을 금치 못한다.");
					System.out.println("그래도 만회하고자 열심히 엉덩이뽕을 설명하기 시작한다.");
					System.out.println("영이: \"몇몇 모니터링에 따르면 엉덩이에 맞춰 패턴화되어 있어서 착용하기 편하다고 전해지고 있습니다.\"");
					System.out.println("영이: \"특히 저희 섬유공장에서 생상한 템퍼는 촉감이 부드럽고 쏠림 방지 효과도 탁월합니다.\"");
					System.out.println("영이: \"(서류 착착 내밀며)내구성, 촉감, 마찰도에 대한 테스트 결과 입니다.\"");
					System.out.println("영이: \"(또 내 밀며)최근 템퍼로 뜨고 있는 댜른 제품과의 비교 자료입니다.\"");
					System.out.println("\n럭스 사장은 말을 듣더니 이내 손을 까딱하며 검토했다는 반응을 보인다.");
					System.out.println("당신은 걱정스러운 마음에 계약이 과연 유지될 수 있을지 묻는다.");
					System.out.println("\n럭스: \"(장난스럽게 말 돌리며) 엉뽕, 내 사이즈도 있나요?\"");
					System.out.println("당신은 무엇이라 답하겠는가?");
					System.out.println("(1)직접 테스트해 본 후 사이즈를 정확히 조정해 드린다고 한다.");
					System.out.println("(2)대표님은 적당히 스몰만 입어도 된다고 아부한다.");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n럭스 사장은 갸우뚱한다.");
						System.out.println("럭스: \"웃자고 한 소리인데 말이죠. 그리고 클라이언트는 두 번의 기회를 잘 주지 않죠?\"");
						System.out.println("\n당신은 럭스에게 추가점수를 획득하지 못하였습니다."); 
						System.out.println("\n럭스 사장은 석연치 않은 표정으로 우선 엉뽕을 들고 나가려 한다.");
						System.out.println("당신은 가볍게 악수를 청하고는 문서를 정리한다.");						
					}else {
						System.out.println("\n럭스 사장은 당신의 유머가 마음에 드는 듯 하다.");
						System.out.println("럭스: \"(까딱) 추가 자료는 아주 좋았어요.\"");
						System.out.println("\n당신은 럭스에게 추가점수로 15점을 획득하였습니다."); internScore1 += 15;
						System.out.println("\n렉스는 서류를 거두고 엉뽕을 들더니 미팅을 마무리하자고 한다.");
						System.out.println("당신은 가볍게 악수를 청하고는 회의실을 정리한다.");	
					}
				
					break;
				
				//엉덩이뽕 한 개 착용	
				case 1:
					
					System.out.println("당신은 긴장한 얼굴로 허리와 엉덩이 굴곡을 더 만드려고 노력 중이다.");
					System.out.println("그러자 의자에 앉은 럭스 사장이 브로셔를 까닥하며 돌아 보라는 제스쳐를 한다.");
					System.out.println("당신은 천천히 옆태와 뒤태를 보여준 후 책상을 잡고 엉덩이를 강조한 자세를 한다.");
					System.out.println("\n럭스: \"오...역시 직접 제품을 착용하고 있는 건가요?\"");
					System.out.println("럭스: \"처음에는 긴가민가 했는데 자세를 다르게 하니 알겠네요.\"");
					System.out.println("럭스: \"아까 과장님이 저에게 안영이씨 당신의 현장점수를 매기라고 하셨어요. 무난한 평가 드리죠.\"");
					System.out.println("\n당신은 럭스에게 기본점수로 40점을 획득하였습니다."); internScore1 += 40;
					System.out.println("점수를 인정하십니까? (단, 잘못 입력 시에도 계속 진행)");
					System.out.println("(1)확인  (2)나가기");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 거의 다 왔는데 포기라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;						
					}
					
					System.out.println("\n이윽고 당신은 엉덩이뽕 제품이 여성의 바디를 살리는 디자인에 집중하고 있다는 것을 어필한다.");
					System.out.println("영이: \"2, 30대 섹시한 여성을 겨냥한 제품이라고 할 수 있습니다.\"");
					System.out.println("영이: \"특히 대표님의 쇼핑몰 주 타겟층이 젊은 여성들이기 때문에 수요가 많을 것이라 생각합니다.\"");
					System.out.println("영이: \"또한 템퍼 자체가 라텍스보다 고밀도 고탄력이기 때문에 내구성도 우수합니다.\"");
					System.out.println("\n당신의 말을 경청하고 있던 럭스 사장이 다음과 같이 물었다.");
					System.out.println("럭스: \"(빤히 보다가 옅은 미소보이며)엉뽕, 내 사이즈도 있나요? 미스 안?\"");
					System.out.println("당신은 무엇이라 답하겠는가?");
					System.out.println("(1)여성의 바디를 살리는 용도인데 대표님은 이미 충분하다고 말씀드린다.");
					System.out.println("(2)대표님의 디자인 작품을 봤다고 언급하며 개인 취향은 안 맞으실 것이라 말한다.");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n럭스 사장은 당신의 유머에 웃는다.");
						System.out.println("럭스: \"(미소로 받으며) 추가 점수도 후하게 드리죠.\"");
						System.out.println("\n당신은 럭스에게 추가점수로 25점을 획득하였습니다."); internScore1 += 25;
						System.out.println("\n럭스 사장은 기분 좋게 엉뽕을 들고 나가려 한다.");
						System.out.println("당신은 가볍게 악수를 청하고 미팅을 마무리한다.");						
					}else {
						System.out.println("\n럭스 사장은 당신의 부가 설명이 마음에 안드는 눈치다.");
						System.out.println("럭스: \"웃자고 한 말인데요? 하하하\"");
						System.out.println("\n당신은 럭스에게 추가점수로 10점을 획득하였습니다."); internScore1 += 10;
						System.out.println("\n렉스는 서류를 거두고 미팅을 마무리하자고 한다.");
						System.out.println("당신은 가볍게 악수를 청하고 회의실을 정리한다.");	
					}
					break;
				
				
				//엉덩이뽕 두 개 착용
				case 2:
					System.out.println("당신은 허리를 쭉 피며 엉덩이에 힘을 더 주고 서있다.");
					System.out.println("엉덩이에 두터운 이물감이 느껴진다.");
					System.out.println("그리고는 럭스 사장에게 제품을 직접 두개나 착용하고 있다고 말한다.");
					System.out.println("\n럭스: \"하하하, 직접 제품을 착용해보고 테스트도 해보는군요.\"");
					System.out.println("럭스: \"아주 좋은 자세라고 봅니다. 상사맨에게 필요한 태도이죠.\"");				
					System.out.println("럭스: \"좀 전에 과장님이 오셔서 저에게 안영이씨 당신의 현장점수를 매겨달라더군요. 좋은 평가 드리겠습니다.\"");
					System.out.println("\n당신은 럭스에게 기본점수로 50점을 획득하였습니다."); internScore1 += 50;
					System.out.println("점수를 인정하십니까? (단, 잘못 입력 시에도 계속 진행)");
					System.out.println("(1)확인  (2)나가기");
					System.out.print("입력: ");
					
					if(stdIn.nextInt() == 2) {
						System.out.println("아쉽군요. 거의 다 왔는데 포기라뇨.");
						System.out.println("미생 시뮬레이션을 종료합니다.");
						break;						
					}
					
					System.out.println("\n당신은 내구성 확인이 우선이라고 생각하여 직접 입어 보았다고 이야기 했다.");
					System.out.println("\n럭스: \"(당신을 슥 보더니) 착용 전후 태가 확실히 다르네요.\"");
					System.out.println("럭스: \"전문 모델을 썼으면 별 감흥이 없었을 겁니다.\"");
					System.out.println("\n당신은 템퍼가 라텍스보다 고밀도 고탄력이면서 수선이 쉽다는 장점을 설명했다.");
					System.out.println("그러자 럭스 사장이 웃으며 다음과 같이 물어보았다.");
					System.out.println("럭스: \"(빤히 보다가 옅은 미소보이며)엉뽕, 내 사이즈도 있나요? 미스 안?\"");
					System.out.println("당신은 무엇이라 답하겠는가?");
					System.out.println("(1)럭스는 뽕이 필요 없을 것 같다고 답한다.");
					System.out.println("(2)사이즈는 여러 가지가 있다고 답한다.");
					
					if(stdIn.nextInt() == 1) {
						System.out.println("\n럭스 사장은 당신의 유머러스한 반응이 마음에 들어한다.");
						System.out.println("럭스: \"(미소로 받으며) 유머감각 또한 있네요? 추가 점수도 후하게 드리죠.\"");
						System.out.println("\n당신은 럭스에게 추가점수로 30점을 획득하였습니다."); internScore1 += 30;
						System.out.println("\n럭스 사장은 큰 소리로 하하하 웃으며 엉뽕을 들고 나가려 한다.");
						System.out.println("당신은 가볍게 악수를 청하고 미팅을 마무리한다.");						
					}else {
						System.out.println("\n럭스 사장은 당신의 심각한 반응이 마음에 안드는 눈치다.");
						System.out.println("럭스: \"(까딱) 제품 설명은 참 좋았어요.\"");
						System.out.println("\n당신은 럭스에게 추가점수로 15점을 획득하였습니다."); internScore1 += 15;
						System.out.println("\n렉스는 서류를 거두고 엉뽕을 들더니 미팅을 마무리하자고 한다.");
						System.out.println("당신은 가볍게 악수를 청하고는 회의실을 정리한다.");
					}
					break;
					
				}
				
				System.out.println("원인터네셔널에서의 현장체험 날도 끝이 났다.");
				System.out.println("\n당신의 인턴평가 점수는 다음과 같다.");
				System.out.printf("안영이: 업무평가 %d점, 현장평가 %d점, 총 합계 %d점\n\n", internScore1, internScore2, internScore1+internScore2);
				
				// 인턴평가점수 150점이 넘으면 정직원으로 입사
				if(internScore1+internScore2 > 150) {
					System.out.println("안영이씨 축하드립니다.");
					System.out.println("당신은 정식 사원이 되었습니다.");
					System.out.println("미생 인턴 체험을 종료합니다.");
				}else {
					System.out.println("안영이씨 아쉽네요.");
					System.out.println("당신은 정직 시원이 되지 못하였습니다.");
					System.out.println("미생 인턴 체험을 종료합니다.");
				}
				break;

				
			}//두번째 switch문의 끝						
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("인생의 두 번의 기회는 잘 오지 않습니다.");
			System.out.println("아쉽지만 다음 기회에 만나요.");
			System.out.println("미생 시뮬레이션을 종료합니다.");
			break;
			
		}//첫번째 switch문의 끝
		
		stdIn.close();
	}
}
