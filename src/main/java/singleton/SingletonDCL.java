package singleton;
// DCL(double checked locking)
public class SingletonDCL {

    private static SingletonDCL singletonDCL;

    // 이러면 이미 SingeltonDCL이 생성된 경우는 lock이 걸리지 않음
    public static SingletonDCL getInstance() {
        if(singletonDCL == null) {
            synchronized (SingletonDCL.class) {
                singletonDCL = new SingletonDCL();
            }
        }
        return singletonDCL;
    }


}
