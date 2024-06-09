package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Student s = new Student();

        s.set_verified(true);
        System.out.println(s.get_verified());
        s.set_membership("Copper");
        System.out.println(s.get_membership());

        /*User.admins = new ArrayList<User>();
        User.admins.add(new User("Hank","Silver"));
        User.admins.add(new User("Sully","Gold"));
        User.admins.add(new User("Ryan","Bronze"));


        User.print_all();*/

    }
}