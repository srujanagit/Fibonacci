
public class Fibo {
	static int x1=0, x2=1;
	static int x3, i, count=10;

	public static void main(String[] args) {
	System.out.print(x1+" "+x2);
	for(i=2;i<count;i++)
	{
		x3=x1+x2;
		x1=x2;
		x2=x3;
		System.out.print(" "+x3);
	}

	}

}
