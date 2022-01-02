package assignment3;

import java.util.Scanner;

class Employee {
    String name, add, mail;
    float id, mobile, basic;

    void salary() {
        float da, hra, pf, cf, gross;
        da = basic * 97 / 100;
        hra = basic * 10 / 100;
        pf = basic * 12 / 100;
        cf = basic * 0.1f / 100;
        gross = basic + da + hra - pf - cf;
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Gross Salary: " + gross);
    }
}

class Programmer extends Employee {
    Programmer(String name, int sal) {
        this.name = name;
        basic = sal;
    }
}

class TeamLead extends Employee {
    TeamLead(String name, int sal) {
        this.name = name;
        basic = sal;
    }
}

class APM extends Employee {
    APM(String name, int sal) {
        this.name = name;
        basic = sal;
    }
}

class ProjectManager extends Employee {
    ProjectManager(String name, int sal) {
        this.name = name;
        basic = sal;
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("employee 1");
        System.out.println("employee 2");
        System.out.println("employee 3");
        System.out.println("employee 4");
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                Programmer p = new Programmer("Vaishnavi", 50000);
                p.salary();
                break;
            case 2:
                TeamLead t = new TeamLead("Shubham", 55000);
                t.salary();
            case 3:
                APM a = new APM("khushi", 80000);
                a.salary();
            case 4:
                ProjectManager pm = new ProjectManager("Sakshi", 200000);
                pm.salary();
            default:
                break;
        }
    }
}
