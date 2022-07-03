package day04;

public class Loop1 {

	public static void main(String[] args) {
		// 0~9
		for (int i = 1; i <=10; i++) {
			
			if(i == 6) break;
			System.out.println(i);	
			// break 이 코드가 실행되면 반복문 중단
			// continue 이 코드가 실행되면 반복문의 처음으로 돌아감(1회성 취소)
			//break : 반복문 즉시 종료
			// continue : 반복문 1회성 종료 (원래는 중괄호 마치고 조건을 검사하지만, 바로 조건 검사로 넘어감)
			
			
		}
		for(int i = 1; i<=10; i++) {		
			i += 1;
			System.out.println(i);
			
		}
	}

}
