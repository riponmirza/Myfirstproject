
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextStatsTest {

    @Test
    public void TestEmptyLine(){
        TextStats stats = new TextStats();
        stats.addLine("");
        assertEquals(1, stats.getRowCount());
        assertEquals(0, stats.getCharCount());

    }

    @Test
    public void testSingleLineInput() {
        TextStats stats = new TextStats();
        stats.addLine("Hej");
        assertEquals(1, stats.getRowCount());
        assertEquals(3, stats.getCharCount());
    }

    @Test
    public void testMultipleLines() {
        TextStats stats = new TextStats();
        stats.addLine("Första raden");
        stats.addLine("Andra raden");
        stats.addLine("Tredje raden");
        assertEquals(3, stats.getRowCount());
        assertEquals(35, stats.getCharCount()); // 12+11+12
    }

}
