/*
   ��ʾ�����������ʹ��
   ע�Ϳ�ݼ� CTRL+/ ,�ٴ�CTRL+/ȡ��ע��

 */

 public class ArithmeticOperator{
 	public static void main(String[] args){
 		System.out.println(10/4);//����ѧ��������2.5��java����2
 		System.out.println(10.0/4);//java��2.5
 		double d = 10 /4;//Java����10/4 = 2��2->2.0
 		System.out.println(d);//2.0

 		// % ȡģ��ȡ��
 		// %�ı��ʣ���һ����ʽ a%b=a-a/b*b
 		// 10 % -3 = 10-10/(-3)*(-3)=10-9=1
 		System.out.println(10%3);// 1
 		System.out.println(-10%3); //-1
 		System.out.println(10%-3);//1
 		System.out.println(-10%-3);//-1

 		// ++��ʹ��
 		// ++����ʹ��ʱ������û������
 	
 		int i = 10;
 		i++;// ���� �ȼ���  i= i+1; => i = 11;
 		++i;// ���� �ȼ���  i= i+1; => i = 12;
 		System.out.println("i="+ i);//12

 		/*
 		��Ϊ���ʽʹ��
 		ǰ++��++i��������ֵ
 		��++��i++�ȸ�ֵ������
 		 */
 		int j = 8;
 		int k = ++j;// �ȼ� j=j+1;k=j;
 		System.out.println("k=" + k + "j=" +j);//9

 		int a = 8;
 		int b = a++;
 		System.out.println("a=" + a + "b=" + b);//8 9


 	}
 }