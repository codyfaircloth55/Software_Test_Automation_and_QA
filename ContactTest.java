import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Test for contact creation
	@Test
	void testContactClass() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		assertTrue(newContact.getId().equals("1000"));
		assertTrue(newContact.getFirstName().equals("John"));
		assertTrue(newContact.getLastName().equals("Doe"));
		assertTrue(newContact.getPhone().equals("3522522552"));
		assertTrue(newContact.getAddress().equals("1600 7th St. Ocala, FL 32609"));
	}
	//Test for ID length
	@Test
	void testContactClassIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("999999999999", "John", "Doe", "3522522552", "1600 7th St. Ocala, Fl 32609");
		});
	}
	//Test for null ID
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for firstName length
	@Test
	void testContactClassFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "Johnjohnson", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		});
		
	}
	//Test for null firstName
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", null, "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for lastName length
	@Test
	void testContactClassLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", "Doethockerson", "3522522552", "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for null lastName
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", null, "3522522552", "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for phone length
	@Test
	void testContactClassPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", "Doe", "352252255", "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for null phone
	@Test
	void testContactClassPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", "Doe", null, "1600 7th St. Ocala, FL 32609");
		});
	}
	//Test for address length
	@Test
	void testContactClassAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", "Doe", "3522522552", "1600 Northwest 7th St. Ocala, FL 32609");
		});
	}
	//Test for null address
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1000", "John", "Doe", "3522522552", null);
		});
	}
	//Test firstName Mutator Method
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		newContact.setFirstName("Johnathan");
		assertTrue(newContact.getFirstName().equals("Johnathan"));
	}
	@Test
	void testContactClassSetFirstNameLength() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("Johnathaniel");
		});
	}
	@Test
	void testContactClassSetFirstNameNull() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
		});
	}
	//Test lastName Mutator Method
	@Test
	void testContactClassSetLastName() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		newContact.setLastName("Johnson");
		assertTrue(newContact.getFirstName().equals("Johnson"));
	}
	@Test
	void testContactClassSetLastNameLength() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("Johnsonsonian");
		});
	}
	@Test
	void testContactClassSetLastNameNull() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName(null);
		});
	}
	//Test phone Mutator Method
	@Test
	void testContactClassSetPhone() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		newContact.setPhone("3525255225");
		assertTrue(newContact.getPhone().equals("3535255225"));
	}
	@Test
	void testContactClassSetPhoneLong() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("555555555555");
		});
	}
	@Test
	void testContactClassSetPhoneShort() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("1");
		});
	}
	@Test
	void testContactClassSetPhoneNull() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone(null);
		});
	}
	//Test address Mutator Method
	@Test
	void testContactClassSetAddress() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		newContact.setAddress("352 No St. Apopka, FL 34456");
		assertTrue(newContact.getAddress().equals("352 No St. Apopka, FL 34456"));
	}
	@Test
	void testContactClassSetAddressLength() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress("1600 Northwest 7th St. Ocala, FL 32609");
		});
	}
	@Test
	void testContactClassSetAddressNull() {
		Contact newContact = new Contact("1000", "John", "Doe", "3522522552", "1600 7th St. Ocala, FL 32609");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
		});
		
	}

}
