import java.util.*;
 class ArraylistDemo {

    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add("NULL");
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"M");
        a.add("N");
        System.out.println(a);
    }
}