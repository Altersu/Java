public class mianshi{
	public static void main(String[] args){
		int i = 10;
		i = i++;// temp = i; i = i++; i= temp;
		System.out.println("i="+i);

		int j = 2;
		 j  = j++;//先赋值，后自增
		 j *= j;
		System.out.println("j="+j);

		int x = 10;
		x= x + (x++) + (++x);
		System.out.println("x="+ x);

		int a = 10;
		int temp;
		temp = a;
		a = a++;
		a = temp;
        System.out.println("i="+a);
	}
}