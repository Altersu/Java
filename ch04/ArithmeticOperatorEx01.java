/**
 * ��ʾ�����������ʹ�� 
 */
public class ArithmeticOperatorEx01{
	public static void main(String[] args){
		int i = 1;
		i = i++;//(�ȸ�ֵ��������)����ʹ����ʱ��������1��temp = i; (2) i=i+1;(3)i=temp;
		System.out.println("i=" +i);//1

		int a = 1;
		a = ++a;
		System.out.println("a=" +a);
		//������������ֵ������ʹ����ʱ������(1)i=i+1����2��temp = i;(3)i=temp;
		


	}
}