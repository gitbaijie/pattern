package pattern.flyweight;

import sun.tools.tree.SynchronizedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * ClassName:ConnectionPool <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 17:06 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class ConnectionPool {

    private String url;

    private String username = "";

    private String password = "";

    private String driverName;

    private Vector<Connection> pool;

    private int poolSize = 50;

    public ConnectionPool() {
        try {
            Class.forName(driverName);
            Connection conn = null;
            pool = new Vector<Connection>(poolSize);
            for (int i = 0; i < poolSize; i++) {
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void release(Connection conn) {
        pool.add(conn);
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }

}
