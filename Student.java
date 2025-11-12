import java.util.*;  

public class Student {  
    private String usn, name, branch;  
    private long phone;  

    Student(String usn, String name, String branch, long phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    void displayStudent() {  
        System.out.println("********");  
        System.out.println("USN= " + usn);  
        System.out.println("NAME= " + name);  
        System.out.println("BRANCH= " + branch);  
        System.out.println("PHONE NUMBER= " + phone);  
        System.out.println("********");  
    }  

    public static void main(String args[]) { 
        Scanner ip = new Scanner(System.in);  
        System.out.println("Enter the number of students");  
        int n = ip.nextInt();  
        ip.nextLine(); // consume newline  

        Student[] st = new Student[n];  

        for(int j = 0; j < n; j++) {  
            System.out.println("Enter the Usn, Name, Branch, Phone Number");  
            String usn = ip.next();  
            String name = ip.next();  
            String branch = ip.next();  
            long phone = ip.nextLong();  
            st[j] = new Student(usn, name, branch, phone);  
        }  

        for(int m = 0; m < n; m++) {  
            System.out.format("Student %d details are\n", m + 1);  
            st[m].displayStudent();  
        }  

        ip.close();  
    } 
}
