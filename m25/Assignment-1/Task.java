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
		try {
			taskName();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		try {
		toDotime();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		return;
		}
		try {
			statusCheck();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
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
	public void taskName() throws Exception {
			if (assignedTo != null) {
				assignedTo = assignedTo;
			} else {
				throw new Exception("Title not provided");
			}
	}
	public void toDotime() throws Exception {
			if (timeToComplete > 1) {
				timeToComplete = timeToComplete;
			} else {
				throw new Exception("Invalid timeToComplete "+timeToComplete);
			}

	}
	public void statusCheck() throws Exception {
		String a = "done";
		String b = "todo";
			if (status.equals(a)) {
				status = status;
			}
			else if (status.equals(b)) {
				status =status;
			} else {
				throw new Exception("Invalid status "+status);
			}
	}
	public String toString() {
		return (title+", "+assignedTo+", "+timeToComplete+", "+importantStatus+", "+urgentStatus+", "+status);
	// return title;
	}
}