package findMaxNumberInTxtFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            //Đọc fide theo đường dẫn
            File file = new File(filePath);
            //Kiểu tra nếu fide không tồn tại thì ném ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            //Đọc từng dòng của fide và tiến hành tổng cộng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum=0;
            while ((line = br.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng = "+sum);
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}