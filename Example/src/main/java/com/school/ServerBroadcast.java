package com.school;

import java.io.*;
import java.net.*;

public class ServerBroadcast {
    public static void main(String[] args) {
        try {

            DatagramSocket socket = new DatagramSocket();

            InetAddress broadcastAddress = InetAddress.getByName("192.168.110.255");

            String message = "Day la tin nhan tu Broadcast";

            byte[] sendData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, broadcastAddress, 6666);

            socket.send(sendPacket);

            System.out.println("Da gui!");

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
