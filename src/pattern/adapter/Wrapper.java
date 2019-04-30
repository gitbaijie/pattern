package pattern.adapter;

/**
 * ClassName:Wrapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 14:44 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("wrapper method2");
    }
}
