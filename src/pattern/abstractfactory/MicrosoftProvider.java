package pattern.abstractfactory;

import pattern.abstractfactory.microsoft.MicrosoftKeyboard;
import pattern.abstractfactory.microsoft.MicrosoftMouse;

/**
 * ClassName:MicrosoftProvider <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:17 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class MicrosoftProvider implements Provider {
    @Override
    public Mouse getMouse() {
        return new MicrosoftMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new MicrosoftKeyboard();
    }
}
