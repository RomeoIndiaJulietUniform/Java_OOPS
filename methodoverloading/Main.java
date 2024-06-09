package methodoverloading;

public class Main {

    public static void main(String[] args){

       User u = new User();

        u.set_name("Sally");
        u.set_membership(User.Membership.Silver);

        User u2 = new User();

        u2.set_name("Ryan");
        u2.set_membership(User.Membership.Bronze);



        System.out.println(u.get_name());
        System.out.println(u.get_membership());

        System.out.println(u2.get_name());
        System.out.println(u2.get_membership());



    }
}
