package de.youness.springboot.tut.todos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {

    @Id
    private int id;
    private String title;
    private String description;
    private long timestamp;

    public Todo() {
        this.timestamp=System.currentTimeMillis();
    }

    public Todo(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timestamp=System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
