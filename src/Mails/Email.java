package Mails;

public class Email {

    public static void main(String[] args) {

        EmailApps mp = new EmailApps("Mohamed", "Guudow");

        // mp.setAlternateEmail("js@gmail.com");
        System.out.println(mp.getAlternateEmail());
        System.out.println(mp.showInfo());


    }
}

