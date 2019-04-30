package pattern.factory;

/**
 * ClassName:SendMailFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:43 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
