package Arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
public static void main(String[] args) {
	 
	List list = new ArrayList();

	list.add(20);
	list.add("Hello World");
	list.add(false);
	list.add(true);
	list.add(10);
	list.add("Project");
	list.add(20);
	
	System.out.println("ArrayList Elements:"+ list);
	System.out.println("Size of list:" + list.size());
	System.out.println(list.indexOf(20));
	list.remove("Hello World");
    System.out.println("ArrayList after removal:" + list);
}
}
	
	
	
	