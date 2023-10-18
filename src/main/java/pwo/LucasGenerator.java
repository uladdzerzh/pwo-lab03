/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 *
 * @author student
 */
public class LucasGenerator {
        public static void main(String[] args) {
        int n = 100; // Liczba wyrazów do wygenerowania
        String fileName = "lucasseq100.txt"; // Nazwa pliku wynikowego

        // Inicjalizacja ciągu Lucasa
        BigDecimal lucas[] = new BigDecimal[n];
        lucas[0] = new BigDecimal(2);
        lucas[1] = new BigDecimal(1);

        for (int i = 2; i < n; i++) {
            lucas[i] = lucas[i - 1].add(lucas[i - 2]);
        }

        // Zapisz ciąg Lucasa do pliku
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < n; i++) {
                writer.write(lucas[i].toString() + "\n");
            }
            System.out.println("Wynik zapisany do pliku: " + fileName);
        } catch (IOException ex) {
            System.out.println("Błąd podczas zapisywania do pliku.");
        }
    }
}
