package Assingmennt2;

public class Programmer  extends Developer {
    String language;

    Programmer(String name, double salary,
               String projectName, String language) {

        super(name, salary, projectName);
        this.language = language;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Project: " + projectName);
        System.out.println("Language: " + language);
    }
}
 
