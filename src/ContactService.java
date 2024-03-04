import java.util.ArrayList;

public class ContactService {
	//public variables used to create Contact objects
	public static String publicId;
	public String publicFirstName;
	public String publicLastName;
	public String publicPhone;
	public String publicAddress;
	//Create an array to store Contact objects
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	//method to generate unique contactId
	public static String generateUniqueId() {
		//placeholder variable to return
		String uniqueId;
		//if contactList is empty, assign 10 digit number
		if (contactList.isEmpty()) {
			uniqueId = "1000000000";
			return uniqueId;
		}
		//get latest Id value
		else {
			int listSize = contactList.size();
			uniqueId = contactList.get(listSize - 1).getId();
		}
		//convert string to integer to increment next value
		int tempInt = Integer.valueOf(uniqueId);
		//increment tempInt
		tempInt += 1;
		//convert integer to string for return
		uniqueId = Integer.toString(tempInt);
		return uniqueId;
	}
	//method to create Contact object and add to contactList
	public static void addContact(String userFirst, String userLast, String userPhone, String userAddress) {
		String nextId = generateUniqueId();
		Contact newContact = new Contact(nextId, userFirst, userLast, userPhone, userAddress);
		contactList.add(newContact);
	}
	//methods to update variables that can be updated
	public static void updateFirstName(String uniqueId, String publicFirstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.get(i).setFirstName(publicFirstName);
				break;
			}
		}
	}
	public static void updateLastName(String uniqueId, String publicLastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.get(i).setLastName(publicLastName);
				break;
			}
		}
	}
	public static void updatePhone(String uniqueId, String publicPhone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.get(i).setPhone(publicPhone);
				break;
			}
		}
	}
	public static void updateAddress(String uniqueId, String publicAddress) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.get(i).setAddress(publicAddress);
				break;
			}
		}
	}
	//method to delete contact from contactList
	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.remove(i);
				break;
			}
		}
	}
}
