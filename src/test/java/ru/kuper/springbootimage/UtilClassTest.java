package ru.kuper.springbootimage;


import org.junit.jupiter.api.Test;
import ru.kuper.springbootimage.util.UtilClass;

import java.io.IOException;

public class UtilClassTest {

    @Test
    public void testImageRead()  throws IOException {
        UtilClass utilClass = new UtilClass();
        String path1 = "E:\\1.jpg";
        String path2 = "imgs\\i.jpg";

        byte[] imageBytes = utilClass.getImageBytes(path2);



    }

}
