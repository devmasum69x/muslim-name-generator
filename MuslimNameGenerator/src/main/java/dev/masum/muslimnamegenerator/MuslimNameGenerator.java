package dev.masum.muslimnamegenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MuslimNameGenerator {
    private static final String[] MALE_NAMES = {
            "Muhammad", "Ahmad", "Abdullah", "Omar", "Ali", "Hassan", "Hussein", "Ibrahim",
            "Yusuf", "Ismail", "Hamza", "Usman", "Zaid", "Bilal", "Khalid", "Tariq",
            "Rashid", "Saad", "Zubair", "Imran", "Malik", "Nasir", "Jamal", "Karim"
    };

    private static final String[] FEMALE_NAMES = {
            "Fatima", "Aisha", "Khadija", "Maryam", "Zainab", "Safiya", "Ruqayya", "Asma",
            "Hafsa", "Lubna", "Sumayya", "Noor", "Amira", "Layla", "Sara", "Hana",
            "Zahra", "Nasreen", "Samira", "Rania", "Nadia", "Yasmin", "Leila", "Salma"
    };

    private final Random random;

    public MuslimNameGenerator() {
        this.random = new Random();
    }

    public MuslimNameGenerator(long seed) {
        this.random = new Random(seed);
    }

    /**
     * Generate a random Muslim male name
     * @return A random male name
     */
    public String generateMaleName() {
        return MALE_NAMES[random.nextInt(MALE_NAMES.length)];
    }

    /**
     * Generate a random Muslim female name
     * @return A random female name
     */
    public String generateFemaleName() {
        return FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)];
    }

    /**
     * Generate multiple random male names
     * @param count Number of names to generate
     * @return List of male names
     */
    public List<String> generateMaleNames(int count) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            names.add(generateMaleName());
        }
        return names;
    }

    /**
     * Generate multiple random female names
     * @param count Number of names to generate
     * @return List of female names
     */
    public List<String> generateFemaleNames(int count) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            names.add(generateFemaleName());
        }
        return names;
    }
}
