package study.addbook.beans;

import study.addbook.Constants;

public class Book extends AbstractBook {
    // 著者
    private String author;
    // ISBN
    private String isbn;

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private String getIsbn() {
        return isbn;
    }

    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void setParam(String[] args) {
        super.setParam(args);
        this.setAuthor(args[7]);
        this.setIsbn(args[8]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" ");
        sb.append(Constants.KEY_AUTHOR).append("：").append(this.getAuthor()).append(" ");
        sb.append(Constants.KEY_ISBN).append("：").append(this.getIsbn());
        return sb.toString();
    }
}
