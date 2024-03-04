import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import java.util.Date;
import java.util.Calendar;



class AppointmentServiceTest {
	private Date testDate;
	private String testDesc;
	//setup for tests
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		testDate = new Date(123, Calendar.APRIL, 23);
		testDesc = "A description for an appointment.";
	}
	//Test addAppointment method
	@Test
	void testAppointmenServiceAddAppointment() {
		AppointmentService.addAppointment(testDate, testDesc);
		assertTrue(AppointmentService.appointmentList.get(0).getAppId().equals("1000000000"));
		assertTrue(AppointmentService.appointmentList.get(0).getAppDate().equals(testDate));
		assertTrue(AppointmentService.appointmentList.get(0).getAppDescription().equals(testDesc));
		assertTrue(AppointmentService.appointmentInList("1000000000"));
	}
	//Test deleteAppointment method
	@Test
	void testAppointmentServiceDeleteAppointment() {
		AppointmentService.addAppointment(testDate, testDesc);
		AppointmentService.deleteAppointment("1000000001");
		assertFalse(AppointmentService.appointmentInList("1000000001"));
	}

}
