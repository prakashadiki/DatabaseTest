package part1;

public class InterfaceTest2 implements InterfaceTest {

    @Override
    public void demo() {
        System.out.println("Test Demo");
    }

    public static void main(String[] args) {
        InterfaceTest2 interfaceTest2 = new InterfaceTest2();

        interfaceTest2.demo();

    }
}
