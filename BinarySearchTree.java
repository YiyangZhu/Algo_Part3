class BinarySearchTree{
    Node root;
    
    BinarySearchTree(int k){
        root = new Node(k);
    }
    
    void insert(Node n, Node root){
        if(n.key <= root.key){
            if(root.left == null){
                root.left = n;
                n.parent = root;
                return;
            }
            insert(n, root.left);
        } else {
            if(root.right == null){
                root.right = n;
                n.parent = root;
                return;
            }
            insert(n,root.right);
        }
    }
    
    Node parent(Node n){
        return n.parent;
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
    
    Node search(Node n, int k){
        if(n == null || k == n.key){
            return n;
        }
        if(k < n.key){
            return search(n.left, k);
        } else {
            return search(n.right, k);
        }
    }
    
    Node iterativeSearch(int k){
        Node current = root;
        while(current != null && current.key != k){
            if(k > current.key){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return current;
    }
    
    Node min(Node n){
        Node current = n;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }
    
    Node max(Node n){
        Node current = n;
        while(current.right != null){
            current = current.right;
        }
        return current;
    }
    
    Node successor(Node n){
        if(n.right != null){
            return min(n.right);
        }
        Node y = n.parent;
        while(y != null && n == y.right){
            n = y;
            y = y.parent;
        }
        return y;
    }
}