// import java.util.Scanner;
// class demo
// {
// public static void main(String args[])
// {
// Scanner s = new Scanner(System.in);
// System.out.println("Enter nos");
// int n = s.nextInt();
// if(n % 2 == 0)
// {
// System.out.println("No is even");
// }
// else
// {
// System.out.println("No is odd");
// }
// }
// }

// import java.util.Scanner;
// class demo
// {
// public static void main(String args[])
// {
// Scanner s = new Scanner (System.in);
// System.out.println("Enter three angles");
// int a = s.nextInt();
// int b = s.nextInt();
// int c = s.nextInt();
// if(a+b+c == 180)
// {
// System.out.print("Trinangle is formed");
// }
// else
// {
// System.out.println("Triangle is not formed");
// }
// }
// }

/*
 * import java.util.*;
 * class demo
 * {
 * public static void main(String arg[])
 * {
 * Scanner s = new Scanner (System.in);
 * System.out.println("Enter marks for 5 subjects ");
 * int a = s.nextInt();
 * int b = s.nextInt();
 * int c = s.nextInt();
 * int d = s.nextInt();
 * int e = s.nextInt();
 * if(a>=40 && b>=40 && c>=40 && d>=40 && e>=40 )
 * System.out.println("Student is pass");
 * else
 * System.out.println("Student is fail");
 * }
 * 
 * }
 */

/*
 * import java.util.*;
 * class demo
 * {
 * public static void main(String arg[])
 * {
 * Scanner s = new Scanner(System.in);
 * System.out.println("Enter a three digit no ");
 * int n = s.nextInt();
 * if(n>= 100 && n<=900)
 * {
 * int a = n%100/10;
 * int b = n%10;
 * int c = n/100;
 * int s1 = a+b+c;
 * System.out.println("Sum of three no is "+s1);
 * }
 * else
 * {
 * System.out.println("It is not three digit no")
 * }
 * }
 * }
 */

/*
 * import java.util.*;
 * 
 * class demo {
 * public static void main(String arg[])
 * {
 * Scanner s = new Scanner (System.in);
 * System.out.println("Enter marks for 5 subject");
 * int a = s.nextInt();
 * int b = s.nextInt();
 * int c = s.nextInt();
 * int d = s.nextInt();
 * int e = s.nextInt();
 * if(a>=40 && b>=40 && c>=40 &&d>=40 && e>=40)
 * {
 * System.out.println("Student is pass");
 * int s1 = a+b+c+d+e;
 * System.out.println("Sum is "+ s1);
 * double p = s1*100/500.0;
 * System.out.println("Percentage is "+p);
 * if(p>=60)
 * System.out.println("Student is fail ");
 * }
 * }
 * }
 */

// Ladder if
/*
 * import java.util.*;
 * class demo
 * {
 * public static void main(String args[])
 * {
 * Scanner s = new Scanner(System.in);
 * System.out.println("Enter a no");
 * int n = s.nextInt();
 * if(n>0)
 * System.out.println("Positive no");
 * else
 * if(n<0)
 * System.out.println("Negative no");
 * else
 * if(n == 0)
 * System.out.print("Zero");
 * }
 * }
 */

// While loop
// class demo
// {
// public static void main(String args[])
// {
// int i = 1;
// while(i<=20)
// {
// System.out.println(i);
// i++;
// }
// }
// }

// import java.util.Scanner;
// class demo{
// public static void main(String args[])
// {
// Scanner s = new Scanner(System.in);
// System.out.println("Enter no");
// int n = s.nextInt();
// int d,R = 0,x;
// x = n;
// while(n>0)
// {
// d = n%10;
// R = R*10+d;
// n = n/10;
// }
// if(x == R)
// System.out.println("Palindrome no");
// else
// System.out.println("Not palindrome so");
// }
// }
//
// Nested for
// class demo
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 1; i <= 4; i++)
// {
// for(j = 1; j <= 5; j++)
// System.out.print("*");
// System.out.println();
// }

// }
// }

// class demo
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 1; i <= 3; i++)
// {
// for(j = 1; j <= 9; j++)
// System.out.print(j);
// for(j = 9; j >=1; j--)
// System.out.print(j);
// System.out.println();
// }
// }

// }

// class demo
// {
// public static void main(String args[])
// {
// int i, j;
// for(i = 1; i <= 3; i++)
// {
// for(j = 9; j >= 0; j--)
// System.out.print(j);
// for(j = 1; j <= 9; j++)
// System.out.print(j);
// System.out.println();
// }
// }
// }

