import Builder.DemoBuilder;
import Factory.Demo;
import Singleton.DemoSingleThread;

public class main {
    public static void main(String[] args) {
        DemoSingleThread.main();
        System.out.println("---------------------------------------------------------------------------------------");
        Demo.main();
        System.out.println("---------------------------------------------------------------------------------------");
        DemoBuilder.main();
    }
}
