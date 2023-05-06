package src.domain;

public class Company extends Entity {

    private String title;

    public Company(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean match(String text) {
        return title.toLowerCase().contains(text.toLowerCase());
    }
}
