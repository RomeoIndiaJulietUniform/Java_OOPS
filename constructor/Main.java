package constructor;


public class Main {

    public static void main(String[] args){

       User u = new User("Sally","Gold");

       User u2 = new User("Ryan","Bronze");

        System.out.println(u.get_name());
        System.out.println(u.get_membership());

        System.out.println(u2.get_name());
        System.out.println(u2.get_membership());



    }
}
