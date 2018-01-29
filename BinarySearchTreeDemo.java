class BinarySearchTreeDemo{
    public static void main(String[] args){
        BinarySearchTree b = new BinarySearchTree(5);
        Node n = new Node(7);
        b.insert(n,b.root);
        Node n1 = new Node(9);
        b.insert(n1,b.root);
        Node n2 = new Node(4);
        b.insert(n2,b.root);
        Node n3 = new Node(11);
        b.insert(n3,b.root);
        Node n4 = new Node(10);
        b.insert(n4,b.root);
        Node n5 = new Node(6);
        b.insert(n5,b.root);
        b.inOrderWalk();
        b.preOrderWalk();
        b.postOrderWalk();
    }
}