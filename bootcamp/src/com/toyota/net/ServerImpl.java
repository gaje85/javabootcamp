package com.toyota.net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImpl {
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		BufferedReader br = null;
		BufferedOutputStream bos = null;
		DataInputStream dis = null;
		try {
			ss = new ServerSocket(10000);
			soc = ss.accept();
			System.out.println("after Accept server");
			
			dis = new DataInputStream(soc.getInputStream());
			int data = 0;
			while((data = dis.read()) != -1) {
				System.out.print((char)data);
			}
			
			
			System.out.println("after read server");
			bos = new BufferedOutputStream(soc.getOutputStream());
			bos.write(new String("This is from server ").getBytes());
			System.out.println("after write server");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ss != null)
					ss.close();
				if(soc != null)
					soc.close();
				if(bos != null)
					bos.close();
				if(br != null)
					br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
