package com.ly.directional;

import java.io.File;

/**
 * @Author yong.li_1
 **/
public class Demo01 {
    public static void main(String[] args) {
        File file = new File("E:\\u455-pimc-ho");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }

}
