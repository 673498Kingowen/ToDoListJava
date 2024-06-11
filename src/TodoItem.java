public class TodoItem {
    private int id;
    private String description;
    private boolean isCompleted;

    public TodoItem (int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        String str = "id = " + id + "\n" +
                "Description: " + description + "\n" +
                "isCompleted: " + isCompleted;
        return "--------- TodoItem --------- \n" + str;

    }
}
