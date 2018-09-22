class Todoist{
	Task[] task;
	final int n;
	String[] result;
	Todoist() {
		n = 5;
		task = new Task[n];
		result = new String[n];
	}
	public void add(Task newtask) {
		for (int i = 0; i < n; i++) {
			task[i]= newtask;
		}
	}
	public String toString() {
		String s = task.toString();
		return s;
	}

	int t;
	// Task[] task =new Task[5];
	// Todoist() {
	// 	add();
	// }
	// public void add() {
	// 	for(int i = 0; i < 3; i++) {
	// 		task[i] = task[i];
	// 	}
	// }
	public String getNextTask(String s) {
		return s;
	}
	public int totalTime4Completion(){
		return t;

	// }
	// public String toString() {
	// 	String str = "";
	// 	for (int i = 0; i < 3; i++) {
	// 		str += task[i];
	// 	}
	// 	return str;
	// }
	// // public Task[] getNextTask(String s, int n) {
	// // 	Task[] newtask = new Task();
	// // 	return newtask;
	// // }
}
}