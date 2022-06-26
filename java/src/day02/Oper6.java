package day02;

public class Oper6 {
	public static void main(String[] args) {
		//누적 연산
		int num1 = 3;
		int num2 = 5;
		num1 = 4;
		num1 = num1;
		num1 = num2 + 2;
		num1 += 5;						//num1 = num1 + 5;
		num2 -= 2;						//num2 = num2 - 5;
		num1 *= 1;						//num1 = num1 * 5;
		num2 /= 1;						//num2 = num2 / 5;
		System.out.println(num1);
		System.out.println("num2" + num2);
		//누적 연산을 하는데 1만 더하거나 뺄경우 가능
		int num3 = 5;
		num3++;
		System.out.println(num3);
		num3 --; 						//int3 -= 1;
		System.out.println(num3);
		
		/*int num = 0;
		  num++;						;끝난 후에 +1 해서 저장
		  ++num;						;끝나기 전에 +1 해서 저장
		  num--;						;끝난 후에 -1해서 저장
		  --num;						;끝나기 전에 -1 해서 저장
		  
		 */
		//num3 == 5
		System.out.println(++num3);
		// 앞에 있으면 그 문장중에 +1
		// 뒤에 있으면 그 문장 끝난 후 다음문장부터 +1
		
		//알더ㅏㅣ ㅓ다ㅓ랴ㅐ이대ㅑㅐㄷㄱ
	
	
	
	
	}

}
