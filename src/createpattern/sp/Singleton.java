package createpattern.sp;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }
}
