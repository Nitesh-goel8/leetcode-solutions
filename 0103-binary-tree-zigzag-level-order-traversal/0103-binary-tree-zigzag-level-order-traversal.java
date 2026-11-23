
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); // 1
        if (root == null) return ans;                 // 2

        Queue<TreeNode> q = new LinkedList<>();       // 3
        q.add(root);                                  // 4

        int flag = 0;                                 // 5

        while (!q.isEmpty()) {                        // 6
            int size = q.size();                      // 7
            List<Integer> level = new ArrayList<>();  // 8

            for (int i = 0; i < size; i++) {          // 9
                TreeNode node = q.poll();             // 10

                if (flag == 0)                        // 11
                    level.add(node.val);              // 12
                else
                    level.add(0, node.val);           // 13

                if (node.left != null) q.add(node.left);   // 14
                if (node.right != null) q.add(node.right); // 15
            }

            ans.add(level);                           // 16
            flag = 1 - flag;                          // 17
        }

        return ans;                                   // 18
    }
}
