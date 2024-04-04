import util.World;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application {

    public static World w;
    public static BufferedReader reader;
    public static BufferedWriter writer;

    public static boolean isend = false;

    public static void runCommand(String command) throws Exception {
        System.out.println(command);
        switch(command) {
            case "stop":
                isend = true;
                break;
            case "animalcount":
                writer.write("동물 수 : " + w.getAnimalsCount() + "/" + w.getAnimalsMax());
                writer.flush();
                break;
            case "animaldata":
                break;
            case "help":
                writer.write("stop - 프로그램 정지\n");
                writer.write("animalcount - 동물 숫자 계산\n");
                writer.write("animaldata - 동물 데이터 계산\n");
                writer.write("help - 도움말");
                writer.flush();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        w = new World(60);
        w.start();
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!isend) {
            String command = reader.readLine();
            runCommand(command);
        }
        w.end();
    }

}
