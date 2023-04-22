import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
	//Test for Task Creation
	@Test
	void testTaskClass() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		assertTrue(newTask.getTaskId().equals("1"));
		assertTrue(newTask.getTaskName().equals("Task Name"));
		assertTrue(newTask.getTaskDescription().equals("Task Description"));
	}
	//Test taskId for length
	@Test
	void testTaskClassTaskIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("10000000000", "Task Name", "Task Description");
		});
	}
	//Test for null taskId
	@Test
	void testTaskClassTaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Task Name", "Task Description");
		});
	}
	//Test taskName for length
	@Test
	void testTaskClassTaskNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Task Name Is Way Too Long", "Task Description");
		});
	}
	//Test for null taskName
	@Test
	void testTaskClassTaskNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", null, "Task Description");
		});
	}
	//Test taskDescription for length
	@Test
	void testTaskClassTaskDescLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Task Name", "Task Description Is Way Too Long!!!!!!!!!!!!!!!!!!!!!!!");
		});
	}
	//Test for null taskDescription
	@Test
	void testTaskClassTaskDescNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Task Name", null);
		});
	}
	//Test taskName Mutator Method
	@Test
	void testTaskClassSetTaskName() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		newTask.setTaskName("New Task");
		assertTrue(newTask.getTaskName().equals("New Task"));
	}
	@Test
	void testTaskClassSetTaskNameLength() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setTaskName("Task Name Is Way Too Long");
		});
	}
	@Test
	void testTaskClassSetTaskNameNull() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setTaskName(null);
		});
	}
	//Test takeDescription Mutator Method
	@Test
	void testTaskClassSetTaskDesc() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		newTask.setTaskDescription("New Task Description");
		assertTrue(newTask.getTaskDescription().equals("New Task Description"));
	}
	@Test
	void testTaskClassSetTaskDescLength() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setTaskDescription("Task Description Is Way Too Long!!!!!!!!!!!!!!!!!!!!!!!");
		});
	}
	@Test
	void testTaskClassSetTaskDescNull() {
		Task newTask = new Task("1", "Task Name", "Task Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setTaskDescription(null);
		});
	}


}
