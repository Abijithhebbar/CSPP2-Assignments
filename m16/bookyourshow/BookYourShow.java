class BookYourShow {
	// int[] a = {1, 2, 3, 5};
	// String[] b = {"1", "2"};
	// Show s1 = new Show("mov1", "dattime1", b);
	// Show s2 = new Show("mov2", "dattime2", b);
	// Show[] showsArray = {s1,s2};
	Show[] showsArray;
	int size;
	BookYourShow() {
		showsArray = new Show[10];
		size = 0;
	}

	public void addAShow(Show var) {
		showsArray[size++] = var;
	}
	public Show getAShow(String moviename, String datetime) {
		for (Show s : showsArray) {
			if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)) {
				return s;
			}
		}
		return null;
	}
	public void bookAShow(String moviename, String datetime, Patron p, String[] seats) {
		for (Show s : showsArray) {
			if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)) {
				for (String seatnum : seats) {
					for (int i = 0; i < s.seatNumber.length; i++) {
						if (s.seatNumber[i].equals(seatnum)) {
							s.seatNumber[i] = "N/A";
							s.booked[i] = p;
						}
					}
				}
			}
		}
	}
	public void showAll() {
		for(Show s:showsArray) {

		}
	}
	public void printTicket(String moviename, String datetime, String mobilenum) {
		boolean booked = false;
		for(Show s:showsArray){
			if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)){
				for(int i =0;i<s.booked.length;i++) {
					if(s.booked[i].mobileNumber.equals(mobilenum)) {
						booked=true;
					}
				}
			}
		}
		if(booked){
			System.out.println("");
		}
	}
}