
package proxy;

public class ProxyImage implements Image {
    private RealImage image = null;
    private String filename = null;
    
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }

    /**
     * Shows image name
     */
    @Override
    public void showData() {
        System.out.println("Image filename: " + filename);
    }
}
