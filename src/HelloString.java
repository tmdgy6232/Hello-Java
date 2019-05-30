
public class HelloString {

	public static void main(String[] args) {

		// ""(큰따음표, DQM)로 묶여있는 모든것들을
		// 문자열이라고 부른다.
		// 코딩용어에서는 string literal이라고 한다.
		// 문자열은 보이는 그대로가 값(식이아님)이다.
		// 30+ 40은 숫자 30과 40을 덧셈하라는 식이다.
		// "30+40"은 문자열 30+40인 값이다.
		
		
		// 아래 명령문은 30+40의 연산결과인 70을 콘솔에 표현하
		System.out.println(30+40);
		
		//아래 명령문은 30+40이라는 문자열을 콘솔에 표현
		System.out.println("30+40");
		System.out.println("대한민국만세");
		
		// 문자열끼리는 유일하세 덧셈 연산을 수행할 수 있는데
		// 문자열들을 연결하라는 뜻이다.
		
		System.out.println("대한민국"+"만세");
		System.out.println("대한민국만세");
	}

}
