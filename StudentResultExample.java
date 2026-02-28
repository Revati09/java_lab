// Student Class
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Test Class inheriting Student
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Sports Interface
interface Sports {
    int sMarks = 20;  // sports marks

    void set();
}

// Result Class
class Result extends Test implements Sports {
    int total;

    public void set() {
        total = sub1 + sub2 + sMarks;
    }

    void display() {
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

// Main Class
public class StudentResultExample {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 75);
        r.set();
        r.display();
    }
}