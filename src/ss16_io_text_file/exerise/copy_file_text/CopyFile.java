package ss16_io_text_file.exerise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exerise\\copy_file_text\\source.csv");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();

        File file1 = new File("src\\ss16_io_text_file\\exerise\\copy_file_text\\target.csv");
        if (!file1.exists()) {
            throw new FileNotFoundException();
        }
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String e : list) {
            bufferedWriter.write(e);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        String string = "";
        for(String str: list){
            string += str;
        }
        string.toString().split("");
        System.out.println("Số ký tự có trong tệp là: " + string.length());

    }
}
