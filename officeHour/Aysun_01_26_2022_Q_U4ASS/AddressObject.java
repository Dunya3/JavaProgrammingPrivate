package Aysun_01_26_2022_Q_U4ASS;

public class AddressObject {
    public static void main(String[] args) {

        Address home = new Address();
        home.setStreet("4001 9th St North apt 1909");
        home.setCity("Arlington");
        home.setZipCode("22203");
        home.setState("VA");

        System.out.println("Home address:" + home);
        home.setZipCode("200003");
        home.setStreet("");
        System.out.println("Home addres:" + home);

        Address work = new Address("Sfggfjh", "dfdfjhdgfj", "dfbdsfbs", "dggsdf");
    }


}