package com.company;

/**
 * ジャッジクラス
 * <p>
 * 実際のじゃんけんでは審判は居ないけど勝敗判定とかをする人だよ
 * 書いている人の設計能力はあまりないからあれだけど
 * 勝敗判定はMainクラスかプレイヤークラスにやらせてもいいと思うよ
 * <p>
 * ゲームマネージャーみたいなクラスは太りやすいので設計時に気を付けよう
 * 設計能力はおいおい身に着けるしかないから、自分がメンターになるときはいいアドバイスはできないかも。。。
 */
public class Judge {

    /**
     * 勝敗
     */
    final String WIN = "勝ち";
    final String LOSS = "負け";
    final String EVEN = "あいこ";

    /**
     * コンソールにそれっぽいのを出す
     */
    public void startCall() {
        System.out.println("");
        System.out.println("これからじゃんけんを始めるよ");
        System.out.println("最初はグー");
        System.out.println("じゃんけん…");
        System.out.println("-----------------------------");
        System.out.println("ぐー:0 パー:1 チョキ:それ以外");
        System.out.println("-----------------------------");
    }

    /**
     * 勝敗判定をするよ
     * <p>
     * 勝ち負け表を作ると条件が見えやすいよ
     *
     * @param player1Hand
     * @param player2Hand
     * @return player1Hand が勝ったか負けたか
     */
    public String winOrLossDecision(String player1Hand, String player2Hand) {

        final String ROOK = "グー";
        final String PAPER = "パー";
        final String SCISSORS = "チー";

        /**
         * 勝敗判定について
         *
         * 　　　　グー   チョキ　　パー
         * グー　　あいこ  勝ち　 　負け
         * チョキ　負け　　あいこ　 勝ち
         * パー　　勝ち　  負け　　あいこ
         *
         */

        // 同じ手ならあいこ
        if (player1Hand.equals(player2Hand)) {
            return EVEN;
        } else if (player1Hand.equals(ROOK) && player2Hand.equals(SCISSORS) || player1Hand.equals(SCISSORS) && player2Hand.equals(PAPER) || player1Hand.equals(PAPER) && player2Hand.equals(ROOK)) {
            // 勝ちの場合
            return WIN;
        } else {
            // 負けの場合
            return LOSS;
        }
    }

    /**
     * コンソールにそれっぽいのを出す
     */
    public void showGame(String player1Hand, String player2Hand) {
        System.out.println("君の手は" + player1Hand);
        System.out.println("player2の手は" + player2Hand);
        System.out.println("なので..." + winOrLossDecision(player1Hand, player2Hand));
    }
}

