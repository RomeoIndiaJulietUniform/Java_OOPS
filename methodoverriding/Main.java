package methodoverriding;

public class Main {

    public static void main(String[] args){

        User u = new User("Sally","Gold");

        User u2 = new User("Sally","Gold");

        /*User u2 = new User("Ryan","Bronze");*/

        System.out.println(u.equals(u2));


    }
}
