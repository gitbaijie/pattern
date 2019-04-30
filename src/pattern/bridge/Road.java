package pattern.bridge;

/**
 * ClassName:Road <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:14 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public abstract class Road {

    Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract void run();

}
