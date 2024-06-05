public class oop_1 {
    private int privateField;
    protected int protectedField;
    public int publicField;

    public static void main(String[] args) {
        oop_1 example = new oop_1();

        // Accessing fields
        example.privateField = 10;
        example.protectedField = 20;
        example.publicField = 30;

        example.printValues();
    }

    public void printValues() {
        System.out.println("Private Field: " + privateField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Public Field: " + publicField);
    }
}