// class demo {
// public static void main(String args[]) {
// int i, j;
// for (i = 4; i <= 8; i++) {
// for (j = 1; j <= i; j++)
// System.out.print("*");
// System.out.println();
// }
// }

// }

// class test
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 4; i <= 8; i++)
// {
// for(j = 1; j <= i; j++)
// System.out.print(j);
// System.out.println();
// }
// }
// }

// class test{
// public static void main(String args[])
// {
// int i,j;
// for(i = 1; i <= 7; i++)
// {
// for(j = 1; j <= i; j++)
// System.out.print(" * ");
// System.out.println();
// }
// }
// }

// class test
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 5; i >= 1; i--)
// {
// for(j = 5; j >= 1; j--)
// System.out.print(" * ");
// System.out.println();
// }
// }
// }

// class test
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 5; i >= 1; i++)
// {
// for(j = 1; j <= i; j++)
// System.out.println(j);
// for(j = 5; j >-1; i--)
// System.out.print(" * ");
// System.out.println();
// }
// }
// }

// class demo
// {
// public static void main(String args[])
// {
// int i,j;
// for(i = 1; i <= 5; i++)
// {
// for(j = 5; j >= i; j--)
// System.out.print("* ");
// for(j = 1; j <= i; j++)
// System.out.print(j);
// System.out.println();
// }
// }
// }

// class test
// {
// public static void main(String args[])
// {
// int i,j,k;
// for(i = 1; i <= 7; i++)
// {
// for(k = 1; k <= 8-i; k++)
// System.out.print(" ");
// for(j = 1; j <= i; j++)
// System.out.print(" *");
// System.out.println();
// }
// }
// }

//do-while loop
//import java.util.*;
//class demo
//{
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int n;
//        do
//        {
//            System.out.println("Enter no");
//            n = s.nextInt();
//        }
//        while(n>0);
//    }
//}

//import java.util.Scanner;
//class demo
//{
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int n,sum = 0;
//        do
//        {
//            System.out.println("Enter no");
//            n = s.nextInt();
//            sum = sum + n;
//        }
//        while(n != 0);
//        System.out.println("Sum is "+sum);
//    }
//}

//import java.util.Scanner;
//class demo
//{
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int n,sum1 = 0,sum2 = 0;
//        do
//        {
//            System.out.println("Enter no");
//            n = s.nextInt();
//            if(n % 2 == 0)
//            sum1 = sum1 + n;
//            else
//            sum2 = sum2 + n;
//        }while(n != 0);
//        System.out.println("Sum of even no is "+ sum1);
//        System.out.println("Sum of odd no is "+sum2);
//    }
//}

//import javax.swing.*;
//class test
//{
//    public static void main(String args[])
//    {
//        String n1 = JOptionPane.showInputDialog("Enter a");
//        String n2 = JOptionPane.showInputDialog("Enter b");
//        int a = Integer.parseInt(n1);
//        int b = Integer.parseInt(n2);
//        int c = a + b;
//        System.out.println("The addition is " +c);
//    }
//}

//import javax.swing.*;

//import javax.swing.JOptionPane;
//class demo
//{
//    public static void main(String args[])
//    {
//        String s = JOptionPane.showInputDialog("Enter single digit");
//        int n = Integer.PprseInt();
//        Switch(n);
//        {
//            case 1: System.out.println("Monday");
//            break;
//            case 2: System.out.println("Tuesday");

//            case 3: System.out.println("Monday");
//            break;
//            case 4: System.out.println("Monday");
//            break;
//            case 5: System.out.println("Monday");
//            break;
//            case 6: System.out.println("Monday");
//            break;
//            case 7: System.out.println("Monday");
//            break;
//            default:System.out.println("Invalid day of weeks");
//        }
//    }
//}

//import java.util.*;
//class test{
//    public static void main(String arg[])
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter 2 nos");
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int x = a>b?a:b;
//        System.out.println(x + " is greatest");
//    }
//}

//class demo
//{
//    static void even()
//    {
//        for(int i = 2; i<= 50; i = i+2)
//        System.out.println(i);
//    }
//    public static void main(String args[])
//    {
//        even();
//    }
//}

//class demo
//{
//    static void draw()
//    {
//        for(int i = 1; i<= 20; i++)
//        System.out.print(" * ");
//    }
//    public static void main(String args[])
//    {
//        draw();
//    }
//}

//class demo
//{
//    static void draw(int n)
//    {
//        for(int i = 1; i <= n; i++)
//        System.out.print(" * ");
//        System.out.println();
//    }
//    public static void main(String arg[])
//    {
//        draw(8);
//        draw(7);
//    }
//}

