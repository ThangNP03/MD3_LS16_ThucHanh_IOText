package maxNumber;

import java.util.List;

public class FideMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FideMaxValue readAndWriteFile = new FideMaxValue();
        String PATH_NUMBER = "E:\\RIKKEI ACADEMY\\MD2\\Bai 15\\TH\\Find-Max-Read-And-Write-File\\src\\rikkei\\academy\\number.txt";
        String PATH_RESULT = "E:\\RIKKEI ACADEMY\\MD2\\Bai 15\\TH\\Find-Max-Read-And-Write-File\\src\\rikkei\\academy\\result.txt";
//        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }


}
