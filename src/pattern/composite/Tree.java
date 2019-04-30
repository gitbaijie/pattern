package pattern.composite;

/**
 * ClassName:Tree <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:47 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class Tree {

    private TreeNode root;

    public Tree(String name) {
        root.setName(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("根");
        TreeNode n1 = new TreeNode("A");
        TreeNode n2 = new TreeNode("B");
        n1.add(n2);
        tree.root.add(n1);
    }

}
