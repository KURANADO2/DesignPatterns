package com.kuranado.decorator.decorator4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: Xinling Jing
 * @Date: 2019-07-21 18:21
 */
public class IOTest {

    public static void main(String[] args) {

        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("/Users/jing/Desktop" +
                "/IOTest.txt")));
            byte[] buff = new byte[dataInputStream.available()];
            dataInputStream.read(buff);
            System.out.println(new String(buff));
        } catch (IOException e) {
             e.printStackTrace();
        } finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
