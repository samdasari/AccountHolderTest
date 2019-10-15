package classesandobjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Moody";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditcard();
		System.out.println("Is Tom Eligible for CC : " +tom.eligibleForCreditCard);
		
		henry.firstName="Tom";
		henry.lastName="Moody";
		henry.age=27;
		henry.accountBalance=20000;
		henry.testEligibilityForCreditcard();
		System.out.println("Is Henry Eligible for CC : " +henry.eligibleForCreditCard);
		
		sarah.firstName="Tom";
		sarah.lastName="Moody";
		sarah.age=30;
		sarah.accountBalance=30000;
		sarah.testEligibilityForCreditcard();
		System.out.println("Is Sarah Eligible for CC : " +sarah.eligibleForCreditCard);
	}

}
