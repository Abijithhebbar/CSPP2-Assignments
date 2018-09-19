class Person {
	private String user;
	private List<String> frnList;
	Person(String user) {
		this.user = user;
		frnList = new List<String>();
	}
	public String getUser() {
		return this.user;
	}
	public void addFriend(String follower) {
		frnList.add(follower);
	}
	public List<String> getList() {
		return frnList;
	}
	public String toString() {
		// String str = "[";
		// for (int i = 0; i < frnList.size() - 1; i++) {
		// 	str +=  frnList.get(i) + ", ";
		// }
		// str += frnList.get(frnList.size() - 1) + "]";
		String str = this.user+": "+frnList.toString();
		return str;
	}
}