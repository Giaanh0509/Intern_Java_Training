package exception.propagate;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        ExceptionPropagationExample example = new ExceptionPropagationExample();
        try {
            example.method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void method1() throws Exception {
        method2();
    }

    public void method2() throws Exception {
        method3();
    }

    public void method3() throws Exception {
        method4();
    }

    public void method4() throws Exception {
        throw new Exception("An exception occurred in method4");
    }
}

