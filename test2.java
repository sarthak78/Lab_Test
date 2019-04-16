
public class test2 
{
			public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
		{
			if(equalOk)
				return (a <= b && b <= c);
			return (a < b && b < c);
		}
		public static void main(String...args)
		
		{
			test2 ob = new test2();
			boolean a=ob.inOrderEqual(7,5,5,true);
			System.out.println(a);
		}
	}


