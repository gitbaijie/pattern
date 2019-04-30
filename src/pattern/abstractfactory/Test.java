package pattern.abstractfactory;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 11:18 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new MicrosoftProvider();
        Mouse mouse = provider.getMouse();
        System.out.println(mouse.move());
        Keyboard keyboard = provider.getKeyboard();
        System.out.println(keyboard.print());
    }

}
