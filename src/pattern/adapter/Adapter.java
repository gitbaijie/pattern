package pattern.adapter;

/**
 * ClassName:Adapter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 14:39 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("adapter method2");
    }
}
