package com.ly.inputstream;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author yong.li_1
 * 读文件
 **/
public class FileInputStream_ {

    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String filePath = "E:\\test.txt";
        FileInputStream fileInputStream = null;
        int read = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    @Test
    public void readFile02() {
        String filePath = "E:\\test.txt";
        byte[] bytes = new byte[8];
        int length = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((length = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
            }
        }
    }
}
