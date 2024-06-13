package com.school;

import java.io.*;
import java.net.*;

public class ClientBroadcast {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(6666);
            byte[] receiveData = new byte[1024];

            System.out.println("Dang doi tin nhan tu Broadcast...");

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
            InetAddress senderAddress = receivePacket.getAddress();

            System.out.println("Day la tin nhan tu " + senderAddress + ": " + message);

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
