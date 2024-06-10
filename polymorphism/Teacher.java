package polymorphism;

public class Teacher extends User{

    void verify(){
        set_verified(true);
        System.out.println("Teacher verified");
    }
}
