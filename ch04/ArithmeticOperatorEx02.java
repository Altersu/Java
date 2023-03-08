/**
 * 演示算术运算符的使用 
 */
public class ArithmeticOperatorEx02{

	public static void main(String[] args){
		/*
		1.需求
		假如还有59天放假，问：合几个星期零几天
		2.思路分析
		1）使用int变量 days 保存天数
		2）一个星期是7天 星期数weeks :days/7 ;零几天 days%7
		3)输出
		3.写代码
		 */
		int days = 3600;
		int weeks = days / 7;
        int day = days % 7;
        System.out.println("合"+weeks+"个星期"+"零"+day +"天");

        


	}
}