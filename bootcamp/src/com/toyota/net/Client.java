package com.toyota.net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		Socket soc = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;
		try {
			soc = new Socket("localhost",10000);
			System.out.println("connected");
			bos = new BufferedOutputStream(soc.getOutputStream());
			bos.write(new String("This is from client ").getBytes());
			bos.flush();
			System.out.println("client written");
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String serverData = br.readLine();
			System.out.println(serverData);
			
		}catch (Exception e) {
			e.printStackTrace();
		}try {
			
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
