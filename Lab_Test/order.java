package test;

public class order 
{

		public boolean inOrderEq1ual(int a, int b, int c, boolean equalOk)
		{
			if(equalOk)
				return (a <= b && b <= c);
			return (a < b && b < c);
		}
		public static void main(String[] args)
		
		{
			order ob = new order();
			boolean a=ob.inOrderEq1ual(7,5,5,true);
			System.out.println(a);
		}
	}


