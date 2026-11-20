
class Solution {
    List<Integer> ll = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ll;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }

        ll.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}