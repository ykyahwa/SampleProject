package com.tistory.ykyh.kotlin31dayssample;

import org.junit.Test;

public class lotto {

    @Test
    public void lotto6() {
        for (int i = 0; i < 5; i++) {
            lotto();
        }
    }

    public void lotto(){

        int[] score = new int[45]; //


        for(int i=0 ; i<score.length; i++) {

            score[i] = i+1; //1~45개의 숫자 생성

        }


        for(int i=0 ; i<150; i++) {

            int temp;

            int n = (int)(Math.random()* 45);

            temp = score[0];

            score[0] = score[n];

            score[n] = temp; // 0~44의 배열 각 자리수를 무작위로 바꿈

        }




        System.out.print("Lotto: ");


        for(int i=0 ; i<6; i++){

            System.out.print(score[i]+" "); // 무작위로 바뀐 배열 0~5까지 총 6개의 숫자 뽑기

        }

        System.out.println();

    }

}
