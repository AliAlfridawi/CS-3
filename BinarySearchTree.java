public class BinarySearchTree  
{
   private TreeNode root;
   private boolean rootDone = true;
   private int left=0;
   private int right=0;
   private String toString="";
   public BinarySearchTree()
   {
   root = null;
   }
   public void add(Comparable val)
{
root = add(val, root);
}
private TreeNode add(Comparable val, TreeNode tree)
{
   if (tree == null)
     tree = new TreeNode(val, null, null);
   else if (val.compareTo(tree.getValue()) < 0 )
     tree.setLeft(add(val, tree.getLeft()));
   else if (val.compareTo(tree.getValue()) > 0 )
     tree.setRight(add(val, tree.getRight()));
   return tree;
}


   public void inOrder()
   {
   inOrder(root);
   System.out.println("\n\n");
   }
   private void inOrder(TreeNode tree)
   {
      if (tree != null){
         inOrder(tree.getLeft());
         System.out.print(tree.getValue() + " ");
         inOrder(tree.getRight());
   }
   }
    public void preOrder()
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
   } 
   public void postOrder()
   {
      postOrder(root);
      System.out.println("\n\n");
   }
   private void postOrder(TreeNode tree)
   {
      if(tree != null)
      {
         postOrder(tree.getLeft());
         postOrder(tree.getRight());
         System.out.print(tree.getValue() + " ");
      }
   }
   public void revOrder()
   {
      revOrder(root);
      System.out.println("\n\n");
   }
   private void revOrder(TreeNode tree)
   {
      if(tree != null)
      {
         revOrder(tree.getRight());
         System.out.print(tree.getValue() + " ");
         revOrder(tree.getLeft());
         
      }
   }
   //add preOrder, postOrder, and revOrder 
   public int getNumLevels()
   {
      return getNumLevels(root);
   }
   private int getNumLevels(TreeNode tree)
   {
      if(tree==null)
         return 0;
      else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
            return 1+getNumLevels(tree.getLeft());
      else
         return 1+getNumLevels(tree.getRight());
   }
   public int getNumLeaves()
   {
      return getNumLeaves(root);
   }
   private int getNumLeaves(TreeNode tree)
   {
      if(tree==null)
      {
         return 0;
      }
      else if( tree.getRight() ==null && tree.getLeft()==null)
      {
         return 1+getNumLeaves(tree.getLeft())+getNumLeaves(tree.getRight());
      }
      else
      {
         return 0+getNumLeaves(tree.getLeft())+getNumLeaves(tree.getRight());
      }
         
   }
   public int getWidth()
   {
      return getRHeight(root)+getLHeight(root)-1;
   }
   //bruh
   private int getWidth(TreeNode tree)
   {
      
      if(tree==null)
      {
         return 0; 
      }
      else
      {
        if(tree.getRight()!=null)
        {
         return 1+getWidth(tree.getRight());
        }
        else
        {
         return 1+getWidth(tree.getLeft());
        }
        
      }  
   }
   public int getNumNodes()
   {
      return getNumNodes(root);
   }
   private int getNumNodes(TreeNode tree)
   {
      if(tree==null)
      {
         return 0;
      }
      else
      {
         return 1+getNumNodes(tree.getLeft())+getNumNodes(tree.getRight());
      }
   }
   public int getHeight()
   {
      return getHeight(root);
   }
   private int getHeight(TreeNode tree)
   {
     if((tree==null))
      {
         return 0; 
      }
     else if(rootDone)
      {
         rootDone=false;
         return 0+getHeight(tree.getLeft());
      }
      else
      {
         if(getHeight(tree.getLeft())>getHeight(tree.getRight()))
         {
            return 1+getHeight(tree.getLeft());
         }
         else
         {
            return 1+getNumLevels(tree.getRight());
         }
      }
   }
   private int getLHeight(TreeNode tree)
   {
     if((tree==null))
      {
         return 0; 
      }
     else if(rootDone)
      {
         rootDone=false;
         return 1+getHeight(tree.getLeft());
      }
      else
      {
         if(getHeight(tree.getLeft())>getHeight(tree.getRight()))
         {
            return 1+getHeight(tree.getLeft());
         }
         else
         {
            return 1+getNumLevels(tree.getRight());
         }
      }
   }
   private int getRHeight(TreeNode tree)
   {
     if((tree==null))
      {
         return 0; 
      }
     else if(rootDone)
      {
         rootDone=false;
         return 1+getHeight(tree.getRight());
      }
      else
      {
         if(getHeight(tree.getLeft())>getHeight(tree.getRight()))
         {
            return 1+getHeight(tree.getLeft());
         }
         else
         {
            return 1+getNumLevels(tree.getRight());
         }
      }
   }
   public boolean search(Comparable val)
   {
      return search(val,root);
   }
   private boolean search(Comparable val, TreeNode tree)
      {
         if(tree != null)
      {
         int dirTest = val.compareTo(tree.getValue());
         if(dirTest == 0 )
         return true;
         else if (dirTest < 0)
         return search(val, tree.getLeft());
         else if (dirTest > 0)
         return search(val, tree.getRight());
      }
         return false;
      }

   public String toString()
   {
      return "";
   }
   private String toString(TreeNode tree)
   {
      return "";
   }
   
}