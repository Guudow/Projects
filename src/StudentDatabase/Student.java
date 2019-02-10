package StudentDatabase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourses = 600;
    private static int id = 1000;

    // constructor prompt user to enter student's name and year

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("1 - freshment\n2- for Sohmore\n3  Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scan.nextInt();

        setStudentID();

        // System.out.println(firstName + " " + lastName + " " + gradeYear + " "+ studentID);


    }

    // generate an ID
    private void setStudentID(){
        //grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // enroll in courses
    public void enroll(){
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll(Q to Quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                courses = course + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourses;
            } else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION Balance: " + tuitionBalance);
    }

    // view balance

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition(){
        System.out.println("Enter Your payment: $");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        viewBalance();

    }

    // show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
