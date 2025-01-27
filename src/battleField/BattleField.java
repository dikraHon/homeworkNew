package battleField;

public class BattleField {

    private final String[][] border = new String[6][20];

    public void setBorder(String hero, String hero2, int x, int y, int x2, int y2) {
        for (int i = 0; i < border.length; i++) {
            for (int j = 0; j < border[i].length; j++) {
                border[i][j] = " ";
                if (i == 0 || i == 5 || j == 0 || j == 19) {
                    border[i][j] = "*";
                }
            }
        }
        border[x][y] = hero;
        border[x2][y2] = hero2;
        for (String[] strings : border) {
            System.out.println(String.join(" ", strings));
        }
    }

}
