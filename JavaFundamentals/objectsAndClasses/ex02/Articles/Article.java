package Ex02.Articles;

class Article {

    public String title;
    public String content;
    public String author;


    Article(String title, String content, String author) {

        this.title = title;
        this.content = content;
        this.author = author;

    }

    void edit(String newContent) {
        this.content = newContent;
    }

    void changerAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

}
