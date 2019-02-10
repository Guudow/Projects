package StudentDatabase;

public class StudentDataApp {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());

        Student stu2 = new Student();
        stu2.enroll();
        stu2.payTuition();
        System.out.println(stu2.toString());

        Student stu3 = new Student();
        stu3.enroll();
        stu3.payTuition();
        System.out.println(stu3.toString());


        // Ask how many new users we want to add

        // Create n number of new student
    }
}
