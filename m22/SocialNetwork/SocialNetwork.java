import java.util.Arrays;
class SocialNetwork {
	private List<Person> pData;
	SocialNetwork() {
		pData = new List<Person>();
	}
	public void addConnection(String user, String friend) {
		for (int i = 0; i < pData.size(); i++) {
			if (user.equals(pData.get(i).getUser())) {
				pData.get(i).addFriend(friend);
			}
		}
	}
	public void addConnection(Person person) {
		pData.add(person);
	}
	public String getConnections(String user) {
		for (int i = 0; i < pData.size(); i++) {
			if (user.equals(pData.get(i).getUser())) {
				return pData.get(i).toString();
			}
		}
		return "Not a user in Network";
	}
	public void getCommonConnections(String personOne, String personTwo) {
		List<String> temp1 = new List<String>();
		List<String> temp2 = new List<String>();
		List<String> result = new List<String>();
		for (int i = 0; i < pData.size(); i++) {
			if (personOne.equals(pData.get(i).getUser())) {
				temp1 = pData.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < pData.size(); i++) {
			if (personTwo.equals(pData.get(i).getUser())) {
				temp2 = pData.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < temp1.size(); i++) {
			if (temp2.contains(temp1.get(i))) {
				result.add(temp1.get(i));
			}
		}
		System.out.println(result.toString());
	}
	public void showAll() {
		String[] uNames = new String[pData.size()];
		for (int i = 0; i < pData.size(); i++) {
			uNames[i] = pData.get(i).toString();
		}
		Arrays.sort(uNames);
		String str = Arrays.toString(uNames);
		System.out.println(str.substring(1,str.length()-1));
	}
}