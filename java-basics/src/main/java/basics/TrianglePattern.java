package basics;

public class TrianglePattern {
    public static String getTriangleString(int rows) {
        String result = "";
        int counter = 1;

        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                result += counter + " ";
                counter++;
            }
            result += "\n";
        }

        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(getTriangleString(7));
    }
}
