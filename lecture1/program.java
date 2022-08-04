package lecture1;
public class program {
    public static void main(String[] args) {
        System.out.println("hi java!");
        test_method();
    }
    
    public static void test_method() {
        int i = 123;
        System.out.println(Integer.MIN_VALUE); // обертка Integer
        System.out.println(Integer.MAX_VALUE); // обертка Integer
    }
}
