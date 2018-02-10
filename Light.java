class Light {
	public static void main (String args[]) {
		int lightspeed;
		long days;
		long second;
		long distance;

		lightspeed = 186000;
		days = 1000;
		second = days * 24 * 60 * 60;
		distance = lightspeed * second;
	
		System.out.print("За " + days);
		System.out.print(" дней свет пройдет около ");
		System.out.println(distance + " миль.");
		
	}
}