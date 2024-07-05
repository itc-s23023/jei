//s23023
//Conditionの全要素出力

enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
    public static void main(String[] args) {
        for (Condition condition : Condition.values()) {
            System.out.println(condition);
        }
    }
}

