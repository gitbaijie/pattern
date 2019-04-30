package pattern.bridge;

/**
 * ClassName:Bus <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:21 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Bus implements Car {
    @Override
    public void run() {
        System.out.println("公交车在跑");
    }
}
