package createpattern.sp;

/**
 * 单例模式（Singleton Pattern）
 */
public class SingletonPattern {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3);
    }
}
