public class Book {

    private String title;
    boolean isLent = false;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }

    public void setIsLent() {
        boolean titlelent = isLent;
    }

    public String getTitle() {
        return title;
    }
}
