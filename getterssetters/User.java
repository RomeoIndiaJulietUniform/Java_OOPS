package getterssetters;

public class User {
    private String name;
    private String membership;


    void set_name(String name){
        this.name = name;
    }

    void set_membership(String membership){
        this.membership = membership;
    }

    String get_name(){
        return name;
    }

    String get_membership(){
        return membership;
    }
}