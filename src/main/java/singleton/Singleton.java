package singleton;

public class Singleton {

    private static Singleton singleton;

    //이와 같은 방식은 multi thread에서는 문제가 생길 수 있다.
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
