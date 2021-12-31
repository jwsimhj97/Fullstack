package com.hi;

import java.util.ArrayList;

public class Ex11_1 {

   public static void main(String[] args) {
      // 학생 성적 관리 프로그램 (ver 0.5.0)
      // 1.입력 2.보기 3.수정 4.삭제 0.종료 >
      // 총원x
      ArrayList<String[]> list=new ArrayList<>();
      java.util.Scanner sc=new java.util.Scanner(System.in);
      String input=null;
      String[] data = null;
      String bar="--------------------------------------";
      
      System.out.println("학생 성적 관리 프로그램 (ver 0.5.0)");
      
      while(true){
         System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료 >");
         input=sc.nextLine();
         if(input.equals("0")){
            System.out.println("종료입니다");
            break;
         }else if(input.equals("1")){
//            System.out.println("입력입니다");
            data=new String[4];      // data라는 객체가 돌때마다새로 생성되게함
            
            System.out.print("학번 >");
            data[0]=sc.nextLine();
            System.out.print("국어 >");
            data[1]=sc.nextLine();
            System.out.print("영어 >");
            data[2]=sc.nextLine();
            System.out.print("수학 >");
            data[3]=sc.nextLine();
                        
            list.add(data);
         }else if(input.equals("2")){
//            System.out.println("보기입니다");
            System.out.println(bar);
            System.out.println("학번\t국어\t영어\t수학");
            System.out.println(bar);
            for(int i=0; i<list.size(); i++){      // list의 배열갯수
               for(int j=0; j<list.get(i).length; j++){      // list 배열안의 배열갯수
                  System.out.print(list.get(i)[j]+"\t");
               }
               System.out.println();
            }
         }else if(input.equals("3")){
//            System.out.println("수정입니다");
            System.out.println("수정될 학번을 입력하세요");
            input=sc.nextLine();
            for(int i=0; i<list.size(); i++){
               if(input.equals(list.get(i)[0])){
                  data=new String[4];   
                  System.out.print("학번 >");
                  data[0]=sc.nextLine();
                  System.out.print("국어 >");
                  data[1]=sc.nextLine();
                  System.out.print("영어 >");
                  data[2]=sc.nextLine();
                  System.out.print("수학 >");
                  data[3]=sc.nextLine();
                  
                  list.set(i, data);                  
               }
            }
         }else if(input.equals("4")){
//            System.out.println("삭제입니다");
            System.out.println("삭제될 학번을 입력하세요");
            input=sc.nextLine();
            for(int i=0; i<list.size(); i++){
               if(input.equals(list.get(i)[0])){
                  list.remove(i);
               }
            }
         }else{
            System.out.println("메뉴를 보시고 다시입력해주세요");
         }
      }
      System.out.println("프로그램을 종료하였습니다");
   }

}
