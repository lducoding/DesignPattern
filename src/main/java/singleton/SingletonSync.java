package singleton;

public class SingletonSync {

    private static SingletonSync singletonSync;

    // synchronized를 사용하면 multithread 문제는 해결이 가능하지만 overhead가 걸릴 수 있다.
    public static synchronized SingletonSync getInstance() {
        if(singletonSync == null) {
            singletonSync = new SingletonSync();
        }
        return singletonSync;
    }

}
