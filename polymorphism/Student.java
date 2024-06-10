package polymorphism;

public class Student extends User {

    void verify(){
        set_verified(true);
        System.out.println("Student verified");
    }

}
