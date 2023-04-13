package seminar7.Dbase.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import seminar7.Dbase.Dbase;

public class NoteBD implements Dbase<String> {
    private String name;
    private String path;

    public NoteBD(String name) {
        this.name = name;
        try {
            this.path = String.format("seminar7/%s.txt",name);
            File file = new File(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<String> readAll() {
        List<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public void saveAll(List<String> list) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (String line : list) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    

}
