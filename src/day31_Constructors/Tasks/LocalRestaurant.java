package day31_Constructors.Tasks;

public class LocalRestaurant {


        public static void main(String[] args) {

            Restaurant localRestaurant= new Restaurant("Ambar", "Wilson blvd", 5);

            Server server1=new Server("Sandra", 2578, 7.5, true);

            Server server2=new Server("Dunja", 3678, 8.5, true);

            Server server3=new Server("Anelya", 1425, 7.2, false);

            Server server4=new Server("Mixa", 2541, 5212, false);

            Server[] servers = {server1,server2,server3,server4};

            Chef chef1 = new Chef("Dayan", 4123, 8.5, false);
            Chef chef2 = new Chef("Mikael", 1296, 7.5, true);
            Chef chef3 = new Chef("Petro", 2845, 5.5, false);

            Chef[] chefs={chef1,chef2,chef3};

            System.out.println(localRestaurant);

        }


    }
