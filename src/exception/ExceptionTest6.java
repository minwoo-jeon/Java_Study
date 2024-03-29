  package exception;

import java.io.*;

public class ExceptionTest6 {
    public static void main(String[] args) {
        try{
            File f =  createFile("test2.txt");
            System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다");
        }catch (Exception e){
            System.out.println(e.getMessage()+"다시 인력해 주시기 바랍니다");
        }
    } //main 메서드의 끝

    static File createFile(String fileName) throws  Exception {
        if (fileName==null || fileName.equals(""))
            throw new   Exception("파일 이름이 유효하지 않습니다.");
        File f = new File(fileName);  // File 클래스의 객채 생성
        //File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.
        f.createNewFile();
        return f; // 생성된 객체의 잠초를 반혼한다
        } //createFile 메서드 끝
    }// 클래스의 끝

