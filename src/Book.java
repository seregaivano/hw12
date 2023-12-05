public class Book {
    private String name;
    private int publisherYear;
    private Author author;

    public Book (String name, int publisherYear, Author author) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.author = author;
    }
    public String getName() {

        return this.name;
    }
    public int getPublisherYear() {

        return this.publisherYear;
    }
    public void setPublisherYear(int publisherYear) {

        this.publisherYear = publisherYear;
    }
    public Author getAuthor (){
        return this.author;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return name.equals(c2.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    public String toString() {
        return "Название: " + this.name + ". Год изд: " + this.publisherYear + " " + this.author;
    }

}