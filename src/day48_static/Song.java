package day48_static;

public class Song {

    String name;
    double length;
    String author;
    String publisher;
    String genre;


    public Song(String name){
        this.name = name;
    }
    public Song(String name, double length){
        //this.name = name;
        this(name);
        this.length = length;
    }
    public Song(String name, double length, String author){
      //  this.name = name;
     //   this.length = length;
        this(name,length);
        this.author = author;

    }
    public Song(String name, double length, String author, String publisher){
//        this.name = name;
//        this.length = length;
//        this.author = author;
        this(name,length,author);
        this.publisher = publisher;
    }
    public Song(String name, double length, String author, String publisher, String genre){
//        this.name = name;
//        this.length = length;
//        this.author = author;
//        this.publisher = publisher;
        this(name,length,author,publisher);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
