package Java.DataStructure;
/**
 * Created by ciaohi on 2019/10/21 21:46
 */
//扑克牌类
public class Poker {
    private static String[] suites = {"黑桃", "红桃", "梅花", "方块"};
    private static int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private Card[] cards;
    //内部卡片类一张扑克
    public class Card {
        private String suite; // 花色
        private int face; // 点数
        public Card(String suite, int face) {
            this.suite = suite;
            this.face = face;
        }
        @Override
        public String toString() {
            String faceStr = "";
            switch (face) {
                case 1:
                    faceStr = "A";
                    break;
                case 11:
                    faceStr = "J";
                    break;
                case 12:
                    faceStr = "Q";
                    break;
                case 13:
                    faceStr = "K";
                    break;
                default:
                    faceStr = String.valueOf(face);
            }
            return suite + faceStr;
        }
    }
    //构造扑克牌
    public Poker() {
        cards = new Card[52];
        for (int i = 0; i < suites.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                cards[i * 13 + j] = new Card(suites[i], faces[j]);
            }
        }
    }
    //洗牌 （随机乱序）
    public void shuffle() {
        for (int i = 0, len = cards.length; i < len; i++) {
            int index = (int) (Math.random() * len);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }
    //发牌 index(发牌的位置)
    public Card deal(int index) {
        return cards[index];
    }

    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.shuffle(); // 洗牌
        Poker.Card c1 = poker.deal(0); // 发第一张牌
        // 对于非静态内部类Card
        // 只有通过其外部类Poker对象才能创建Card对象
        Poker.Card c2 = poker.new Card("红心", 1); // 自己创建一张牌
        System.out.println(c1); // 洗牌后的第一张
        System.out.println(c2); // 打印: 红心A
    }

}