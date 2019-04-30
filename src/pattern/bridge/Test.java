package pattern.bridge;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:22 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Road road = new Highway();
        Car car = new Bus();
        road.setCar(car);
        road.run();
    }

}
