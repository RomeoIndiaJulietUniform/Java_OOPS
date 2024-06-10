package polymorphism;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Student s = new Student();
        s.set_name("Student");
        Teacher t = new Teacher();
        t.set_name("Teacher");

        System.out.println(t.get_name());
        System.out.println(s.get_verified());
        s.set_membership("Copper");
        System.out.println(s.get_membership());

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Hank","Silver"));
        User.admins.add(new User("Sully","Gold"));
        User.admins.add(new User("Ryan","Bronze"));


        /*User.print_all();*/


        for(User u : User.admins){
             u.verify();
        }

    }
}
