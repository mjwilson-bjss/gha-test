package com.bjss.mjwilson.gha;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Gha {

    public int seven() {
        return 7;
    }

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("hello world");
        System.out.println(InetAddress.getLocalHost().getHostName());
    }

}
