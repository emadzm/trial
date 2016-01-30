/**
 * Print the names of all files selected within a directory (or folder).
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.File;

//public class DirReader {
//    public void checkDir() {
 //       DirectoryResource dr = new DirectoryResource();
 //       for (File f : dr.selectedFiles()) {
   //         System.out.println(f);
    //    }
   // }
//}

public class GrayScaleConverter
{
   
    public void testGrey(){
        ImageResource ir = new ImageResource();
        ImageResource G = makeGray(ir);
        G.draw();
    }
    
    public ImageResource makeGray(ImageResource inImage){
        
        ImageResource outImage = new ImageResource (inImage.getWidth(),inImage.getHeight());
        for (Pixel pixel: outImage.pixels()){
            
            Pixel inPixel = inImage.getPixel(pixel.getX(),pixel.getY());
            int Grey = (inPixel.getGreen()+inPixel.getBlue()+inPixel.getRed())/3;
            pixel.setRed(Grey);
            pixel.setGreen(Grey);
            pixel.setBlue(Grey);
            outImage.setPixel(pixel.getX(), pixel.getY(), pixel);
                       
            
            
            
        }
        
        return outImage;
        
        
    }
    
    public void selectAndconvert() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource ir = new ImageResource(f);
            ImageResource G = makeGray(ir);
            G.draw();
       
       }
    }
    
    public void dosave(){
        DirectoryResource dir = new DirectoryResource();
        for (File f : dir.selectedFiles()) {
            ImageResource ir = new ImageResource(f);
            ir.draw();
            String fname = ir.getFileName();
            String newname = "Grey-" + fname;
            ImageResource G = makeGray(ir);
            G.draw();
            G.setFileName(newname);
            G.save();

            
       
       }
    }
       
}


