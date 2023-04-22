public class Contact {
	//class variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Constructor
	public Contact(String userId, String userFirst, String userLast, String userPhone, String userAddress) {
		//check for contactId requirements; throw exception if not followed
		if (userId == null || userId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		//check for firstName requirements; throw exception if not followed
		if (userFirst == null || userFirst.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//check for lastName requirements; throw exception if not followed
		if (userLast == null || userLast.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//check for phone requirements; throw exception if not followed
		if (userPhone == null || userPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		//check for address requirements; throw exception if not followed
		if (userAddress == null || userAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		//if all requirements are followed assign passed information to object variables
		this.contactId = userId;
		this.firstName = userFirst;
		this.lastName = userLast;
		this.phone = userPhone;
		this.address = userAddress;		
	}
	
	//Accessor Methods
	public String getId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	//Mutator Methods
	//No mutator should be created for contactId
	public void setFirstName(String userFirst) {
		//check for firstName requirements
		if (userFirst == null || userFirst.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//if requirement is followed, assign userFirst to firstName
		this.firstName = userFirst;
	}
	public void setLastName(String userLast) {
		//check for lastName requirements
		if (userLast == null || userLast.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//if requirement is followed, assign userLast to lastName
		this.lastName = userLast;
			
	}
	public void setPhone(String userPhone) {
		//check for phone requirements
		if (userPhone == null || userPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		//if requirement is followed, assign phone to userPhone
		this.phone = userPhone;
	}
	public void setAddress(String userAddress) {
		//check for address requirements
		if (userAddress == null || userAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		//if requirement is followed, assign address to userAddress
		this.address = userAddress;		
	}
}