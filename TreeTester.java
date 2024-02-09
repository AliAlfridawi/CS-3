public class TreeTester
{
   public static void main(String[] args)
   {
      BinarySearchTree tree = new BinarySearchTree();
      tree.add(90);
      tree.add(80);
      tree.add(70);
      tree.add(85);
      tree.add(100);
      tree.add(98);
      tree.add(120);
      System.out.print(tree.getWidth());
      

   }
}

/*   public void preOrder()
   {
     preOrder(root);
      System.out.println("\n\n");
   }
   private void preOrder(TreeNode tree)
   {
      if(tree != null)
      {
         System.out.print(tree.getValue() + " ");
         preOrder(tree.getLeft());
         preOrder(tree.getRight());
       }
   }  */
