import edu.duke.*;

public class HelloWorld {
    //Methods:
    public void runHello () {
        //FileResource rs = new FileResource("hello_unicode.txt");
        //FileResource rs = new FileResource("animals.txt");
        //URLResource res = new URLResource ("http://www.dukelearntoprogram.com/java/hello_unicode.txt");
        URLResource rs = new URLResource ("http://www.dukelearntoprogram.com/java/somefile.txt");
        for (String line : rs.words()) {
            System.out.println(line);
        }
	}
}
