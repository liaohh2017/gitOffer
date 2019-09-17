package test;



public class p {


    
	private static final String p="p";
	private static final String c="c";
	public  p(){
		System.out.println(p+"a");
	}
	static{
		System.out.println(p+"b");
	}
	
	{
		System.out.println(p+"c");
	}
	static class c extends p{
		public c(){
			System.out.println(c+"a");
		}
		static{
			System.out.println(c+"b");
		}
		
		{
			System.out.println(c+"c");
		}
	}
	public static void main(String[] args) {
		c c1=new c();
	}

}
