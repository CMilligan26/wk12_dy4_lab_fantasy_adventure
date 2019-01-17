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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
