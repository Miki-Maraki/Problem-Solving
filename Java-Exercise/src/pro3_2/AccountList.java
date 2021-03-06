package pro3_2;

public final class AccountList {
	private static Account[] actArray;
	private static int size = 0;

	AccountList() {
		if (this.size == 0) {
			this.size = 0;
			actArray = new Account[10];
		}
	}

	public void add(Account act) {
		actArray[size] = act;
		size++;
	}

	public Account get(int index) {
		return actArray[index];
	}
	
	public String toString(int i, int j) {
		// System.out.println(size);
				StringBuilder s = new StringBuilder();
				// s.append(actArray[i].getAcctType() + actArray[i].getBalance());
				s.append("Account type = " + actArray[i].getAcctType() + "\n" + "Current balance = " + actArray[i].getBalance()
						+ "\n");

				for (int k = i + 1; k < j; k++) {
					s.append("Account type = " + actArray[k].getAcctType() + "\n" + "Current balance = "
							+ actArray[k].getBalance() + "\n");
				}

				return s.toString();
			}
}
