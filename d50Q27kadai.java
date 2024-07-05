//s23023
//コマンドラインからの入力を受け付けるように変更

public class d50Q27kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Type the character");
            return;
        }

        int control = Integer.parseInt(args[0]);
        String mode;

        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            default:
                mode = "Wind";
                break;
        }

        System.out.println(mode);
    }
}

