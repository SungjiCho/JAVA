package HW;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("미생 시뮬레이션에 오신 것을 환영합니다.");
		System.out.println("(1)시작  (2)배경이야기  (3)나가기");
		
		System.out.print("입력: "); int opt1 = stdIn.nextInt();
		
		//시작 옵션을 제외한 나머지 모든 경우의 수를 조건문으로 처리하기
		if(opt1 == 2) {
			System.out.println("---------------------------------*미생 배경이야기*---------------------------------");
			System.out.println("프로 바둑기사 입단이 좌절된 후, 원인터내셔널에 입사한 장그래");
			System.out.println("유일한 여자 동기 안영이, 엘리트 사원 장백기, 현장 중시 한석율이 등장하여");
			System.out.println("직장 동료간의 갈등, 업무과정 및 회사생활을 그린 시뮬레이션입니다.");
			System.out.println("시뮬레이션의 배경이 되는 원인터내셔널은 실제 회사인 대우인터내셔널을 모티브로 하였습니다.");

			System.out.println("시뮬레이션을 시작하시겠습니까?");
			System.out.println("(1)시작  (2)나가기");		
			System.out.print("입력: "); opt1 = stdIn.nextInt();
			
			if(opt1 == 2) {
				System.out.println("아쉽지만 다음 기회에 만나요.");
				System.out.println("미생 시뮬레이션을 종료합니다.");
				System.exit(0);
			}
			
		}else if(opt1 == 3) {
			System.out.println("미생 시뮬레이션을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("인생의 두 번의 기회는 잘 오지 않습니다.");
			System.out.println("아쉽지만 다음 기회에 만나요.");
			System.out.println("미생 시뮬레이션을 종료합니다.");
			System.exit(0);
		}
		

		System.out.println("미생 시뮬레이션을 시작하겠습니다.");
		System.out.println("미생 등장인물 중 한 명을 선택하여 해당 등장인물로 회사생활을 체험하게 됩니다.");
		System.out.println("각 등장인물에 대한 설명을 열람하실 수 있습니다.");
		System.out.println("캐릭터 설명을 먼저 확인하시겠습니까?");
		System.out.println("(1)설명보기  (2)스킵하기");
		System.out.print("입력: ");
			
		if(stdIn.nextInt() == 1) {
			System.out.println("---------------------------------*미생 캐릭터 설명*---------------------------------");
			System.out.println("원인터네셔널 신입사원들은 장그래, 안영이, 장백기, 한석율이 있습니다.");
			System.out.println("총 4명의 캐릭터 중 한 명을 선택하여 신입사원의 삶을 체험할 수 있습니다.");
			System.out.println("*장그래: 영업3팀 계약직 직원");
			System.out.println("프로 바둑기사 입단이 좌절된 후 고졸학력으로 원인터네셔널에 인턴으로 입사해 우여곡절을 겪게됩니다.");
			System.out.println("*안영이: 자원2팀 정사원");
			System.out.println("유일한 여자 신입사원으로 모든 부분에서 완벽한 실력자지만 찌질한 상관들 밑에서 일하면서 속앓이를 하게 됩니다.");
			System.out.println("*장백기: 철강1팀 정사원");
			System.out.println("엘리트 사원으로 완벽한 입사스펙을 갖추기 위해 오랫동안 준비해온 취업준비생의 전형입니다.");
			System.out.println("*한석율: 섬유1팀 정사원");
			System.out.println("현실 세계에 들어온 이상주의자로 현장을 우선 중시하는 마인드를 가지고 있습니다.");
				
			System.out.println("자, 그럼 캐릭터를 결정해 볼까요?");
		}
			
		System.out.println("다음 캐릭터 중 한 명을 선택해주세요.");
		System.out.println("(1)장그래\n (2)안영이\n (3)장백기\n (4)한석율");
		System.out.print("입력: "); int opt2 = stdIn.nextInt();
			
		if(opt2 < 1 || opt2 > 4) {
			System.out.println("마음에 드는 캐릭터가 없으신가요? 캐릭터 선정에 실패하였습니다.");
			System.out.println("아쉽지만 인생의 결정을 여러 차례 번복하기는 어렵죠.");
			System.out.println("본 시뮬레이션에서는 자동으로 미생 원작의 주인공인 장그래로 결정됩니다.");
			System.out.println("캐릭터 장그래로 시작하시겠습니까?");
			System.out.println("(1)예  (2)나가기");
			System.out.print("입력: "); int temp = stdIn.nextInt();
				
			if(temp == 1) {
				opt2 = temp;
			}else if(temp == 2){
				System.exit(0);
			}else {
				System.out.println("자동 캐릭터 선정에 실패하셨습니다.");
				System.out.println("본 시뮬레이션은 주어진 등장인물 중 캐릭터 선정이 필요합니다.");
				System.out.println("아쉽지만 다음 기회에 만나도록 하죠.");
				System.out.println("미생 시뮬레이션을 종료합니다.");
				System.exit(0);
			}
		}
			
		stdIn.close();
	}
}
