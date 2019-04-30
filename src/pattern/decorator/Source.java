package pattern.decorator;

/**
 * ClassName:Source <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:03 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("source method");
    }
}
