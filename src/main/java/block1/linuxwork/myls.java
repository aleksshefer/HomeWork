package block1.linuxwork;

import java.io.File;

public class myls {
    public static void main(String[] args) {
        File file = args.length != 0 ? new File(args[0]) : new File(".");
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        } else {
            System.out.println("Directory is empty");
        }
    }
}
