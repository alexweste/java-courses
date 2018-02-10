//Цель программы - показать, что нельзя называть переменную во вложенном блоке так же как во внешнем
class ScopeErr {
	public static void main (String args[]) {
		int bar = 1;
		if (bar < 2) {
			int bar = 2;
		}
		System.out.println(" bar равно: " + bar);
	}
}