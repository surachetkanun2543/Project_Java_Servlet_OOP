package app.Model;


public class CustomerModel {

	private  static int id;
	private static String name;
	private static String surname;
	private static String username;
	private static int password;
	private static int address;
	private static int postcode;
	private static int bank_acct;
	private static double balance;
	private static int verified;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		CustomerModel.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		CustomerModel.name = name;
	}
	public static String getSurname() {
		return surname;
	}
	public static void setSurname(String surname) {
		CustomerModel.surname = surname;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		CustomerModel.username = username;
	}
	public static int getPassword() {
		return password;
	}
	public static void setPassword(int password) {
		CustomerModel.password = password;
	}
	public static int getAddress() {
		return address;
	}
	public static void setAddress(int address) {
		CustomerModel.address = address;
	}
	public static int getPostcode() {
		return postcode;
	}
	public static void setPostcode(int postcode) {
		CustomerModel.postcode = postcode;
	}
	public static int getBank_acct() {
		return bank_acct;
	}
	public static void setBank_acct(int bank_acct) {
		CustomerModel.bank_acct = bank_acct;
	}
	public static double getBalance() {
		return balance;
	}
	public static void setBalance(double balance) {
		CustomerModel.balance = balance;
	}
	public static int getVerified() {
		return verified;
	}
	public static void setVerified(int verified) {
		CustomerModel.verified = verified;
	}
	
	
}
