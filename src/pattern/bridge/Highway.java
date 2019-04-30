package pattern.bridge;

/**
 * ClassName:Highway <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:16 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Highway extends Road {
    @Override
    public void run() {
        System.out.println("在高速公路跑");
        getCar().run();
    }
}
