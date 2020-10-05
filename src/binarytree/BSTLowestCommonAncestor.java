package binarytree;

public class BSTLowestCommonAncestor {

    /*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
    public static Node lca(Node root, int v1, int v2) {
        if(root == null) return null;

        if(root.data == v1 || root.data == v2)
            return root;

        Node leftLCA = lca(root.left, v1, v2);
        Node rightLCA = lca(root.right, v1, v2);

        if(leftLCA != null && rightLCA != null )
            return root;

        return leftLCA != null ? leftLCA : rightLCA; // assumption is given nodes are present, else need to handle the
                                                     // scenarios if not found then return NULL
    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        int t = 6;
        int[] arr = {4, 2, 3, 1, 7, 6};
        Node root = null;
        while (t-- > 0) {
            int data = arr[t];
            root = insert(root, data);
        }
        int v1 = 1;
        int v2 = 7;
        Node ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }


}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

