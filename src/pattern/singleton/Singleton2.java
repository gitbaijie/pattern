package pattern.singleton;

/**
 * ClassName:Singleton2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:52 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Singleton2 {

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return SingletonFactory.instance;
    }

    private static class SingletonFactory {
        private static Singleton2 instance = new Singleton2();
    }

}
