class Conversion {
	public static void main (String args[]){
		byte b;
		int i = 258;
		double d = 323.842;
		
		System.out.println("\n�������������� ���� int � ��� byte.");
		b = (byte) i;
		System.out.println("i � b �����: " + i + " " + b);
		System.out.println("\n�������������� ���� double � ��� int.");
		i = (int) d;
		System.out.println("d � i �����: " + d + " " + i);
		System.out.println("\n�������������� ���� double � ��� byte.");
		b = (byte) d;
		System.out.println("d � b �����: "  + d + " "  + b);		
		
	}
}