
public class HelloVar_02 {

	public static void main(String[] args) {

		int num1 = 2147483640;				;
		
		//연산계산 결과가 절대 -가 나올 수 없는 상황인데
		// 결과가 - 로 표현되는 상황은
		// 기억장소에 저장할 수 있는 값의 범위를 넘어선 오류 상황이다.
		System.out.println(num1+num1);
		
		//맨 끝에 영 소문자 L 넣어야함
		long num2 = 2147483649l;
		
		System.out.println(num2+1);
		
		
	}

}
