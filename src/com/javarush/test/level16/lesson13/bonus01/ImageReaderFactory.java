package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Work on 10.07.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type) {
        if (type == ImageTypes.JPG) {
            return new JpgReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        } else if (type == ImageTypes.BMP){
            return new BmpReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}

