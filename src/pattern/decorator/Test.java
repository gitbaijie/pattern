package pattern.decorator;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:06 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Source());
        decorator.method();
    }
}
