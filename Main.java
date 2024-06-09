public class Main {

    public static void main(String[] args){

        System.out.println("Hello World");

        User u = new User();

        u.name = "Sally";
        u.membership = "Silver";

        User u2 = new User();

        u2.name = "Ryan";
        u2.membership = "Bronze";



        System.out.println(u.name);
        System.out.println(u.membership);

        System.out.println(u2.name);
        System.out.println(u2.membership);


    }
}
