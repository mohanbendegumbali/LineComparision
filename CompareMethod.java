import java.util.*;
public class CompareMethod {
    public static void main(String[] args) {


    System.out.println("enter the first co-ordinate of point 1 of Line 1");
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    System.out.println("enter the second co-ordinate of point 1 of Line 1");
    int y1=sc.nextInt();
    System.out.println("enter the first co-ordinate of point 2 of Line 1");
    int x2=sc.nextInt();
    System.out.println("enter the second co-ordinate of point 2 of Line 1");
    int y2=sc.nextInt();
        System.out.println("enter x3 ");
        int x3 = sc.nextInt();
        System.out.println("enter y3 ");
        int y3 = sc.nextInt();
    System.out.println("line 1 Co-ordinates");
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
    System.out.println("length of the line 1 is "+length1);


    double res=length1.compareTo(length2);

    if(res>0)
    {
        System.out.println("line 1 is longer than line 2");
    } else if (res<0) {
        System.out.println("line 1 is smaller than line 2");
    }else{
        System.out.println("line 1 and line 2 are equal in length");
    }
}
}

