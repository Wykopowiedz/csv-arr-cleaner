import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {

    @Test
    public void testFixArray() {

        String row = "first, second, {\"elem1, elem2, elem3\"}, fourth";

        String[] arr = row.split(",");

        assertEquals(new String[] { "first", "second", "{\"elem1, elem2, elem3\"}", "fourth" }, CsvReader.fixArray(arr));
    }
}
