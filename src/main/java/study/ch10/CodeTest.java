//package study.ch10;
//
//import java.util.HashMap;
//
//public class CodeTest {
//    class Key
//    {
//        private int x;
//        private int y;
//         public Key(int x, int y) {this.x = x; this.y = y;}
//        public void SetValue(int x, int y)
//        {
//            this.x = x;
//            this.y = y;
//        }
//        public int getX(){
//            return x;
//        }
//        public int getY()
//        {
//            return y;
//        }
//    }
//
//    public String solution(int[] numbers, String hand) {
//        String answer = "";
//        HashMap<String, Key> key = new HashMap<String, Key>();
//        key.put("1", new Key(0, 0));
//        key.put("2", new Key(0, 1));
//        key.put("3", new Key(0, 2));
//        key.put("4", new Key(1, 0));
//        key.put("5", new Key(1, 1));
//        key.put("6", new Key(1, 2));
//        key.put("7", new Key(2, 0));
//        key.put("8", new Key(2, 1));
//        key.put("9", new Key(2, 2));
//        key.put("*", new Key(3, 0));
//        key.put("0", new Key(3, 1));
//        key.put("#", new Key(3, 2));
//
//        int L = 0, R = 0;
//        for (int num : numbers)
//        {
//            switch (num)
//            {
//                case 1:
//                case 4:
//                case 7:
//                    answer += "L";
//                    L = num;
//                    break;
//                case 3:
//                case 6:
//                case 9:
//                    answer += "R";
//                    R = num;
//                    break;
//                case 2:
//                case 5:
//                case 8:
//                case 0:
//                    if()
//                        break;
//            }
//        }
//
//        return answer;
//    }
//}
package study.ch10;


public class CodeTest
{
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lHand = 0, rHand = 0;
        for(int num : numbers)
        {
            switch(num)
            {
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    lHand = num;
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    // 여기서 좌표에 대한 개념을 삽입해야함.
                    int posX = (num - 1) / 3;
                    int posY = (num - 1) % 3;
                    int lposX = (lHand - 1) / 3;
                    int lposY = (lHand - 1) % 3;
                    int rposX = (rHand - 1) / 3;
                    int rposY = (rHand - 1) % 3;
Math
                    int pos = posX + posY;
                    int l = lposX + lposY;
                    int r = rposX + rposY;

                    if(pos - l > pos - r) {
                        rHand = num;
                        answer += "R";
                    }
                    if(pos - l < pos - r) {
                        lHand = num;
                        answer += "L";
                    }
                    if(pos - l == pos - r) {
                        if(hand.equals("right"))
                        {
                            rHand = num;
                            answer += "R";
                        }
                        else
                        {
                            lHand = num;
                            answer += "L";

                        }
                    }
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    rHand = num;
                    break;
            }
        }
        return answer;
}