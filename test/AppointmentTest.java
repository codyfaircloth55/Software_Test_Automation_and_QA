import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Date;
import java.util.Calendar;

class AppointmentTest {
	
	private String testId;
	private String testDesc;
	private String longId;
	private String longDesc;
	private Date testDate;
	private Date oldDate;
	private Date newDate;
	private String newDesc;
	

	//Setup for each test
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		testId = "1000000000";
		testDesc = "Normal length description for an appointment.";
		testDate = new Date(123, Calendar.APRIL, 25);
		newDate = new Date(124, Calendar.APRIL, 25);
		newDesc = "A different description for an appointment.";
		longId = "99999999999";
		longDesc = "A description that is way too long to be used for this appointment class.";
		oldDate = new Date(122, Calendar.JANUARY, 1);
		
		
	}
	//Test the creation of appointment objects
	@Test
	void testAppointmentClass() {
		Appointment newAppt = new Appointment(testId, testDate, testDesc);
		assertTrue(newAppt.getAppId().equals(testId));
		assertTrue(newAppt.getAppDate().equals(testDate));
		assertTrue(newAppt.getAppDescription().equals(testDesc));
	}
	//Test appointment ID for length and null
	@Test
	void testAppointmentClassIdLengthAndNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(longId, testDate, testDesc);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, testDate, testDesc);
		});
	}
	//Test appointment date for future and null
	@Test
	void testAppointmentClassDateFutureAndNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(testId, oldDate, testDesc);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(testId, null, testDesc);
		});
	}
	//Test appointment description for length and null
	@Test
	void testAppointmentClassDescLengthAndNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(testId, testDate, longDesc);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(testId, testDate, null);
		});
	}
	//Test appointment date mutator for accuracy, length, and null
	@Test
	void testAppointmentDateMutatorTest() {
		Appointment newAppt = new Appointment(testId, testDate, testDesc);
		newAppt.setAppDate(newDate);
		assertTrue(newAppt.getAppDate().equals(newDate));
		assertThrows(IllegalArgumentException.class, () -> {
			newAppt.setAppDate(oldDate);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			newAppt.setAppDate(null);
		});
	}
	//Test appointment description mutator for accuracy, length, and null
	@Test
	void testAppointmentDescMutatorTest() {
		Appointment newAppt = new Appointment(testId, testDate, testDesc);
		newAppt.setAppDescription(newDesc);
		assertTrue(newAppt.getAppDescription().equals(newDesc));
		assertThrows(IllegalArgumentException.class, () -> {
			newAppt.setAppDescription(longDesc);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			newAppt.setAppDescription(null);
		});
	}
	
	

}
