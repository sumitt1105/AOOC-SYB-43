import java.util.Scanner;

class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;


    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }


    public double calculateBonus() {
        return salary * 0.05;  // 5% bonus for generic employees
    }


    public String generatePerformanceReport() {
        return name + "'s performance is under review. Further evaluation required.";
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}


class Manager extends Employee {
    private String department;


    public Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }

    
    @Override
    public double calculateBonus() {
        return salary * 0.10;  // 10% bonus for managers
    }

    @Override
    public String generatePerformanceReport() {
        return name + " is managing the " + department + " department. Performance review: Excellent leadership.";
    }

    
    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.07;  // 7% bonus for developers
    }


    @Override
    public String generatePerformanceReport() {
        return name + " is proficient in " + programmingLanguage + ". Performance review: Consistent delivery of code.";
    }


    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}


class Programmer extends Developer {
    private String projectName;


    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String projectName) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.projectName = projectName;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;  // 8% bonus for programmers
    }


    @Override
    public String generatePerformanceReport() {
        return name + " is working on the project: " + projectName + ". Performance review: Excellent coding skills.";
    }


    public void debugCode() {
        System.out.println(name + " is debugging code for the project: " + projectName + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Manager's name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter Manager's address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Enter Manager's salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine();  // Consume the leftover newline
        System.out.print("Enter Manager's job title: ");
        String managerJobTitle = scanner.nextLine();
        System.out.print("Enter Manager's department: ");
        String department = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAddress, managerSalary, managerJobTitle, department);

      
        System.out.print("Enter Developer's name: ");
        String developerName = scanner.nextLine();
        System.out.print("Enter Developer's address: ");
        String developerAddress = scanner.nextLine();
        System.out.print("Enter Developer's salary: ");
        double developerSalary = scanner.nextDouble();
        scanner.nextLine();  // Consume the leftover newline
        System.out.print("Enter Developer's job title: ");
        String developerJobTitle = scanner.nextLine();
        System.out.print("Enter Developer's programming language: ");
        String programmingLanguage = scanner.nextLine();

        Developer developer = new Developer(developerName, developerAddress, developerSalary, developerJobTitle, programmingLanguage);

       
        System.out.print("Enter Programmer's name: ");
        String programmerName = scanner.nextLine();
        System.out.print("Enter Programmer's address: ");
        String programmerAddress = scanner.nextLine();
        System.out.print("Enter Programmer's salary: ");
        double programmerSalary = scanner.nextDouble();
        scanner.nextLine();  // Consume the leftover newline
        System.out.print("Enter Programmer's job title: ");
        String programmerJobTitle = scanner.nextLine();
        System.out.print("Enter Programmer's programming language: ");
        String programmerProgrammingLanguage = scanner.nextLine();
        System.out.print("Enter Programmer's project name: ");
        String projectName = scanner.nextLine();

        Programmer programmer = new Programmer(programmerName, programmerAddress, programmerSalary, programmerJobTitle, programmerProgrammingLanguage, projectName);

        
        System.out.println("\n--- Manager Details ---");
        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject("Company Expansion");

        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.writeCode();

        System.out.println("\n--- Programmer Details ---");
        programmer.displayDetails();
        System.out.println("Bonus: " + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
        programmer.debugCode();

        
        scanner.close();
    }
}
