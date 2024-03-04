import java.util.ArrayList;

public class TaskService {
	//Public Variables used to create Task objects
	public static String publicTaskId;
	public String publicTaskName;
	public String publicTaskDesc;
	//Create an array to store Task objects
	static ArrayList<Task> taskList = new ArrayList<Task>(0);
	//Method to generate unique taskId
	public static String generateUniqueTaskId() {
		String uniqueId;
		if (taskList.isEmpty()) {
			uniqueId = "1000000000";
			return uniqueId;
		}
		else {
			uniqueId = taskList.get(taskList.size() - 1).getTaskId();
		}
		int tempInt = Integer.valueOf(uniqueId);
		tempInt += 1;
		uniqueId = Integer.toString(tempInt);
		return uniqueId;
	}
	//Method to create Task object and add to taskList
	public static void addTask(String taskName, String taskDescription) {
		String nextId = generateUniqueTaskId();
		Task newTask = new Task(nextId, taskName, taskDescription);
		taskList.add(newTask);
	}
	//Methods to update taskName and taskDescription
	public static void updateTaskName(String uniqueId, String publicTaskName) {
		for (int i = 0; i < taskList.size(); i++) {
			if (uniqueId.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.get(i).setTaskName(publicTaskName);
				break;
			}
		}
	}
	public static void updateTaskDescription(String uniqueId, String publicTaskDesc) {
		for (int i = 0; i < taskList.size(); i++) {
			if (uniqueId.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.get(i).setTaskDescription(publicTaskDesc);
				break;
			}
		}
	}
	//Method to delete Task from taskList
	public static void deleteTask(String uniqueId) {
		for (int i = 0; i < taskList.size(); i++) {
			if (uniqueId.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.remove(i);
				break;
			}
		}
	}
	//Method to determine if uniqueId is in list; for testing
	public static boolean taskInList(String uniqueId) {
		boolean found = false;
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskId().equals(uniqueId)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
}	
