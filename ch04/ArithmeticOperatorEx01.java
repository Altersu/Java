/**
 * 演示算术运算符的使用 
 */
public class ArithmeticOperatorEx01{
	public static void main(String[] args){
		int i = 1;
		i = i++;//(先赋值，后自增)规则使用临时变量：（1）temp = i; (2) i=i+1;(3)i=temp;
		System.out.println("i=" +i);//1

		int a = 1;
		a = ++a;
		System.out.println("a=" +a);
		//（先自增，后赋值）规则使用临时变量：(1)i=i+1；（2）temp = i;(3)i=temp;
		


	}
}