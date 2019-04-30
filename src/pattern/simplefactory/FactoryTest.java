package pattern.simplefactory;

/**
 * ClassName:FactoryTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 10:31 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SenderFactory.produce("mail");
        sender.send();
    }

}
