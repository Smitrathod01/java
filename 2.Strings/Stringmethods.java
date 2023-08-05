public class Stringmethods {
    public static void main(String[] args) {
        String name = "Smit";
        int value = name.length();
        System.out.println(value);
        String str = name.toLowerCase();
        System.out.println(str);
        //name.toUppercase is same as tlc and name.trim will remove extra spaces from front and back 
        System.out.println(name.substring(3, 4));//will print only those letters here end is not included.
        System.out.println(name.replace("s","sd"));
        //name.charAt(index) will return string at index specify
        //name.indexOf(string) will return index no
        //name.indexOf(str, fromIndex) will try to find char from given index and return -1 if not found
        System.out.println("regsg \" ghthht");//here it wont confuse also we can use \\
        //System.out.println(name.trim()); will remove extra spaces
        //name.startsWith() and endWith() will return true or false,will come in sout
    }
    
}
