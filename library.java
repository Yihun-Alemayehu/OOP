import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class book{
   int bookId;
   String title;
   author author;
   String gener;
   int availablecopies;
   int totalcopies;
  int getbookid(){return bookId;}
    String gettitle(){return title;}
    author getauthor(){return author;}
        String getgener(){return gener;}
          int getavailablecopies(){return availablecopies;}
            int gettotalcopies(){return totalcopies; }  
  void displaybookdetails(){
    System.out.println();
}
class author{
   int authorId;
   String name;
   String bio;
    int getauthorid(){return authorId;}
            String getauthorname(){return name; }
     String getbookbio(){return bio; }
               void displayauthordetails(){
    System.out.println();
}
class member{
 int memberId;
   String membername;
  List<book> bbooks;
   String getauthorname(){return name; }
    String getauthorname(){return name; }
     String getauthorname(){return name; }
    
}
class librar{
 List<book> books;
 List<author> authors;;
 List<member> members;
}
public class library {
    public static void main(String[] args) {
        
    }
    
}
