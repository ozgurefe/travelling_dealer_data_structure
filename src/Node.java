public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes() {
        Node n = this;
        while (n != null) {
            System.out.println(n.data);
            n = n.following;
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length(Node h) {
        if (h.following != null) {
            return length(h.following) + 1;
        }
        else{
            return 1;
        }
    }

    // TODO:: Implement to return the sum of the Nodes
    int sumOfNodes() {
        int lenght = 0;
        Node n = this;
        while (n != null) {
            lenght += n.data;
            n = n.following;
        }
        return lenght;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        Node preNode= head;
        if (n.data == data) {
            return head.following;
        }
        // TODO:: Implement the proper loop in order to remove given data
        while (n != null) {
            if (n.data == data) {
                preNode.following = n.following;
                n = null;
                return head;
            }
            preNode = n;
            n = n.following;
        }
        //
        return head;
    }
}