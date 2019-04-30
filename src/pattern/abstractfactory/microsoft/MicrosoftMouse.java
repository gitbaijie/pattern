package pattern.abstractfactory.microsoft;

import pattern.abstractfactory.Mouse;

/**
 * ClassName:IBMMouse <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:12 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class MicrosoftMouse implements Mouse {
    @Override
    public String move() {
        return "It's microsort mouse move";
    }
}
