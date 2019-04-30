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
public class SenderFactory {

    public static Sender produce(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        } else if (type.equals("sms")) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }

}
