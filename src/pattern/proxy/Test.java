package pattern.proxy;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:21 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Sourceable proxy = new Proxy(new Source());
        proxy.method();
    }

}
