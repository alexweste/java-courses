class SumTestDrive {
	
	public static void main (String[] args) {
		int y;
		int x;
		int z;
		int c;
		c = 0;
		y = 0;
		x = 0;
		z = 0;
		Sum c1 = new Sum();
		c1.a = 2;
		c1.b = 15;
		Sum c2 = new Sum();
		c2.a = 256;
		c2.b = 513;

		c1.matsum();
		System.out.println ("c1 = "+c1.c);
		c2.matsum();
		System.out.println ("c2 = "+c2.c);
		c = c1.c + c2.c;
		System.out.println ("Sum = "+c);
		
	} 
}