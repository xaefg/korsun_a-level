
public class Task2 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = triangle[i].length; j > 0; j--) {
                System.out.print(triangle[i][j - 1] + " ");
            }
            System.out.println();

        }
    }

}
/* помилка була на 20 рядку і полягала у тому, що індекс j мав значення 1, а в масиві triangle[0] лише
   один елемент і його індекс 0. я просто трохи змінив цикл і для виводу поставив [j-1], таким чином
   індекс j не вийде за межі масиву
   знайшов помилку без дебагера через вивід консолі, яка показала мені проблему на 21 рядку
   але заради достовірності подивився і через дебагер */
