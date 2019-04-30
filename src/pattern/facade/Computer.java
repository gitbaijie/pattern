package pattern.facade;

/**
 * ClassName:Computer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 15:36 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Computer {

    CPU cpu;

    Disk disk;

    Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup() {
        System.out.println("computer start up");
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown() {
        System.out.println("computer shut down");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }

}
