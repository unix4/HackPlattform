package src;

import com.hack.util.ASMFileReader;
import org.junit.Test;

import java.io.IOException;


public class ASMFileReaderTest {

    @Test(expected = IOException.class)
    public void testReadFileWithWrongFileExtension() throws IOException {
        ASMFileReader fileReader = new ASMFileReader();
        fileReader.readFile("test.sh");
    }
}
