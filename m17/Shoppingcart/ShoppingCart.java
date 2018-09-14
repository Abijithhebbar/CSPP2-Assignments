class ShoppingCart {
	Item[] cart;
	Item[] catalog;
	int cartSize;
	int catalogSize;
	static boolean coupen = true;;
	static double discount = 0.0;
	String[] coupens = {"IND10", "IND20", "IND30", "IND50"};
	ShoppingCart() {
		cart = new Item[20];
		catalog = new Item[20];
		cartSize = 0;
		catalogSize = 0;
	}

	void addToCart(Item item) {
		if (!inCart(item)) {
			if (checkQunatity(item)) {
				cart[cartSize++] = item;

			}
		}
	}
	private boolean inCart(Item item) {
		for (int i = 0 ; i < cartSize; i++) {
			if (cart[i].equals(item)) {
				cart[i].itemQuantity += item.itemQuantity;
				return true;
			}
		}
		return false;

	}
	boolean checkQunatity(Item item) {
		for (Item i : catalog) {
			if (i != null) {
				if (i.equals(item)) {
					if (item.itemQuantity <= i.itemQuantity) {
						i.itemQuantity = i.itemQuantity - item.itemQuantity;
						return true;
					}
				}
			}
		}
		return false;
	}
	void addToCatalog(Item item) {
		catalog[catalogSize++] = item;
	}
	void removeFromCart(Item item) {
		int index;
		int inittialQuat = 0;
		for (index = 0; index < cartSize; index++) {
			if (item.equals(cart[index])) {
				cart[index].itemQuantity = cart[index].itemQuantity - item.itemQuantity;
			}
		}
	}

	void printInvoice() {
		System.out.println("Name   quantity   Price");
		for (Item i : cart) {
			if (i != null) {
				if (i.itemQuantity != 0) {
					System.out.println(i.toString1() + " " + getPrice(i));
					System.out.println(payableAmount());
				}
			}
		}
		double total = totalAmount();
		System.out.println("Total:" + total);
		System.out.println("Disc%:" + discount);
		double newTotal = total - discount;
		System.out.println("Tax:" + (0.15) * newTotal);
		payableAmount();
	}
	void applyDiscount(String cou) {
		double dis = 0.0;
		if (!coupen) {
			return;
		}
		boolean valid = false;
		for (int i = 0; i < coupens.length; i++) {
			if (cou.equals(coupens[i])) {
				int num = Integer.parseInt(cou.substring(3));
				dis = num;
				coupens[i] = null;
				coupen = false;
				valid = true;
			}
		}
		if (valid) {
			double total = totalAmount();
			double dis1 = (total / 100) * dis;
			discount = dis1;
		} else {
			System.out.println("Invalid coupon");
		}

	}
	double payableAmount() {
		double total = totalAmount();
		double newTotal = (total) - discount;
		double tax = (0.15) * (newTotal);
		return (newTotal + tax);
	}

	void showCart() {
		for (Item i : cart) {
			if (i != null) {
				if (i.itemQuantity != 0) {
					System.out.println(i.toString1());
				}
			}
		}
	}
	double getPrice(Item given) {
		for (Item i : catalog) {
			if (i.equals(given)) {
				return i.itemPrice;
			}
		}
		return 0.0;
	}
	void showCatalog() {
		for (Item i : catalog) {
			if (i != null) {
				System.out.println(i);
			}
		}

	}
	double totalAmount() {
		double total = 0;
		for (Item i : cart) {
			if (i != null) {
				total += getPrice(i) * i.itemQuantity;
			}
		}
		return total;

	}



}