class Book
{
    String title;
    String author;
    int numberOfPages;
    String ISBN;

    Book(String tit, String aut, int num, String isbn)
    {
         title = tit;
         author = aut;
         numberOfPages = num;
         ISBN = isbn;
    }
    public String getInitials()
    {
        String initials = " ";
        for(int i = 0; i < author.length(); i++)
        {
            char currentChar = author.charAt(i);
            if(currentChar >= 'A' && currentChar <= 'Z')
            initials = initials + currentChar + '.';
        }
        return initials;
    }
}
class ScientificBook extends Book        
{
    String area;
    boolean proceeding = false;
    ScientificBook(String tit,String aut,int num,String isbn,String a)
    {
    super(tit,aut,num,isbn);
    area = a;
    }    
   public void DisplayBookInformation()
    {
        System.out.println("*******Book Information***********");
        System.out.println();
        System.out.println("Title of theBook           : "+title);
System.out.println("Author of theBook          : "+author);
System.out.println("Number of pages in the Book: "+numberOfPages);
System.out.println("ISBN number  of the Book   : "+ISBN);
System.out.println("Area of the Book           : "+area);
System.out.println("Whether this is from proceedings:"+proceeding);
        System.out.println();
    }
}
class ComicBook extends Book        
{
    String publisherName;
    int price;
    boolean proceeding = false;
    ComicBook(String tit,String aut,int num,String isbn, String pub, int pric)
    {
        super(tit,aut,num,isbn);
        publisherName = pub;
        price = pric;
    }    
   public void DisplayBookInformation()
    {
        System.out.println("*******Book Information***********");
        System.out.println();
        System.out.println("Title of theBook           : "+title);
System.out.println("Author of theBook          : "+author);
System.out.println("Number of pages in the Book: "+numberOfPages);
System.out.println("ISBN number  of the Book   : "+ISBN);
System.out.println("Whether this is from proceedings:"+proceeding);
        System.out.println("Publisher of the Book      : " +publisherName);
        System.out.println("Price of the Book          : " +price);
    }
}
public class JavaInherit
{

    public static void main(String[] args)
    {
        System.out.println("Program for Inheritance!");
        ScientificBook b1=new ScientificBook("NeuralNetworks","Simon Haykin",696,"0-02-352761-7","Artificial Inteligence");
        System.out.println("Initials: "+ b1.getInitials());
        b1.DisplayBookInformation();
       
       ComicBook c1 = new ComicBook("abc", "Anuja", 700, "0-03-123456-8", "Sanika", 1000);
       c1.DisplayBookInformation();
    }
}
