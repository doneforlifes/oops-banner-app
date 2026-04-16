public class Banner {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                if (c == 'O') System.out.print(o[i] + " ");
                else if (c == 'P') System.out.print(p[i] + " ");
                else if (c == 'S') System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }

    static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}
