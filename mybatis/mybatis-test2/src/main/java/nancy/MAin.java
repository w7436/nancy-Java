/**
 * @ClassName MAin
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/14 20:18
 * @Version 1.0
 **/
package nancy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class MAin {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return list;
        else{
            q.offer(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> l = new ArrayList<Integer>();
                for(int i = 0;i < size;i++) {
                    TreeNode node = q.poll();
                    l.add(node.val);
                    if(node.left != null) {
                        q.offer(node.left);
                    }
                    if(node.right != null){
                        q.offer(node.right);
                    }
                }
                list.add(l);
            }
            return list;
        }

    }
    public static TreeNode build(TreeNode root,int num){
        if(root == null) return new TreeNode(num);
        if(root.val > num) root.left = build(root.left,num);
        else root.right = build(root.right,num);
        return root;
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        TreeNode root = null;
        for(int i = 0;i < preorder.length;i++){
            root = build(root,preorder[i]);
        }
        return root;
    }
    public static void main(String[] args) {
       int[] nums={8,5,1,7,10,12};
       TreeNode node = bstFromPreorder(nums);
       List<List<Integer>> l = levelOrder(node);

    }

}