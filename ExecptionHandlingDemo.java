package dailypractice;

class Parent {
    void method1() throws Exception {
        // Some code that may throw an exception
    }
}

class Child1 extends Parent {
    @Override
    void method1() throws IOException {
        // Override the method and handle IOException
        try {
            // Some code that may cause an IOException
        } catch (IOException e) {
            System.out.println("Caught IOException in Child1");
        }
    }
}

class Child2 extends Child1 {
    @Override
    void method1() throws FileNotFoundException {
        // Override the method and handle FileNotFoundException
        try {
            // Some code that may cause a FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException in Child2");
        }
    }
}

        

public class ExecptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
            Parent obj1 = new Child1();
            obj1.method1();

            Parent obj2 = new Child2();
            obj2.method1();
        } catch (Exception e) {
            System.out.println("Caught Exception in main");
        }
    }

	}

}
