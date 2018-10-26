
public class Driver {
      public static void main (String[]args) {
    	  SuperArray a=new SuperArray();
    	  for(int i=0;i<9;i++) {
    		  a.add("aba");
    	  }
    	  //first phase
    	 System.out.println("should print 9 abas");
    	 System.out.println(a);
    	 System.out.println("shoud also print 9 abas plus one null");
    	 System.out.println(a.toStringDebug());
    	 System.out.println("should print one aba");
    	 System.out.println(a.get(7));
    	 a.set(6,"suraj");
    	 System.out.println("should print suraj");
    	 System.out.println(a.get(6));

    	  //second phase
    	  a.add("new");
    	  System.out.println("checks to see if the resize method works,should add the element new and test to the list");
    	  a.add("test");
    	  System.out.println(a);
    	  System.out.println("should print the list as seen above plus nine nulls");
    	  System.out.println(a.toStringDebug());
    	  System.out.println("should print true");
    	  System.out.println(a.contains("new"));
    	  System.out.println("should print false");
    	  System.out.println(a.contains("kill"));
    	  //time to test the overloaded add method
    	  a.add(9,"goku");
    	  System.out.println("should make goku to be the 9th element and push others to the right");
    	  System.out.println(a);
    	  System.out.println("should return 9");
    	  System.out.println(a.indexOf("goku"));
    	  System.out.println("should return -1");
    	  System.out.println(a.indexOf("naruto"));
    	  a.add(2,"goku");
    	  System.out.println("should print 10");
    	  System.out.println(a.lastIndexOf("goku"));
    	  System.out.println("should print -1");
    	  System.out.println(a.lastIndexOf("gok"));
        System.out.println(a);
    	  System.out.println("should print goku");
    	  System.out.println(a.remove(10));
    	  System.out.println("should move other elements to the left");
    	  System.out.println(a);
    	  System.out.println("should return false");
    	  System.out.println(a.remove("gok"));
    	  a.add("goku");
        System.out.println(a);
    	  a.remove("goku");
    	  System.out.println("should remove the first instance of goku and shift all the elements to the left");
    	  System.out.println(a);

      }
}
