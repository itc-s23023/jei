//s23023
//StringBuilderクラスを使って与えられて引数を連結し、表示する課題実行の際は引数を受け付けるよう設計

import java.lang.StringBuilder;

public class d49Q6kadai01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
        }
        System.err.println(sb.toString());
    }
}
