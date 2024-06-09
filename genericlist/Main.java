package genericlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<User> users = new ArrayList<User>();
        users.add(new User("Caleb","Silver"));
        users.add(new User("Sully","Gold"));
        users.add(new User("Ryan","Bronze"));


        for(User u : users){
            System.out.println(u.get_name());
        }




    }
}
