package HWDesignProblems.CreditCardDesign;

public class EmailNotice implements Notification{
    @Override
    public void notification() {
            System.out.println("Sending an Email Notification:");
            System.out.println("Hey firstName, you have successfully registered to add and here is your , please use this for future references.");
        }
    }

