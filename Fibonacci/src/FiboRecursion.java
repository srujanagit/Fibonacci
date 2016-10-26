
public class FiboRecursion {
	static int x1=0,x2=1,x3,i,count=20;
	
	public static void a(int count)
	{
		if(count>0){
		x3=x1+x2;
		x1=x2;
		x2=x3;
		System.out.print(" "+x3);
		a(count-1);
		}	
	}
	public static void main(String[] args) {
		System.out.print(x1+" "+x2);
		a(count-2);
		
	}

}
