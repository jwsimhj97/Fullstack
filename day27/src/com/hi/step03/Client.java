package com.hi.step03;
// 다중에코서버
import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Socket sock=null;
      InputStream is=null;
      OutputStream os=null;
      InputStreamReader isr=null; //문자열스트림 변환
      OutputStreamWriter osw=null;
      BufferedReader br=null;
      BufferedWriter bw=null;
      
      try {
         sock=new Socket("192.168.0.9", 5000);
         is=sock.getInputStream();
         os=sock.getOutputStream();
         isr=new InputStreamReader(is);
         osw=new OutputStreamWriter(os);
         br=new BufferedReader(isr);
         bw=new BufferedWriter(osw);
         
         while(true){
//            System.out.print(">>>");
//            String msg=sc.nextLine();
//            
//            bw.write(msg);
//            bw.newLine();
//            bw.flush(); //파일대상일때는 그냥 껐지만, 지금은 io를 안 끊고 있으므로..
            
            //빠져나가고 싶으면? break 시키면 됨 ..... 읽는 쪽에서도!(server)
//            if(msg.equals("exit")){break;}
            
            String msg2=br.readLine();
            System.out.println(msg2);            
            
            
         }         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         
         try {
            bw.close();
            br.close();
            osw.close();
            isr.close();
            os.close();
            is.close();
            sock.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }

   }

}