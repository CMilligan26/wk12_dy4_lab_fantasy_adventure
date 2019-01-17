package items;

import java.util.ArrayList;

public class Room {

    private String name;
    private String description;
    private ArrayList<Content> contents;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        contents = new ArrayList<>();
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addItem(Content itemToDrop) {
        contents.add(itemToDrop);
    }
}
