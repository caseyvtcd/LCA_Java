import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LCAJavaTest {

    @Test
    void testFindLCA(){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.right.right = new Node(8);
		root.right.right.right.left = new Node(9);

		LCAJava.findLCA(root, root.right.left.left, root.right.right);
		LCAJava.findLCA(root, root.right.left.left, new Node(10));
		LCAJava.findLCA(root, root.right.left.left, root.right.left.left);
		LCAJava.findLCA(root, root.right.left.left, root.right.left);
		LCAJava.findLCA(root, root.left, root.right.left);
    }

}
