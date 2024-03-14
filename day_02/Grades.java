import java.util.*;
class Grades {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    sc.close();

    if(m >= 91 && m <= 100) {
        System.out.println("Grade A");
    }
    else if(m >= 81 && m <= 90) {
    System.out.println("Grade B");
    }
    else if(m >= 61 && m <= 80) {
        System.out.println("Grade C");
    }
    else {
        System.out.println("Grade D");  
    }

    }
    

    
}
