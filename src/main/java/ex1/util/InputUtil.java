package ex1.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InputUtil {

    public static int nextInt(){
        BufferedReader bufferReader = new BufferedReader(new StringReader("1009"));
        try{
            long t1 = System.nanoTime();
            String input =bufferReader.readLine().trim();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < input.length(); i++){

                if(input.charAt((i)) > 47 && input.charAt((i))< 58){
                    stringBuilder.append(input.charAt(i));
                }
                else{
                    stringBuilder.append(",");
                }
            }

            int result =  Arrays.stream(stringBuilder.toString().split(","))
                    .filter(str-> !str.isEmpty())
                    .map(Integer::parseInt)
                    .findFirst()
                    .get();
            long t2 = System.nanoTime();
            System.out.println(t2 - t1);
            return result;
//            return 0;
        }
        catch (IOException e){
            return 0;
        }
    }
    public static List<Integer> nextInts()  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            String input = br.readLine().trim();


            StringBuilder stringBuilder = new StringBuilder();


            for(int i =0 ; i < input.length(); i++){
                if(input.charAt(i) > 47 && input.charAt(i) < 58){
                    stringBuilder.append(input.charAt(i));
                }
                else{
                    stringBuilder.append(",");
                }
            }
            String[] splitStr= stringBuilder.toString().split(",");
//          List<String> strList = Arrays.stream(splitStr).filter(str -> !str.isEmpty()).toList();
            List<Integer> strList = Arrays.stream(splitStr).filter(str -> !str.isEmpty()).map(Integer::parseInt).toList();      // Int형으로 변환하기

            return strList;

        }
        catch (IOException e){
            return List.of();
        }

    }

}
