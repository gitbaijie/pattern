package pattern.simplefactory;

/**
 * ClassName:SmsSender <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:26 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender");
    }
}
