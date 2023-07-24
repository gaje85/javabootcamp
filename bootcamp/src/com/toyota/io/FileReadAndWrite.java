package com.toyota.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadAndWrite {

	public static void main(String[] args) {
		FileReadAndWrite fw = new FileReadAndWrite();
		fw.read();
		fw.write();
		
	}

	private void write() {
	
		 FileWriter fw = null;
	     BufferedWriter bw = null;
	     try {
			fw = new FileWriter("c:/med/notes1.txt");
			bw = new BufferedWriter(fw);
			String s ="this is the notes 1 ";
			bw.write(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private void read() {
	     FileReader fr = null;
	     BufferedReader br = null;
	     StringBuilder sb = new StringBuilder();
	     try {
			fr = new FileReader("c:/med/notes.txt");
			br = new BufferedReader(fr);
			String s ="";
			while((s = br.readLine()) != null) {
				sb.append(s+"\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
