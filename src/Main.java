import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] field = readFieldFromFile("field.bin");

        if (field != null) {
            drawField(field);
        }
    }

    public static int[] readFieldFromFile(String fileName) {
        int[] field = new int[9];

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int value;
            int index = 0;

            while ((value = fis.read()) != -1) {
                for (int i = 0; i < 8; i += 2) {
                    int fieldValue = (value >> i) & 3;
                    field[index++] = fieldValue;
                    if (index >= 9) {
                        break;
                    }
                }
            }

            return field;
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
    }

    public static void drawField(int[] field) {
        System.out.println("Поле игры:");

        for (int i = 0; i < field.length; i++) {
            char symbol = switch (field[i]) {
                case 1 -> 'X';
                case 2 -> 'O';
                case 3 -> '.';
                default -> ' ';
            };

            System.out.print(symbol);

            if ((i + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
