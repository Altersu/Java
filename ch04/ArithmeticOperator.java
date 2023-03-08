/*
   演示算术运算符的使用
   注释快捷键 CTRL+/ ,再次CTRL+/取消注释

 */

 public class ArithmeticOperator{
 	public static void main(String[] args){
 		System.out.println(10/4);//从数学上来看是2.5，java中是2
 		System.out.println(10.0/4);//java是2.5
 		double d = 10 /4;//Java中是10/4 = 2，2->2.0
 		System.out.println(d);//2.0

 		// % 取模，取余
 		// %的本质，有一个公式 a%b=a-a/b*b
 		// 10 % -3 = 10-10/(-3)*(-3)=10-9=1
 		System.out.println(10%3);// 1
 		System.out.println(-10%3); //-1
 		System.out.println(10%-3);//1
 		System.out.println(-10%-3);//-1

 		// ++的使用
 		// ++单独使用时，二者没有区别
 	
 		int i = 10;
 		i++;// 自增 等价于  i= i+1; => i = 11;
 		++i;// 自增 等价于  i= i+1; => i = 12;
 		System.out.println("i="+ i);//12

 		/*
 		作为表达式使用
 		前++：++i先自增后赋值
 		后++：i++先赋值后自增
 		 */
 		int j = 8;
 		int k = ++j;// 等价 j=j+1;k=j;
 		System.out.println("k=" + k + "j=" +j);//9

 		int a = 8;
 		int b = a++;
 		System.out.println("a=" + a + "b=" + b);//8 9


 	}
 }