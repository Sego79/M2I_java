package com.biotech.process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() {
        ArrayList<String> result = new ArrayList<String>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close(); //Ici on ferme le programme pr éviter fuite mémoire
            } catch (ExceptionBiotech e) {
                e.getMessage(); //ajout d'une exception personnalisée
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

}
