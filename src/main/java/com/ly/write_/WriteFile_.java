package com.ly.write_;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author yong.li_1
 **/
public class WriteFile_ {
    public static void main(String[] args) {

    }

    @Test
    /**
     * 字符流写
     */
    public void write01() {
        String filePath = "E:\\314.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            //字符
            fileWriter.write('a');
            //写字符串
            fileWriter.write("a");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 字符流边读边写
     */
    @Test
    public void write02() {
        String filePath = "E:\\doc.txt";
        String copyPath = "E:\\314.txt";
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        char[] chars = new char[16];
        int length = 0;
        try {
            fileReader = new FileReader(filePath);
            fileWriter = new FileWriter(copyPath);
            while ((length = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
