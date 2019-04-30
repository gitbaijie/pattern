package pattern.simplefactory;

/**
 * ClassName:SenderFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:28 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class SenderFactory2 {

    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }

}
