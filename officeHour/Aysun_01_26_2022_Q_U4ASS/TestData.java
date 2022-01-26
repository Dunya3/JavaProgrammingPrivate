package Aysun_01_26_2022_Q_U4ASS;

public class TestData {

    public static final String username = "username";
    public static final String password = "123";

    // username="abcd";

    public final void finalMethod(){
        System.out.println("Final method");
    }
}

class Child extends TestData { // subclass mozemo da napravimo u istom class u

  //  @Override             kada imamo final ne mozemo da override
  //  public int hashCode() {
   //     return super.hashCode();
    }


