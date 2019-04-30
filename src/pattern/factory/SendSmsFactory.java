package pattern.factory;

/**
 * ClassName:SendSmsFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:40 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
