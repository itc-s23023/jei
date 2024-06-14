//s23023
//double型の数値を一つだけ受け取るように改造

public class d49Q26kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("double値は1つ");
            return;
        }

        try {
            double number = Double.parseDouble(args[0]);
            
            d49Q26kadai instance = new d49Q26kadai();
            instance.show(number);
        } catch (NumberFormatException e) {
            System.out.println("無効なdouble");
        }
    }

    void show(double n) {
        System.out.print("value is " + n);
    }
}

