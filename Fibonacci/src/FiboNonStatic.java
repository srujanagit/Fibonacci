
public class FiboNonStatic {
	int x1=0,x2=1,x3,i,count;
	public void a()
		{
		System.out.print(x1+" "+x2);
		for(i=2;i<count;i++){
			x3=x1+x2;
			x1=x2;
			x2=x3;
			System.out.print(" "+x3);
		}
	
		}
	public static void main(String[] args) {
		FiboNonStatic f1=new FiboNonStatic();
		f1.count=10;
		f1.a();
	}

}
