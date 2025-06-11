
public class TextStats {

    private int rowCount = 0;
    private int charCount = 0;

    public void addLine(String line) {
        rowCount++;
        charCount += line.length();
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
