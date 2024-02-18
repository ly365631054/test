package com.ly.outputstream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author yong.li_1
 * 写出文件
 **/
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        String filePath = "E:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath);
            String s = "aaabbbccc";
            fileOutputStream.write('w');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void writeFile02() {
        String filePath = "E:\\a02.txt";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            String s = "aaabbbccc";
//            fileOutputStream.write(s.getBytes());
            fileOutputStream.write(s.getBytes(), 0, 4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
