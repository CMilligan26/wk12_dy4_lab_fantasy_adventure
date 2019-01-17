package items;

public abstract class Content {
    private String name;

    public Content(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
