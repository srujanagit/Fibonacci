
public class FiboArray {

	static int i,count;
	public static void a(){
		int[] n= new int[count];
		n[0] =0;
		n[1] =1;
		System.out.print(n[0]+" "+n[1]);
		for(i=2;i<count;i++)
		{
		n[i]= n[i-1]+n[i-2];
		
		System.out.print(" "+n[i]);
		
		}
	}
	public static void main(String[] args) {
		count =20;
		a();
	}

}
