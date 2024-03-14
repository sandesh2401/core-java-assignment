import java.util.*;
class LeapYear {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    /*
    if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
        System.out.println("Leap Year");
    }
    else {
        System.out.println("Not Leap Year");   
    } */

    int r;
    r = ((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0) ? 1 : 0;

    switch(r) {
        case 1 : System.out.println("Leap year");
        break;

        case 0 : System.out.println(" not Leap year");
        break;

    }

    }
}