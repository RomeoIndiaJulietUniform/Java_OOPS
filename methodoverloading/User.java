package methodoverloading;

public class User {
    private String name;
    private String membership;


    void set_name(String name){
        this.name = name;
    }

    void set_membership(String membership){
        this.membership = membership;
    }

    void set_membership(Membership membership){
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