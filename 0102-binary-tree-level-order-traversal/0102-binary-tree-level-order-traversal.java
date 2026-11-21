
import java.util.*;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> qq = new LinkedList<>();
        qq.offer(root);

        while (!qq.isEmpty()) {

            int size = qq.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = qq.poll();

                level.add(node.val);

                if (node.left != null) {
                    qq.offer(node.left);
                }

                if (node.right != null) {
                    qq.offer(node.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}