//class demo
//{
//    static void draw(char c,int n)
//    {
//        for(int i = 1; i <= n; i++)
//        System.out.print(c + " ");
//        System.out.println();
//    }
//    public static void main(String arg[])
//    {
//        draw('#',10);
//        draw('&',7);
//    }
//}

//class demo
//{
//    static void square(int n)
//    {
//        int i = n * n;
//        return i;
//    }
//    public static void main(String arg[])
//    {
//        for(int j = 1; j <= 10; j++)
//        {
//            int i = square(i);
//            System.out.print(i + "\t" +j);
//            System.out.println();
//        }
//    }
//}

//class demo
//{
//    static int square(int n)
//    {
//        int s = n * n;
//        return s;
//    }
//    public static void main(String args[])
//    {
//        for(int i = 1; i<= n; i++)
//        sum = sum +square(i);
//    }
//    System.out.print("Sum is "+sum);
//}

//import java.util.Scanner;
//class test
//{
//    static int power(int a,int b)
//    {
//        int p = 1;
//        for(int i = 1; i<= b; i++)
//        p = p*a;
//        return p;
//    }
//    public static void main(String arg[])
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter no");
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int z = power(a, b);
//        System.out.println("Power is "+z);
//    }
//}

//import java.util.*;
//class demo
//{
//    static double fact(int a)
//    {
//        double f = 1;
//        for(int i = 1; i<= a; i++)
//        f = f*i;
//        return f; 
//    }
//    static int square(int n)
//    {
//        return n*n;
//    }
//    public static void main(String arg[])
//    {
//        Scanner s = new Scanner (System.in);
//        System.out.println("Enter no ");
//        int n = s.nextInt();
//        double sum = 0;
//        for(int i = 2; i<= n; i++)
//        {
//            sum = sum + square(i)/fact(i);
//        }
//        System.out.println("Sum of series " +sum);
//    }
//}

//import java.util.*;
//class demo
//{
//    static int power(int a, int b)
//    {
//        int p = 1; 
//        for(int i = 1; i <= b; i++)
//        p = p * a;
//        return p;
//    }
//    public static void main(String arg[])
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter no");
//        int n = s.nextInt();
//        for(int i = 1; i <= n; i++)
//        System.out.println(i + "\t"+power(i,2)+"\t"+power(i,3)+"\n");

//    }
//}

//import java.util.Scanner;

//class demo
//{
//    static int square(int n)
//    {
//        return n*n;
//    }
//    public static void main(String arg[])
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter no");
//        int sum = 0; 
//        int n = s.nextInt();
//        for(int i = 1; i <= n; i++)
//        {
//            sum = sum + square(i);
//        }
//        System.out.println("Sum of series "+sum);
//    }

//}

//Creating an object
//class rectangle
//{
//    int l,b;
//    void area()
//    {
//        int a = l * b;
//        System.out.println("Area of rectangle " + a);
//    }
//    void perimeter()
//    {
//        int p = 2 *(l + b);
//        System.out.println("Perimeter of rectangle " + p);
//    }
//}
//class demo
//{
//    public static void main(String arg[])
//    {
//        rectangle a;
//        a = new rectangle();
//        a.l = 5; 
//        a.b = 6; 
//        a.area();
//        a.perimeter();
//    }
//}

//class rectangle {
//    private int l, b;

//    public void area() {
//        int a = l * b;
//        System.out.println("Area is " + a);
//    }

//    public void perimeter() {
//        int p = 2 * (l + b);
//        System.out.println("Perimeter is " + p);
//    }

//}

//    public void setdata(int x, int y) {
//        l = x;
//        b = y;
//    }

//class demo
//{
//    public static void main(String args[])
//    {
    
//     rectangle a = new rectangle();
//    a.setdata(6, 8);
//    a.area();
//    a.perimeter();
//    }
//}

//class Rectangle {
//    private int l, b;
    
//    public void area() {
//        int a = l * b;
//        System.out.println("Area is " + a);
//    }
    
//    public void perimeter() {
//        int p = 2 * (l + b);
//        System.out.println("Perimeter is " + p);
//    }
    
//    public void setdata(int x, int y) {
//        l = x;
//        b = y;
//    }
//}

