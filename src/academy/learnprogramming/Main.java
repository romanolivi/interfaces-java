package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    ITelephone myPhone;
	    myPhone = new DeskPhone(7654321);
	    myPhone.powerOn();
	    myPhone.callPhone(123456);
	    myPhone.answer();

	    myPhone = new MobilePhone(24565);
	    myPhone.callPhone(24565);
	    myPhone.answer();
    }
}



















