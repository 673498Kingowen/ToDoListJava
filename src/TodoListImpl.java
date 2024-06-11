import java.util.ArrayList;
import java.util.List;
public abstract class TodoListImpl implements ToDoInterface{
    private Node head;
    private int nextId;

    public TodoListImpl() {
        this.head = null;
        this.nextId = 0;
    }

    @Override
    public void addItem(String description) {
        TodoItem newItem = new TodoItem(nextId++, description);
        Node node = new Node(newItem);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    @Override
    public void removeItem(int itemId) {
        if (head == null) {
            return;
        }

        if (head.data.getId() == itemId) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data.getId() != itemId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public void markItemAsCompleted(int itemId) {
        Node current = head;
        while(current != null) {
            if (current.data.getId() == itemId) {
                current.data.setCompleted(true);
                return;
            }
            current = current.next;
        }
    }

    @Override
    public List<TodoItem> getAllItems() {
        List<TodoItem> items = new ArrayList<>();
        Node current = head;

        while (current != null) {
            items.add(current.data);
            current = current.next;
        }
        return items;
    }

    @Override
    public List<TodoItem> getCompletedItems() {
        List<TodoItem> completedItems = new ArrayList<>();
        Node current = head;

        while (current != null) {
            if (current.data.isCompleted()) {
                completedItems.add(current.data);
            }
            current = current.next;
        }
        return completedItems;
    }

    @Override
    public List<TodoItem> getPendingItems() {
        List<TodoItem> pendingItems = new ArrayList<>();
        Node current = head;

        while (current != null) {
            if (!current.data.isCompleted()){
                pendingItems.add(current.data);
            }
            current = current.next;
        }
        return pendingItems;
    }
}