import java.util.*;
public class A {
    public static void main(String[] args) {
        String name="a";
        System.out.println("Hello! I'm " + name);
        System.out.println("What can I do for you?");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        while(!s.equals("bye")){
            System.out.println(s);
            sc= new Scanner(System.in);
            s=sc.nextLine();
        }
        System.out.println("Bye. Hope to see you again soon!");
    }
}
