//Given a binary tree, print the elements in the anti-clockwise direction.


public class ReverseBinaryTree{

  static class Node{


  Node left;
  Node right;
  int data;
  
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}

static int hight(Node root){
  if(root== null){
    return 0;
  }
  int lhight=hight(root.left);
  int rhight=hight(root.right);

  return(Math.max(lhight+1, rhight +1));

}

static void leftToRight(Node root, int level){
  if(root == null){
    return;
  }
  if(level==1){
    System.out.println(root.data+" ");
  }else if(level>1){
    leftToRight(root.left,level-1);
    leftToRight(root.right,level-1);
  }
}


static void rightToLeft(Node root, int level){
  if(root == null){
    return;
  }
  if(level==1){
    System.out.println(root.data+" ");
  }else if(level>1){
    rightToLeft(root.right,level-1);
    rightToLeft(root.left,level-1);
  }
}

static void antiClockWiseSpiral(Node root){
      int i=1;
      int j=hight(root);

      int flag=0;
      while(i<=j){
        if(flag==0){
          rightToLeft(root, i);
          flag =1;
          i++;
        }
        else{
          leftToRight(root, j);
          flag=0;
          j--;
        }
      }
}


  public static void main(String[] args){
    Node root=new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(7);
    root.right.left = new Node(6);
    
    antiClockWiseSpiral(root); 

  }
}