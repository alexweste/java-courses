class IncDec {
	public static void main (String args[]) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c, d;
		c = ++b;
		d = a++;
		c++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}