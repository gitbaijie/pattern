package pattern.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ClassName:TreeNode <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON. <br/>
 * Date:     2019-04-30 16:44 <br/>
 *
 * @author jie.bai
 * @see
 * @since JDK 1.8
 */
public class TreeNode {

    private String name;

    public TreeNode(String name) {
        this.name = name;
    }

    private TreeNode parent;

    private Vector<TreeNode> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node) {
        children.add(node);
    }

    public void remove(TreeNode node) {
        children.remove(node);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

}
