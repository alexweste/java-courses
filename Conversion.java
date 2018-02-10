class Conversion {
	public static void main (String args[]){
		byte b;
		int i = 258;
		double d = 323.842;
		
		System.out.println("\nПреобразование типа int в тип byte.");
		b = (byte) i;
		System.out.println("i и b равно: " + i + " " + b);
		System.out.println("\nРоеобразование типа double в тип int.");
		i = (int) d;
		System.out.println("d и i равно: " + d + " " + i);
		System.out.println("\nПреобразование типа double в тип byte.");
		b = (byte) d;
		System.out.println("d и b равно: "  + d + " "  + b);		
		
	}
}