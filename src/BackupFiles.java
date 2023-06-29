import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class BackupFiles {
    public static void main(String[] args) {
        String sourceDirectory = "path/to/source/directory";
        String backupDirectory = "./backup";

        try {
            createBackup(sourceDirectory, backupDirectory);
            System.out.println("Резервная копия файлов успешно создана.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании резервной копии: " + e.getMessage());
        }
    }

    public static void createBackup(String sourceDirectory, String backupDirectory) throws IOException {
        File sourceDir = new File(sourceDirectory);
        File backupDir = new File(backupDirectory);

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = sourceDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    File backupFile = new File(backupDir.getAbsolutePath() + File.separator + file.getName());
                    Files.copy(file.toPath(), backupFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }
}
