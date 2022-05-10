package com.review.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int serverPort = 7777;
		try {
			Socket socket = new Socket(serverIp, serverPort);
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("클라이언트가 메세지보냈당");
			
			dos.close();
			socket.close();
		}catch(IOException e) {
			
		}
	}

}
