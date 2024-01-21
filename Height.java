/**
 * Height
 */
public class Height {

    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        
        this.feet = feet;
        this.inches = inches;
    }

    public int toInches() {
        int x = this.feet / 12;
        return this.inches + x; 
    }

    public String toString() {
        return "Height: " + this.feet + "' " + this.inches + "\" ";
    }
}