package singleton;

public class SingletonTest {


    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();
        System.out.println(singletonA == singletonB);

        SingletonSync singletonSyncA = SingletonSync.getInstance();
        SingletonSync singletonSyncB = SingletonSync.getInstance();
        System.out.println(singletonSyncA == singletonSyncB);

        SingletonDCL singletonDCLA = SingletonDCL.getInstance();
        SingletonDCL singletonDCLB = SingletonDCL.getInstance();
        System.out.println(singletonDCLA == singletonDCLB);
    }

}
