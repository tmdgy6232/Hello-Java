
public class HelloVar_06 {

	public static void main(String[] args) {

		//�Ǽ��� �Ҽ��� ���� 6�ڸ�����
		// float���� ����� ������ ���ڰ��� �����Ҷ���
		// ���� �� �ҹ��� ������ �ٿ��ش�.
		float korScore = 90.0f;
		float engScore = 80f;
		float mathScore = 70f;
		
		engScore = 88;
		//�������� ���尪 ����
		
		float sum = korScore + engScore + mathScore;
		System.out.println("����:" +sum);
		
		float avg = sum / 3;
		
		System.out.println("���:" + avg);
		
		
	}

}