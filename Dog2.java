class Dog2 {
	int size;
	String name;
	
	void bark() {
		if (size > 60) {
			System.out.println("Gav Gav!");
		}else if (size > 14) {
			System.out.println("Wuf Wyf!");
		} else {
			System.out.println("Waf Waf");
		}
	}
}