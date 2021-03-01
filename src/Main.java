
public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        // End of Example
        node.printNodes();
        System.out.println(node.length(node));
        System.out.println(node.sumOfNodes());
        node = node.deleteNode(node,4);
        node.printNodes();
    }
}
