package com.imt.sys.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

public class uploadText {
	private   String file = "";
	//保存字符串到文件中
	public void saveAsFileWriter(String content,UUID uuid) {
	 file="F:/text/"+uuid+".txt";
	 FileWriter fwriter = null;
	 try {
	  fwriter = new FileWriter(file);
	  fwriter.write(content);
	 } catch (IOException ex) {
	  ex.printStackTrace();
	 } finally {
	  try {
	   fwriter.flush();
	   fwriter.close();
	  } catch (IOException ex) {
	   ex.printStackTrace();
	  }
	 }
	}
		//读取本地文本
	   public  String readFileByLines(String path) {
	        File file = new File(path);
	        BufferedReader reader = null;
	        String content="";
	        try {
	            System.out.println("以行为单位读取文件内容，一次读一整行：");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	            	//加上p标签 ，前台显示可以换行 
	            	tempString="<p>"+tempString+"</p>";
	            	// 显示行号
	                System.out.println("line?????????????????????????????????? " + line + ": " + tempString);
	                content+=tempString;
	                line++;
	            }
	        }catch(IOException e){
	        	
	        }
			return content;
	   }
}
