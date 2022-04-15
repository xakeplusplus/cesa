package me.xakeplusplus.cesa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enterFilename = new Scanner(System.in);
        System.out.println("\nEnter the name of the file containing your scores: ");
        String filenamex = enterFilename.nextLine();
        byFile(filenamex);

    }

    public static void byFile(String filename) {
        try {
            int i, total = 0, linecount = 0;
            List<Integer> scorelist = new ArrayList<>();

            File file = new File(filename);

            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                int data = readFile.nextInt();
                scorelist.add(data);
                linecount += 1;

            }

            for (i=0; i<linecount; i++) {
                total += scorelist.get(i);
            }

            System.out.println("\nAverage: " + total/(float)linecount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
