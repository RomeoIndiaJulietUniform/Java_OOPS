package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String name;
    private String membership;

    public static List<User> admins;


    public User(String name,String membership){
        this.name = name;
        this.membership = membership;
    }

    public static void print_all(){
        for(User u : admins){
            System.out.println(u.get_name());
        }
    }

    public User(){

    }  // allows for using the User without parameters

    public boolean equals(User u2){
        if(get_name() == u2.get_name() && get_membership() == u2.get_membership() ){
            return true;
        }
        else{
            return false;
        }
    }

    void set_name(String name){
        this.name = name;
    }

    void set_membership(String membership){
        this.membership = membership;
    }

    void set_membership(User.Membership membership){
        this.membership = membership.name();
    }


    public enum Membership{
        Bronze,Gold,Silver;
    }

    String get_name(){
        return name;
    }

    String get_membership(){
        return membership;
    }
}
