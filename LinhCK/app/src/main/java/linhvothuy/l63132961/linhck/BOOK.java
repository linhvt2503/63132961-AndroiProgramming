package linhvothuy.l63132961.linhck;

public class BOOK {
    String BookID, BookName;
    int Page;
    float Price;
    String Description;

    public BOOK(String bookID, String bookName, int page, Float price, String description) {
        BookID = bookID;
        BookName = bookName;
        Page = page;
        Price = price;
        Description = description;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
