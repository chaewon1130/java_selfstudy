package com.review.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		try {
			serverSocket = new ServerSocket(port);
			Socket socket = serverSocket.accept();
			System.out.println("연결성공");
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("클라이언트 메세지 : " + dis.readUTF());
			dis.close();
			socket.close();
		}catch(IOException e) {
			
		}
	}

}
