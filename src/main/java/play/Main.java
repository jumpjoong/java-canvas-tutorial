package play;

import base.MyCanvas;
import base.MyFrame;

public class Main {
    public static void main(String[] args) {


//        미완의 사각형만들기 그림판을 완성시켜라
//        완성기준
//        1. 좌표가 틀어져있다 -> 왜 틀어져있는지 분석
//        -> 보정하기
//        1. 기존에는 클릭했을 때의 값 기준으로 X,Y값을 정함 -> 클릭 했을 때와 마우스 뗼 때의 X, Y값을 비교 후 작은 값을 기준으로 X,Y값을 넘김
//        2. 사각형값을 양수로 변환하고 제일 작은 값, 즉 왼쪽 맨 아래 기준으로 사각형 생기게 만듬
//        2. 사각형이 생기는 과정을 묘사해라
//        3. 버튼추가하기 [사각혁 선택, 선그리기 버튼, 초기화 하기 버튼]


        new MyFrame(new MyCanvas()).clear();
    }
}