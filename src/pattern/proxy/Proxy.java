package pattern.proxy;

/**
 * ClassName:Proxy <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:20 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Proxy implements Sourceable {

    Sourceable source;

    public Proxy(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }

}
