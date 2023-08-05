class Demo
{
    String[] books;
    int num;

    public Demo()
    {
        this.books = new String[50];
        int num=0;
    }

    public void addBook(String book)
    {
        this.books[num] = book;
        num++;
        System.out.println(book + " is succesfully added!!");
    }

    public void showBooks()
    {
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i] !=null)
            {
                System.out.println(this.books[i]);
            }
            
        }
    }

    public void issueBook(String book)
    {
        for(int j=0;j<this.books.length;j++)
        {
            if(book.equals(this.books[j]))
            {
                System.out.println(book + " is issued");
                this.books[j] = null;
                break;
            }
            else{
                System.out.println("Book is not avaiable");
            }
        }
    }

    public void returnBooks(String book)
    {
        this.books[num] = book;
        System.out.println("You have returned " + book + " Successfully");
    }
}

public class Library {
    public static void main(String[] args) {
        Demo b = new Demo();
        b.addBook("sorrow");
        b.addBook("Dont leave me alone");
        b.addBook("I am decent");
        b.addBook("Iam with u from dusk till dawn");
        b.addBook("yes");

        b.showBooks();

        b.issueBook("I am decent");
        b.showBooks();

        b.returnBooks("I am decent");
        b.showBooks();

    }
}
