package pattern.decorator;

/**
 * ClassName:Decorator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:04 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorate");
        source.method();
        System.out.println("after decorate");
    }
}
