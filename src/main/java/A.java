import java.util.*;
public class A {
    public static void main(String[] args) {
        String name="a";
        System.out.println("Hello! I'm " + name);
        System.out.println("What can I do for you?");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        List<String> li= new ArrayList<>();
        while(!s.equals("bye")){
            if(!s.equals("list")){
                li.add(s);
                System.out.println("added: " + s);
            }
            else{
                int i=1;
                for(String str : li){
                    String no=Integer.toString(i);
                    System.out.println(no+". "+str);
                    i++;
                }
            }
            sc= new Scanner(System.in);
            s=sc.nextLine();
        }
        System.out.println("Bye. Hope to see you again soon!");
    }
}
