class intTree{
   private int parent;
   private intTree left;
   private intTree right;
   public intTree(int par, intTree lft, intTree rght)
   {
      parent = par;
      left = lft;
      right = rght; 
   }
   public int getValue()
   {
      return parent;
   }
   public int getLeftValue()
   {
      return left.getValue();
   }
   public int getRightValue()
   {
      return right.getValue(); 
   }
   public String preOrder()
   {
      String str = "";
      
      return str;
   }
}