package com.javarush.test.level18.lesson08.task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/data.txt";
    private FileOutputStream x;
    public AmigoOutputStream(FileOutputStream x) throws FileNotFoundException
    {
        super(fileName);
        this.x = x;
    }
    public void close() throws IOException
    {
        x.flush();
        String y = "JavaRush © 2012-2013 All rights reserved.";
        x.write(y.getBytes());
        x.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
       new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException
    {
        x.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException
    {
        x.write(b);
    }
    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        x.write(b, off, len);
    }
    public void flush() throws IOException
    {
        x.flush();
    }
    public void finalize() throws IOException
    {super.finalize();}

}

