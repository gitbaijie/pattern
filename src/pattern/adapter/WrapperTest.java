package pattern.adapter;

/**
 * ClassName:WrapperTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 14:46 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class WrapperTest {

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
    }

}
