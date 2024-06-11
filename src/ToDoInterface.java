import java.util.List;
public interface ToDoInterface {
    void addItem(String description);
    void removeItem(int itemId);
    void markItemAsCompleted(int itemId);
    List<TodoItem> getAllItems();
    List<TodoItem> getCompletedItems();
    List<TodoItem> getPendingItems();
}
