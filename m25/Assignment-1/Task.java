class Task{
	String title, assignedTo, status, importantStatus, urgentStatus;
	int timeToComplete;
	boolean important, urgent;
	Task (){}
	Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
		checkStatus();
		taskName();
		toDotime();
		statusCheck();
	}
	public void checkStatus() {
		if (important == true && urgent == true) {
			importantStatus = "Important";
			urgentStatus = "Urgent";
		} else if (important == true && urgent == false) {
			importantStatus = "Important";
			urgentStatus = "Not Urgent";
		} else {
			importantStatus = "Not Important";
			urgentStatus = "Not Urgent";
		}
	}
	public void taskName(){
		try {
			if (assignedTo != null) {
				assignedTo = assignedTo;
			}
		} catch (Exception e) {
			System.out.println("Title not provided");
		}
	}
	public void toDotime() {
		try {
			if (timeToComplete > 1) {
				timeToComplete = timeToComplete;
			}
		} catch (Exception e) {
			System.out.println("Invalid timeToComplete "+timeToComplete);
		}
	}
	public void statusCheck() {
		try {
			if (status == "done" || status == "todo") {
				status = status;
			}
		} catch (Exception e) {
			System.out.println("Invalid status "+status);
		}
	}
	public String toString() {
		return (title+", "+assignedTo+", "+timeToComplete+", "+importantStatus+", "+urgentStatus+", "+status);
	// return title;
	}
}