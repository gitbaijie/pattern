package pattern.factory;

/**
 * ClassName:MailSender <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:24 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is mailsender");
    }
}
