import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	//Public variable for Id generation
	public static String publicAppId;
	//Array to store Appointment objects
	static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>(0);
	//Method to generate unique appointmentId
	public static String generateAppId() {
		String uniqueId;
		if (appointmentList.isEmpty()) {
			uniqueId = "1000000000";
			return uniqueId;
		}
		else {
			uniqueId = appointmentList.get(appointmentList.size() - 1).getAppId();
		}
		int tempInt = Integer.valueOf(uniqueId);
		tempInt += 1;
		uniqueId = Integer.toString(tempInt);
		return uniqueId;
	}
	//Method to add appointment object
	public static void addAppointment(Date appDate, String appDescription) {
		String nextId = generateAppId();
		Appointment newApp = new Appointment(nextId, appDate, appDescription);
		appointmentList.add(newApp);	
	}
	//Method to delete appointment object
	public static void deleteAppointment(String appId) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appId.compareTo(appointmentList.get(i).getAppId()) == 0) {
				appointmentList.remove(i);
				break;
			}
		}
	}
	//Method to determine if appointment is in appointmentList
	public static boolean appointmentInList(String appId) {
		boolean found = false;
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appId.compareTo(appointmentList.get(i).getAppId()) == 0) {
				found = true;
				break;
			}
		}
		return found;
	}
}
