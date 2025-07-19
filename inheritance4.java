// Multi-level inheritance - A class inherits from a class, which is already a subclass of another class.

// Multilevel Inheritance – Problem: Academic Evaluation
// Problem:
// Class Person: name, age
// Class Student: roll number, branch
// Class ExamResult: calculate percentage
// Challenge:
// Use constructors to initialize all fields and calculate performance category:
// 90%+: Distinction
// 75%–89%: First Class
// Below 75%: Needs Improvement

class person {
    String name;
    int age;

    person() {
        name = "default_name-xyz";
        age = 20;
    }
}

class student extends person {
    int rollNo;
    String branch;

    student() {
        rollNo = 1;
        branch = "default-branch";
    }
}

class examResult extends student {
    int calculatedPercentage;

    examResult() {
        calculatedPercentage = 90;
    }

    public void setPercentage(int n) {
        this.calculatedPercentage = n;
    }

    public void checkGrade() {
        if (calculatedPercentage >= 90) {
            System.out.println("Distinction");
        } else if (calculatedPercentage >= 75 && calculatedPercentage < 90) {
            System.out.println("First class");
        } else if (calculatedPercentage < 75 && calculatedPercentage > 35) {
            System.out.println("Need Improvement");
        } else {
            System.out.println("You failed");
        }
    }
}

public class inheritance4 {
    public static void main(String[] args) {
        examResult obj = new examResult();
        System.out.println("Name : " + obj.name);
        System.out.println("Age : " + obj.age);
        System.out.println("Roll No : " + obj.rollNo);
        System.out.println("Branch : " + obj.branch);
        obj.setPercentage(36);
        obj.checkGrade();
    }
}

// person (superclass)
// ↑
// student (inherits person)
// ↑
// examResult (inherits student)