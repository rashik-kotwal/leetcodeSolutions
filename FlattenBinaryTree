        1
        / \
       2   5
      / \   \
     3   4   6
     
     
     OutPut:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6

Important problem : My solution below ~63% percentile
---------------------------------------------------------------

class Solution {
    static TreeNode ans;

    public static TreeNode generate(TreeNode root)
    {
        if(root.left==null && root.right==null)         //leaf
            return root;

        TreeNode save = root.right;
        if(root.left!=null && save!=null)
        {
            root.right = generate(root.left);
            root.left=null;

            //traverse to the far right of the subtree
            TreeNode temp = root.right;
            while(true)
            {
                if(temp.right==null)
                {
                    temp.right = generate(save);
                    break;
                }
                temp=temp.right;
            }
        }
        else if(root.left==null && save!=null)
        {
            root.right = generate(save);
        }
        else
        {
            root.right = generate(root.left);
            root.left=null;
        }


        return root;
    }

    public static void flatten(TreeNode root) {
        //traverse in preorder fashion and assign calling node's right to the visited element

        if(root==null)
            return ;

        ans = generate(root);
    }
}
