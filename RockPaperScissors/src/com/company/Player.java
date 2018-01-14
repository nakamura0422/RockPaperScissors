package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * プレイヤークラス
 * <p>
 * プレイヤーが何を持ってて何をするのかを書くよ
 */
public class Player {

    /**
     * グーチョキパーからランダムで手を返すよ
     *
     * @return 選択された手
     */
    public String randomChoice() {
        // 0か1か2になるよ
        return convertHand(Integer.toString(new Random().nextInt(3)));
    }

    /**
     * ユーザに入力させて手を返すよ
     *
     * @return 選択された手
     */
    public String choiceHand() {
        return convertHand(new Scanner(System.in).next());
    }

    /**
     * 入力された数字を手に変換する
     *
     * @param beforeHand 数字の手
     * @return
     */
    private String convertHand(String beforeHand) {

        /**
         * 定数
         * 頭に"m"つけなくていいと思うよ(賛否両論)
         * 定数の命名規則は全部大文字で"_"つながりだよ
         */
        final String ROOK = "グー";
        final String PAPER = "パー";
        final String SCISSORS = "チー";

        /**
         * グー チー パー はintで持ってもStringで持ってもいいよ
         * Stringの方がわかりやすいかもしれないね
         */
        //    final int ROOK = "1";
        //    final int PAPER = "2";
        //    final int SCISSORS = "3";


        if (beforeHand.equals("0")) {
            return ROOK;
        } else if (beforeHand.equals("1")) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }


}
