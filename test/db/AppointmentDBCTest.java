package db;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import model.Appointment;

import org.junit.Test;

public class AppointmentDBCTest {
	@SuppressWarnings("deprecation")
/*	
	@Test
	public void appointmentShouldBeAddedToDatabase() {
		Date startTime = new Date(2015-1900, 4, 8, 16, 15, 00);
		Date endTime = new Date(2015-1900, 4, 8, 18, 00, 00);
		Date alarmTime = new Date(2015-1900, 4, 8, 16, 00, 00);
		String title = "Sage ved";
		String description = "Da var det vel på tide å sage ved igjen?";
		String location = "Bua";
		String username = "user";
		int roomId = 1;
		
		AppointmentDBC.addAppointment(startTime, endTime, alarmTime, title, description, location, username, roomId);
	}

	@Test
	public void addInvitationShouldInviteUserToAppointment() {
		//AppointmentDBC.addInvitation(11, "user", null);
	}

	@Test
	public void appointmentListShouldBeRetrieved() {
		Date selectedDate = new Date(2015-1900, 2, 5);
		System.out.println(selectedDate);
		ArrayList<Appointment> appointmentList = AppointmentDBC.getAppointmentList("user", selectedDate);
		
		System.out.println(appointmentList.size());
		for (Appointment a : appointmentList) {
			System.out.println(a);
		}
	}
*/	
	@Test
	public void appointmentShouldBeRetrieved() {
		Appointment appointment = AppointmentDBC.getAppointment(65, "user");
		System.out.println(appointment);
	}
/*
	@Test
	public void appointmentShouldBeRemoved() {
		Appointment appointment = AppointmentDBC.getAppointment(63, "user");
		assertNotNull(appointment);
		
		AppointmentDBC.removeAppointment(63);
		appointment = AppointmentDBC.getAppointment(63, "user");
		assertNull(appointment);
	}
	*/
/*	
	@Test
	public void onlyInvitationShouldBeRemoved() {
		AppointmentDBC.removeInvitation(64, "user");
		Appointment appointment = AppointmentDBC.getAppointment(64, "user");
		assertNotNull(appointment);
	}
	*/
	
	@Test
	public void invitationShouldBeAcceptedOrDeclined() {
		AppointmentDBC.acceptInvitation(65, "user");
		AppointmentDBC.declineInvitation(66, "user");
	}
}
