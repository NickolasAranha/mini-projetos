import java.util.ArrayList;

public class Bank {
    ArrayList<Account> contas = new ArrayList<>();
		
		public void createAccounts() {
			contas.add(new Account(1, 1234));
			contas.add(new Account(2, 1234));
			contas.add(new Account(3, 1234));
			contas.add(new Account(4, 1234));
		}
}