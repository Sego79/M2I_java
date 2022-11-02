package com.biotech.process;

import java.io.*;
import java.util.*;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws IOException {

		System.out.println("Entrez le nom du fichier que vous souhaitez lire :");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		//ON RECUPERE LE FICHIER TEXTE QUE L'ON VA LIRE
		BufferedReader reader = new BufferedReader (new FileReader(fileName));
		String line = reader.readLine();

		//On créé une collection clé / valeur. La valeur correspondra au nombre du symptôme
		Map<String, Integer> listSymptomesKeyValue = new HashMap<>();

		while (line != null) {
			if (listSymptomesKeyValue.containsKey(line)) {
				listSymptomesKeyValue.put(line, listSymptomesKeyValue.get(line)+1); //on ajoute 1 à chaque fois qu'on rencontre le symptÖme
			} else {
				listSymptomesKeyValue.put(line, 1); //pour initialiser la première fois qu'on trouve le symptôme
			}
			line = reader.readLine();	// get another symptom
		}
		reader.close(); //on pense à fermer le fichier de lecture

		//ON ENREGISTRE LES INFOS SUR UN SECOND FICHIER TEXTE
		//next generate output
		FileWriter writer = new FileWriter("result.out");

		for(String symptom : listSymptomesKeyValue.keySet()) {
			try {
				writer.write(symptom + " : " + listSymptomesKeyValue.get(symptom) + "\n");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} writer.close(); //on pense à fermer le fichier d'écriture
	}

}
