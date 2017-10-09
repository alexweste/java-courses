class IfTest {
	public static void main (String[] args) {
	int x = 20;
	if (x == 3) {
		System.out.println ("x muste be 3");
		} else {
			System.out.println ("x is not 3");
			if (x < 3 ) {
			while (x < 3){
			x = x + 1;
			System.out.println ("it is necessary to increase x");
}
}
			else  {
				while (x > 3) {
				x = x - 1;
				System.out.println ("need x make less");
}
}
}
	System.out.println ("This runs no matter what");
}
}