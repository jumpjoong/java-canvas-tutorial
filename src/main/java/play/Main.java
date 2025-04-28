package play;

import base.MyCanvas;
import base.MyFrame;

public class Main {
    public static void main(String[] args) {

        /*
        미완의 사각형만들기 그림판을 완성시켜라
        완성기준
        1. 좌표가 틀어져있다 -> 왜 틀어져있는지 분석
         -> 보정하기
        2. 사각형이 생기는 과정을 묘사해라
        3. 버튼추가하기 [사각혁 선택, 선그리기 버튼, 초기화 하기 버튼]
         */

        new MyFrame(new MyCanvas()).clear();
    }
}