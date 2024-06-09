package constructor;

import java.security.PublicKey;

public class User {

    private String name;
    private String membership;


   public User(String name,String membership){
       this.name = name;
       this.membership = membership;
   }

  /* public User(){

   }*/  //Commented function allows for using the User without parameters

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
