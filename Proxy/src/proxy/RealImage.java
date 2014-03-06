
package proxy;

public class RealImage implements Image {
    private String filename = null;
    
    public RealImage(final String FILENAME) { 
        filename = FILENAME;
        loadImageFromDisk();
    }
 
    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    /**
     * Displays the image
     */
    @Override
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }

    /**
     * Shows image name
     */
    @Override
    public void showData() {
        System.out.println("Image filename: " + filename);
    }
}
