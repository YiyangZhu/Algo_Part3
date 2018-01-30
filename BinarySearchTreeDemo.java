class BinarySearchTreeDemo{
    public static void main(String[] args){
        BinarySearchTree b = new BinarySearchTree(15);
        Node n1 = new Node(6);
        b.insert(n1,b.root);
        Node n2 = new Node(18);
        b.insert(n2,b.root);
        Node n3 = new Node(3);
        b.insert(n3,b.root);
        Node n4 = new Node(7);
        b.insert(n4,b.root);
        Node n5 = new Node(17);
        b.insert(n5,b.root);
        Node n6 = new Node(20);
        b.insert(n6,b.root);
        Node n7 = new Node(2);
        b.insert(n7,b.root);
        Node n8 = new Node(4);
        b.insert(n8,b.root);
        Node n9 = new Node(13);
        b.insert(n9,b.root);
        Node n10 = new Node(9);
        b.insert(n10,b.root);
        b.inOrderWalk();
        b.preOrderWalk();
        b.postOrderWalk();
        System.out.println(b.search(b.root,5));
        System.out.println(b.search(b.root,9));
        System.out.println(b.iterativeSearch(5));
        System.out.println(b.iterativeSearch(9));
        System.out.println(b.min(b.root).key+" is the minimum number.");
        System.out.println(b.max(b.root).key+" is the maximum number.");
        System.out.println(n3.parent.key);
        System.out.println(b.successor(n4).key);
        System.out.println(b.successor(n6));
        System.out.println(b.successor(n5).key);
    }

}