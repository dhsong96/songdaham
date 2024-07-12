package sample_application;

public class ShortCutOperatorExam {

	public static void main(String[] args) {
		
		// 일반 산술 연산자 실습
		int number3 = 30;
		number3 = number3 + 6;
		
		int number8 = 30;
		number8 += 6;
		
		
		
		int number4 = 40;
		number4 = number4 - 10;
		
		int number9 = 40;
		number9 -= 10;
		
				
		
		
		int number5 = 50;
		number5 = number5 * 12;
		
		int number10 = 50;
		number10 *= 12;
		
		
		
		int number6 = 60;
		number6 = number6 / 14;
		
		int number11 = 60;
		number11 /= 14;
		
		
		
		int number7 = 70;
		number7 = number7 % 16;
		
		
		
		int number1 = 10;
		number1 = number1 + 2;
		System.out.println(number1); // 12
		// Ctrl + F11 ==> 클래식 실행.
		// 짧은 표현식 실습
		// - 생겨난 배경 : 코드를 짧은 시간내에 효율적으로 작성하기 위해
		//           - 귀찮다.
		int number2 = 20;
		// number 2 = number2 + 2;
		number2 += 4; // 24
		System.out.println(number2);
	}
}
