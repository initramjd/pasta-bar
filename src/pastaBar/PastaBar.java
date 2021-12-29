package pastaBar;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] components = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };

		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String component = "";
		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String phoneNumber;
		int price = 0;
		int totalPrice = 0;
		int discount = 10;

		wellcome();
		menu();

		while (!isOrderFinish(component)) {

			addComponent();
			component = s.next();

			int index = searchIndex(components, component);

			if (searchIndex(components, component) == -1) {
				System.out.println("Niste uneli odgovarajuci prilog! ");
			} else {

				totalPrice = totalPrice + price(prices, index);
			}
		}


		addPhoneNumber();
		phoneNumber = s.next();
		vipCheck(phoneNumbers, phoneNumber);
	}

	public static void wellcome() {

		System.out.println("Izvolite !!");
		System.out.println();
	}

	public static void addComponent() {
		System.out.print("Izaberite sastojak za pastu: ");
	}

	public static void addPhoneNumber() {
		System.out.print("Unesite vas broj telefona: ");
	}

	public static boolean vipCheck(String[] phoneNumbers, String phoneNumber) {
		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phoneNumber.equals(phoneNumbers[i])) {
				return true;
			}
		}
		return false;
	}

	public static void menu() {
		System.out.println("Sastojci i cene:\r\n" + "Makarone - 50 rsd\r\n" + "Spagete - 60 rsd\r\n"
				+ "Bolognese – 120 rsd\r\n" + "Curetina – 120 rsd\r\n" + "Govedja prsuta – 140 rsd\r\n"
				+ "Slanina – 100 rsd\r\n" + "Piletina – 100 rsd\r\n" + "4 sira – 100 rsd\r\n"
				+ "Dimljeni sir – 80 rsd\r\n" + "Parmezan – 50 rsd\r\n" + "Pavlaka – 80 rsd\r\n"
				+ "Pesto sos – 80 rsd\r\n" + "Napolitana – 80 rsd\r\n" + "Povrce mix – 50 rsd\r\n"
				+ "Pecurke – 50 rsd\r\n" + "Kutija – 20 rsd\r\n");
	}

	public static int searchIndex(String[] components, String component) {
		int i = 0;

		while (i < components.length) {

			if (component.equals(components[i])) {
				return i;
			} else if (component.equals("Poruci")) {
				return 0;
			}
			i++;
			
		}
		return -1;
	}

	public static boolean isOrderFinish(String component) {

		return (component.equals("Poruci"));

	}

	public static int price(int[] prices, int index) {

		int price = prices[index];
		return price;

	}
	
	public static double discount(int discount, int totalPrice) {		
		discount = (totalPrice * discount / 100);
		return discount;		
	}

}
