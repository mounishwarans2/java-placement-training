class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right= null;
    }
}
public class BinaryTree{
    public static void main(String[] args){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        System.out.println("root:"+ root.data);
        System.out.println("left child"+ root.left);
        System.out.println("right child "+ root.right.data);
        System.out.println("left sub tree child"+ root.left.left.data);
        System.out.println("right sub tree child"+ root.left.right.data);
    }
}
