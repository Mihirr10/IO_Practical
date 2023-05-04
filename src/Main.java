import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    Main.fileWrite();
    Main.fileReader();
  }

  public static void fileWrite(){
    try{
      FileOutputStream fileOutputStream = new FileOutputStream("FileReader.txt");
      fileOutputStream.write("IO Practical".getBytes());
    }catch (IOException e){
      System.out.println(e);
    }
  }

  public static void fileReader(){
    try{
      FileInputStream fileOutputStream = new FileInputStream("FileReader.txt");
      int i=0;
      while ((i=fileOutputStream.read())!= -1){
        System.out.print((char) i);
      }
      fileOutputStream.close();
    }catch (IOException e){
      System.out.println(e);
    }
  }
}