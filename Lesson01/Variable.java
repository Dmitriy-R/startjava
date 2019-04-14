public class Variable {
	public static void main(String[] args) {
		byte cpuYader = 8;
		short cpuMg = 3000;
		int ramGb = 24;
		long ramMg = 1600l;
		float pricePc = 35000.55f;
		double priceMonit = 12000.12d;
		char videoKarta = 'n';
		boolean ispraven = true;

		System.out.println("Config PC");
		System.out.println("Kolichestvo yader CPU: " + cpuYader);
		System.out.println("Chastota CPU:          " + cpuMg + "Mg");
		System.out.println("Razmer RAM:            " + ramGb + "GB");
		System.out.println("Chastota RAM:          " + ramMg + "Mg");
		System.out.println("Video karta:           " + videoKarta);
		System.out.println("Cena sistemnogo bloka: " + pricePc + "rub.");
		System.out.println("Cena monitora:         " + priceMonit + "rub.");
		System.out.println("                       " + ispraven);
	}
}