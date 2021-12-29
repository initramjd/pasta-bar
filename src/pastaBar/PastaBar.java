package pastaBar;

public class PastaBar {

	public static void main(String[] args) {

		String[] components = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };

		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String phoneNumber;

		wellcome();
		menu();
		addComponents();

	}

	public static int findIngredient(String[] ingredients, String ingredientName) {

		return 0;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		return false;
	}

	public static void wellcome() {

		System.out.println("Izvolite !!");
		System.out.println();
	}

	public static void addComponents() {

		System.out.print("Izaberite sastojak za pastu: ");
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
		
		System.out.println("Sastojci i cene:\r\n" + 
				"Makarone - 50 rsd\r\n" + 
				"Spagete - 60 rsd\r\n" + 
				"Bolognese – 120 rsd\r\n" + 
				"Curetina – 120 rsd\r\n" + 
				"Govedja prsuta – 140 rsd\r\n" + 
				"Slanina – 100 rsd\r\n" + 
				"Piletina – 100 rsd\r\n" + 
				"4 sira – 100 rsd\r\n" + 
				"Dimljeni sir – 80 rsd\r\n" + 
				"Parmezan – 50 rsd\r\n" + 
				"Pavlaka – 80 rsd\r\n" + 
				"Pesto sos – 80 rsd\r\n" + 
				"Napolitana – 80 rsd\r\n" + 
				"Povrce mix – 50 rsd\r\n" + 
				"Pecurke – 50 rsd\r\n" + 
				"Kutija – 20 rsd\r\n");
	}

}
