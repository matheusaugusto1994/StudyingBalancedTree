package br.com.matheus;

public class BalancedTree {

	public static void main(String[] args){
		Node node6 = new Node(null, null, "6");
		Node node5 = new Node(null, null, "5");
		Node node4 = new Node(node6, null, "4");

		Node node3 = new Node(null, null, "3");
		Node node2 = new Node(node4, node5, "2");

		Node node1 = new Node(node2, node3, "1");
		System.out.println(isBalanced(node1));
	}

	private static boolean isBalanced(Node node) {

		Node left = node.getLeft();
		Node right = node.getRight();

		if (left == null && right == null)
			return true;

		Integer leftNodeSize = getSizeOfNode(left);
		Integer rightNodeSize = getSizeOfNode(right);

		int differenceBetweenNodes = Math.abs(leftNodeSize - rightNodeSize);

		return differenceBetweenNodes <= 1;
	}

	private static int getSizeOfNode(Node node) {
		if (node == null)
			return 0;

		return 1 + Math.max(getSizeOfNode(node.getLeft()), getSizeOfNode(node.getRight()));
	}

}
