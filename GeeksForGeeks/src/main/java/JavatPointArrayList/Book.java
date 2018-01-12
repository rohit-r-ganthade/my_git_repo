package JavatPointArrayList;

/**
 * Created by rohit on 20/12/17.
 */

class Book implements Comparable<Book>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
//    public int compareTo(Book b) {
//        if(name.compareTo(b.name)>1){
//            return 1;
//        }else if(name.compareTo(b.name)<1){
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
