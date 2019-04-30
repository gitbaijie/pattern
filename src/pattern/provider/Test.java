package pattern.provider;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-01-27 14:28 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(f.format(getTimeout(5)));
    }

    /**
     * 生成超时时间对象
     */
    private static Date getTimeout(int timeout) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, -timeout);// 时间减多少分钟
        Date remindDate = null;
        try {
            remindDate = f.parse(f.format(cal.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return remindDate;
    }

    private final static SimpleDateFormat f = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");

}
