package staticmethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        User.admins = new ArrayList<User>();
        User.admins.add(new User("Hank","Silver"));
        User.admins.add(new User("Sully","Gold"));
        User.admins.add(new User("Ryan","Bronze"));


        User.print_all();

    }
}
