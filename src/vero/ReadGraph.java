package vero;

import java.io.FileReader;
import java.util.Scanner;

class ReadGraph {
    private static Scanner reader;

    ReadGraph() {
        read();
    }

    static int[][] read() {
        try {
            reader = new Scanner(new FileReader("F:\\Users\\vale3\\Documents\\GitHub\\JPacman\\Graph"));
        }catch(Exception e){
            System.out.println(e);
        }
        String[] line;
        int[][] path = new int[31][28];
        System.out.println();

            for (int i = 0; i < 31; i++) {
                line = reader.nextLine().split(",");
                for (int j = 0; j < 28; j++) {
                    System.out.println();
                    path[i][j] = Integer.parseInt(line[j]);
                }
            }
        return path;
    }
}
