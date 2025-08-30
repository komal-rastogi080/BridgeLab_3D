package Java_core.JavaMethods.Level3;

import java.util.Scanner;

public class Q9 {
    public static boolean isLeap(int y){
        if(y<1582) return false;
        return (y%400==0) || (y%4==0 && y%100!=0);
    }
    public static String monthName(int m){
        String[] names={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return names[m-1];
    }
    public static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y)) return 29;
        return d[m-1];
    }
    // Zeller's congruence (0=Sunday .. 6=Saturday) for Gregorian calendar
    public static int firstDayOfMonth(int m,int y){
        int q=1;
        int mm = (m<3)? m+12 : m;
        int yy = (m<3)? y-1 : y;
        int K = yy%100;
        int J = yy/100;
        int h = (q + (13*(mm+1))/5 + K + K/4 + J/4 + 5*J) % 7; // 0=Sat
        int day = (h+6)%7; // convert to 0=Sun
        return day;
    }
    public static void printCalendar(int m,int y){
        int first = firstDayOfMonth(m,y);
        int days = daysInMonth(m,y);
        System.out.println("    " + monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int d=1; d<=days; d++){
            System.out.printf("%3d ", d);
            if((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year (>=1582): ");
        int y=sc.nextInt();
        printCalendar(m,y);
    }
}
