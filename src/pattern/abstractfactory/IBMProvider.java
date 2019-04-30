package pattern.abstractfactory;

import pattern.abstractfactory.ibm.IBMKeyboard;
import pattern.abstractfactory.ibm.IBMMouse;

/**
 * ClassName:IBMProvider <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:16 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class IBMProvider implements Provider {

    @Override
    public Mouse getMouse() {
        return new IBMMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new IBMKeyboard();
    }
}
