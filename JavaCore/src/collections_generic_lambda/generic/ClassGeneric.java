package collections_generic_lambda.generic;

public class ClassGeneric<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        ClassGeneric<Integer> integerClassGeneric = new ClassGeneric<>();
        ClassGeneric<String> stringClassGeneric = new ClassGeneric<>();

        integerClassGeneric.set(10);
        stringClassGeneric.set("Hello");

        System.out.println("Integer Value: " + integerClassGeneric.get());
        System.out.println("String Value: " + stringClassGeneric.get());
    }
}
