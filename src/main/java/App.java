public class App {
    public static void main(String args[]) {
        GradeConverter converter = new GradeConverter();
        System.out.println("Hello world!");

        for(int i=0; i<=100; i++) {
            System.out.println(i + ";" + converter.convert(i));
        }
    }
}
