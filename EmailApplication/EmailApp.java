package EmailApplication;

public class EmailApp {
    public static void main(String[] args) {
        Email mail1 = new Email("Enes", "Catal");
        System.out.println("==================================================================");
        System.out.println(mail1.showInfo());
        /*
        mail1.setAlternateEmail("catalenes6@gmail.com");
        System.out.println("Setting alternate email: " + mail1.getAlternateEmail());
        */
    }
}
