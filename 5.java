public class Queue<T> {
    private Node<T> front, rear;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = rear = null;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    public String oddListings() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = front;
        boolean isOdd = true;
        while (current != null) {
            if (isOdd) {
                sb.append(current.data).append(" ");
            }
            isOdd = !isOdd;
            current = current.next;
        }
        return sb.toString().trim();
    }

    public String evenListings() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = front;
        boolean isOdd = true;
        while (current != null) {
            if (!isOdd) {
                sb.append(current.data).append(" ");
            }
            isOdd = !isOdd;
            current = current.next;
        }
        return sb.toString().trim();
    }
}
