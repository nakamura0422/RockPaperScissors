package com.company;

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
        // judgeに手を渡す
        judge.showGame(new Player().choiceHand(), new Player().randomChoice());
    }
}
