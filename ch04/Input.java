import java.util.Scanner;//��ʾ��Java.util�µ�Scanner�ർ��
public class Input{
	public static void main(String[] args){
		//Scanner���ʾ���ı�ɨ��������Java.util��
		//1.����Scanner�����ڰ�
		//2.����Scanner ����new����һ������
		//  myScanner����Scanner��Ķ��� 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		//������ִ�е� next ����ʱ����ȴ��û�����
		String name = myScanner.next();//�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//�����û�����double
		System.out.println("��Ϣ����");
		System.out.println("����="+ name+"\t" + "����=" +age+"\t"+ "нˮ=" + sal );

	}
}