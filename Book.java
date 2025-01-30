class Book {
    private String title, author;
    private boolean isAvailable = true;

    public Book(String title, String author) { this.title = title; this.author = author; }

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() { isAvailable = true; }
}