//class Demo {
//    public static void main(String args[]) {
//        Rectangle a = new Rectangle();
//        a.setdata(6, 8);
//        a.area();
//        a.perimeter();
//    }
//}
//Create an objecct
//class circle{
//    private int L,B,H;
//    public void setdata(int l,int b,int h){
//        L = l;
//        B = b;
//        H = h;
//    }
//    public void volume(){
//        int v = L*B*H;
//        System.out.println("Volume is "+v);
//    }
//    public void Surface(){
//        int s=2*(L*B+B*H+L*H);
//        System.out.println("Surface area is "+s);
//    }
//}
//class demo{
//    public static void main(String args[]){
//        circle a;
//        a = new circle();
//        a.setdata(2,3,4);
//        a.volume();
//        a.Surface();
//    }
//}

//class set{
//    private int N1,N2,N3;
//    public void setdata(int a,int b,int c)
//    {
//        N1 = a;
//        N2 = b;
//        N3 = c;
//    }
//    public void sum(){
//        int s = N1 + N2 + N3;
//        System.out.println("Sum is "+s);
//    }
//    public void mean(){
//        double m = (N1+N2+N3)/3.0;
//        System.out.println("Mean is "+m);
//    }
//}
//class Demo{
//    public static void main(String args[]){
//        set a,b;
//        a = new set();
//        b = new set();
//        a.setdata(2, 4, 5);
//        b.setdata(6, 7, 8);
//        a.sum();
//        b.sum();
//        a.mean();
//        b.mean();
//    }
//}

//class worker{
//    private String name;
//    private int wages,wdays;
//    public void setdata(String n, int w, int wd)
//    {
//        name = n;
//        wages = w; 
//        wdays = wd;
//    }
//    public void showdata(){
//        System.out.println("Name is "+name);
//        System.out.println("Wages is"+wages);
//        System.out.println("Weak days"+wdays);
//    }
//    public void payment()
//    {
//        int p = wages * wdays;
//        System.out.println("Payment is "+p);
//    }
//}
//class demo{
//    public static void main(String arg[]){
//        worker a = new worker();
//        a.setdata("Error", 20000, 28);
//        a.payment();
//    }
//}

//class rectangle{
//    private int L,B;
//    public void setdimension(int l, int b){
//        L = l;
//        B = b;
//    }
//    public int area(){
//        int a = L * B;
//        return a;
//    }
//}
//class demo{
//    public static void main(String args[]){
//        rectangle a = new rectangle();
//        rectangle b = new rectangle();
//        a.setdimension(3, 4);
//        b.setdimension(7, 8);
//        System.out.println("Area of A " + a.area());
//        System.out.println("Area of B" + b.area());
//        int x = a.area() + b.area();
//        System.out.println("Total area is "+ x);
//    }
//}

//class worker{
//    private int w,wd;
//    public void setdata(int a,int b){
//        w = a;
//        wd = b;
//    }
//    public int payment(){
//        int p = w * wd;
//        return p;
//    }
//}
//class demo{
//    public static void main(String[] args) {
//        worker a = new worker();
//        worker b = new worker();
//        worker c = new worker();
//        a.setdata(700, 8);
//        b.setdata(499, 9);
//        c.setdata(300, 5);
//        System.out.println("Payment of A "+ a.payment());
//        System.out.println("Payment of B "+ b.payment());
//        System.out.println("Payment of C "+ c.payment());
//        int t = a.payment() + b.payment() + c.payment();
//        System.out.println("Total payment is "+ t);
//    }
//}

//class box{
//    private int L,B,H;
//    public void setdimension(int a, int b,int c){
//        L = a;
//        B = b;
//        H = c;
//    }
//    public void setdimension(int x){
//        L = x;
//        B = x;
//        H = x;
//    }
//    public void volume(){
//        double v = L*B*H;
//        System.out.println("Volume is "+v);
//    }
//}
//class demo{
//    public static void main(String[] args) {
//        box a = new box();
//        box b = new box();
//        a.setdimension(5);
//        b.setdimension(5, 8, 9);
//        a.volume();
//        b.volume();
//    }
//}

//Constructor
//class info{
//    info(){
//        System.err.println("Object is created ");
//    }
//}
//class demo{
//    public static void main(String[] args) {
//        info a = new info();
//        info b = new info();
//    }
//}

//class worker{
//    private String name;
//    private int wages,wdays;
//    worker(String n, int w,int wd){
//        name = n;
//        wages = w;
//        wdays = wd;
//    }
//    public void showdata(){
//        System.err.println("Name is "+ name);
//        System.err.println("Wages is " + wages);
//        System.err.println("Weak days "+wdays);
//    }
//    public void payment(){
//        int p = wages * wdays;
//        System.out.println("Payment is "+p);
//    }
//}
//class demo{
//    public static void main(String[] args) {
//        worker a = new worker("Ultron", 600, 4);
//        a.showdata();
//        a.payment();
//}
//}



























