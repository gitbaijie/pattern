package pattern.abstractfactory.ibm;

import pattern.abstractfactory.Keyboard;

/**
 * ClassName:IBMKeyboard <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:09 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class IBMKeyboard implements Keyboard {

    @Override
    public String print() {
        return "It's ibm keyboard print";
    }

}
