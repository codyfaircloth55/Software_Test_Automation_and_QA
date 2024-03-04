import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	//Test addContact Method
	@Test
	void testContactServiceClass() {
		ContactService.addContact("John", "Doe", "1111111111", "Real Address");
		assertTrue(ContactService.contactList.get(0).getId().equals("1000000000"));
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("John"));
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Doe"));
		assertTrue(ContactService.contactList.get(0).getPhone().equals("1111111111"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("RealAddress"));
	}
	//Test deleteContact Method
	@Test
	void testContactServiceClassDelete() {
		ContactService.addContact("John", "Doe", "1111111111", "Real Address");
		ContactService.deleteContact("1000000001");
		assertTrue(ContactService.contactInList("1000000001") == false);
	}
	//Test updateFirstName Method
	@Test
	void testContactServiceUpdateFirstName() {
		ContactService.addContact("John", "Doe", "1111111111", "Real Address");
		int size = ContactService.contactList.size();
		ContactService.updateFirstName("1000000000", "Jack");
		assertTrue(ContactService.contactList.get(size - 1).getFirstName().equals("Jack"));
		
	}
	//Test updateLastName Method
	@Test
	void testContactServiceUpdateLastName() {
		int size = ContactService.contactList.size();
		ContactService.updateLastName("1000000000", "Dawkins");
		assertTrue(ContactService.contactList.get(size - 1).getLastName().equals("Dawkins"));
	}
	//Test updatePhone Method
	@Test
	void testContactServiceUpdatePhone() {
		int size = ContactService.contactList.size();
		ContactService.updatePhone("100000000", "2222222222");
		assertTrue(ContactService.contactList.get(size - 1).getPhone().equals("2222222222"));
	}
	//Test updateAddress Method
	@Test
	void testContactServiceUpdateAddress() {
		int size = ContactService.contactList.size();
		ContactService.updatePhone("1000000000", "Fake Address");
		assertTrue(ContactService.contactList.get(size - 1).getAddress().equals("Fake Address"));
	}

}
