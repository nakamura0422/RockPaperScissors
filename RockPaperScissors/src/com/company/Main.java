package com.company;

import java.util.Scanner;

/**
 * メインクラス
 * <p>
 * クラス名は大文字始まりだよ
 * 2単語以上ある場合は "HogehogeFoo" みたいになるよ
 */
public class Main {

    /**
     * メインメソッド
     * <p>
     * メソッド名は動詞で小文字にしようね
     *
     * @param args
     */
    public static void main(String[] args) {
        // ジャッジさんの入場
        Judge judge = new Judge();
        // ジャッジにスタートコールをしてもらう
        judge.startCall();
        // プレイヤーたちの入場です
        Player player1 = new Player();
        Player player2 = new Player();

        // judgeに手を渡す
        judge.showGame(player1.choiceHand(), player2.randomChoice());
    }
}
