class BinarySearchTree{
    Node root;
    
    BinarySearchTree(int k){
        root = new Node(k);
    }
    
    void insert(Node n, Node root){
        if(n.key <= root.key){
            if(root.left == null){
                root.left = n;
                return;
            }
            insert(n, root.left);
        } else {
            if(root.right == null){
                root.right = n;
                return;
            }
            insert(n,root.right);
        }
    }
    
    void inOrderWalk(){
        inOrderWalk(root);
        System.out.println();
    }
    
    void inOrderWalk(Node n){
        if(n != null){
            inOrderWalk(n.left);
            System.out.print(n.key+" ");
            inOrderWalk(n.right);
        }
    }    
    
    void preOrderWalk(){
        preOrderWalk(root);
        System.out.println();
    }
    
    void preOrderWalk(Node n){
        if(n != null){
            System.out.print(n.key+" ");
            preOrderWalk(n.left);
            preOrderWalk(n.right);
        }
    }
    
    void postOrderWalk(){
        postOrderWalk(root);
        System.out.println();
    }
    
    void postOrderWalk(Node n){
        if(n != null){
            postOrderWalk(n.left);
            postOrderWalk(n.right);
            System.out.print(n.key+" ");
        }
    }  
}