package study.addbook.beans;

import java.io.Serializable;

import study.addbook.Constants;
import sutdy.addbook.util.BookUtil;

public abstract class AbstractBook implements BookIF, Serializable {
    // 書籍区分
    protected String bookClass;
    // 書名
    protected String name;
    // 出版社
    protected String publisher;
    // 定価
    protected String price;
    // 出版日
    protected String date;

    public String getBookClass() {
        return bookClass;
    }

    private void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getPublisher() {
        return publisher;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private String getPrice() {
        return price;
    }

    private void setPrice(String price) {
        this.price = price;
    }

    private String getDate() {
        return date;
    }

    private void setDate(String year, String month, String day) {
        this.date = BookUtil.getYMD(year, month, day);
    }

    @Override
    public void setParam(String[] args) {
        this.setBookClass(args[0]);
        this.setName(args[1]);
        this.setPublisher(args[2]);
        this.setPrice(args[3]);
        this.setDate(args[4], args[5], args[6]);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.KEY_NAME).append("：").append(this.getName()).append(" ");
        sb.append(Constants.KEY_PUBLISHER).append("：").append(this.getPublisher()).append(" ");
        sb.append(Constants.KEY_PRICE).append("：").append(this.getPrice()).append(" ");
        sb.append(Constants.KEY_DATE).append("：").append(this.getDate());
        return sb.toString();
    }

}
