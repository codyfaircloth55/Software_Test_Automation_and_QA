import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	//Test addTask method
	@Test
	void testTaskServiceClass() {
		TaskService.addTask("Task Name", "Task Description");
		assertTrue(TaskService.taskList.get(0).getTaskId().equals("1000000001"));
		assertTrue(TaskService.taskList.get(0).getTaskName().equals("Task Name"));
		assertTrue(TaskService.taskList.get(0).getTaskDescription().equals("Task Description"));
	}
	//Test deleteTask Method
	@Test
	void testTaskServiceClassDelete() {
		TaskService.addTask("Task Name", "Task Description");
		TaskService.deleteTask("1000000000");
		assertFalse(TaskService.taskInList("1000000000"));
	}
	//Test updateTaskName method
	@Test
	void testTaskServiceClassUpdateName() {
		TaskService.addTask("Task Name", "Task Description");
		TaskService.updateTaskName("1000000000", "New Task");
		assertTrue(TaskService.taskList.get(0).getTaskName().equals("New Task"));
		
	}
	@Test
	void testTaskServiceClassUpdateDesc() {
		TaskService.addTask("Task Name", "Task Description");
		TaskService.updateTaskDescription("1000000000", "New Description");
		assertTrue(TaskService.taskList.get(0).getTaskDescription().equals("New Description"));
	}
	

}
