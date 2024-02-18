package com.ly.readfile_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author yong.li_1
 * 字符流读取文件
 **/
public class ReaderFile_ {
    public static void main(String[] args) {

    }

    @Test
    public void read01() {
        long startTime = System.currentTimeMillis();
        String filePath = "E:\\doc.txt";
        FileReader fileReader = null;
        int read = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("传统for循环运行时间:" + (endTime - startTime) + "ms");
    }

    @Test
    public void read02() {
        long startTime = System.currentTimeMillis();
        String filePath = "E:\\doc.txt";
        FileReader fileReader = null;
        char[] chars = new char[16];
        int read = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((read = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, read));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("传统for循环运行时间:" + (endTime - startTime) + "ms");
    }
}
