package pattern.singleton;

/**
 * ClassName:Singleton <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:33 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Singleton {

    private Singleton instance = null;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
