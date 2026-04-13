package ex1;

import ex1.controller.StudentManager;
import ex1.util.InputUtil;
import ex1.view.MainView;

import java.io.*;
import java.util.*;

//class CustomScanner extends Scanner

public class Ex1Application {
    public static void main(String[] args) throws IOException {
//        StudentManager studentManager = StudentManager.getInstance();           // 입력을 통해 모델에 접근할 수 있는 Controller 기능


        Map<String, List<Long>> resultMap = new HashMap<>();
        resultMap.put("Scanner", new ArrayList<>());
        resultMap.put("Custom", new ArrayList<>());
        resultMap.put("Draw", new ArrayList<>());

//        List<Long> b = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Scanner sc = new Scanner(new StringReader("100000000"));
            long t1 = System.nanoTime();
            if (sc.hasNextInt()) sc.nextInt();
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            InputUtil.nextInt();
            long t4 = System.nanoTime();
            long sTime = t2 - t1;
            long cTime = t4 - t3;
            if(sTime > cTime){
                resultMap.get("Scanner").add(cTime);
            }
            else if(sTime < cTime){
                resultMap.get("Scanner").add(sTime);
            }
            else {
                resultMap.get("Draw").add(cTime);
            }
//            b.add(t2-t1 > t4-t3 ? t2 - t1 : t4 - t3);
        }
        System.out.println(resultMap);
        System.out.println(resultMap.get("Scanner").stream().mapToLong(t -> t).sum() / resultMap.get("Scanner").size());
        System.out.println(resultMap.get("Custom").stream().mapToLong(t -> t).sum() / resultMap.get("Custom").size());

//        long sum = b.stream().mapToInt(e -> e.intValue()).sum();
//        System.out.println("scanner:" + b.stream().filter(bb -> bb).count());
//        System.out.println("custom:" + b.stream().filter(bb -> !bb).count());
        Scanner sc = new Scanner(new StringReader("1009"));
//        long t1 = System.nanoTime();
//        if(sc.hasNextInt()) sc.nextInt();
//        long t2 = System.nanoTime();
//        System.out.println(t2 - t1);
//        InputUtil.nextInt();


        boolean flag = false;
        Scanner scanner = new Scanner(System.in);                               // 입력을 받기 위한 스캐너 할당

        System.out.println("[ 학생 관리 프로그램 실행 ]");                          // UI 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(flag){                                                            // 프로그램 시작
            MainView.getInstance().run();                                       // 입력을 받기 위한 가이드 UI 출력
            System.out.print("입력: ");                                          // 해당 단락에서 입력을 받도록 유도
            int cmd = 0;
            try {
                cmd = InputUtil.nextInt();
//                cmd = Integer.parseInt( scanner.nextLine());                                    // 사용자가 입력을 한 후, 키 입력(enter)으로 입력한 데이터를 전송

//                String input = br.readLine();
//                input.split(", ");
//                input.split(",");
//                input.split(" ");
//                String input2 = input.trim();       // 양 옆에 공백 제거
//
//                String[] s = "10,20,,30".split(",");
//                System.out.println(Arrays.toString(s));
//
//                StringBuilder stringBuilder = new StringBuilder();
//
//
//                for(int i =0 ; i < input.length(); i++){
//                    if(input2.charAt(i) > 47 && input.charAt(i) < 58){
//                        stringBuilder.append(input2.charAt(i));
//                    }
//                    else{
//                        stringBuilder.append(",");
//                    }
//                }
////
//                System.out.println(stringBuilder);
//                String[] splitStr= stringBuilder.toString().split(",");
////                List<String> strList = Arrays.stream(splitStr).filter(str -> !str.isEmpty()).toList();
//                List<Integer> strList = Arrays.stream(splitStr).filter(str -> !str.isEmpty()).map(Integer::parseInt).toList();      // Int형으로 변환하기
//                System.out.println(strList);


            }catch (NumberFormatException e){
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
            }
//            List<Integer> ints = InputUtil.nextInts();
//            cmd = ints.get(0);

            if(1 == (cmd)){                                                // 1에 해당하는 기능 수행
                MainView.getInstance().AddStudentGuid();

            }else if(2 == (cmd)){                                          // 2에 해당하는 기능 수행

            }else if(3 == (cmd)){                                          // 3에 해당하는 기능 수행

            }else if(4 == (cmd)){                                          // 4에 해당하는 기능 수행

            }else if(5 == (cmd)){                                          // 5에 해당하는 기능 수행

            }else if(6 == (cmd)){                                          // 6에 해당하는 기능 수행 (프로그램 시퀸스 종료)
                flag     = false;
                continue;
            }else {                                                             // 이외의 번호를 입력했을 대 출력되는 오류
                System.out.println("다시 입력하세요.");
            }
        }

        System.out.println("[ 학생 관리 프로그램 종료 ]");
    }
}
