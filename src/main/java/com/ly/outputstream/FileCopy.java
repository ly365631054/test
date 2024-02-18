package com.ly.outputstream;

import org.junit.Test;

import java.io.*;

/**
 * @Author yong.li_1
 **/
public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void copy() {
        //下面测试下各方法执行的时间 检查效率
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String filePath = "E:\\u455资料\\国家管网华为技术架构培训\\20221008_详细设计培训.mp4";
        String copyPath = "E:\\u455资料\\国家管网华为技术架构培训\\20221008_详细设计培训1.mp4";
        byte[] bytes = new byte[1024];
        int length = 0;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(copyPath, true);
            // 边读边写
            while ((length = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("传统for循环运行时间:" + (endTime - startTime) + "ms");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
