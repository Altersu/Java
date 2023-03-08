import java.util.Scanner;//表示把Java.util下的Scanner类导入
public class Input{
	public static void main(String[] args){
		//Scanner类表示简单文本扫描器，在Java.util包
		//1.引入Scanner类所在包
		//2.创建Scanner 对象，new创建一个对象
		//  myScanner就是Scanner类的对象 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		//当程序执行到 next 方法时，会等待用户输入
		String name = myScanner.next();//接收用户输入字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//接收用户输入int
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//接收用户输入double
		System.out.println("信息如下");
		System.out.println("名字="+ name+"\t" + "年龄=" +age+"\t"+ "薪水=" + sal );

	}
}