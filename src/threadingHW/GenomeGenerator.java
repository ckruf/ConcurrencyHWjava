package threadingHW;
import java.util.Random;

public class GenomeGenerator {
	
	public static void main(String[] args) {
		String[] genomes = generateMultipleSequences(100, 10);
		printGenomes(genomes, "");
	}
	
	
	
	public static String generateSingleSequence(int length) {
		Random rand = new Random();
		StringBuilder builder = new StringBuilder();
		String genomes = "ATGC";
		int genomeCount = genomes.length();
		while (builder.length() < length) {
			int index = rand.nextInt(4);
			builder.append(genomes.charAt(index));
		}
		String genSequence = builder.toString();
		return genSequence;
		
	}
	
	public static String[] generateMultipleSequences(int count, int length) {
		String[] genomes = new String[count];
		for (int i = 0; i < count; i++) {
			genomes[i] = generateSingleSequence(length);
		}
		return genomes;
	}
	
	public static void printGenomes(String[] genomes, String threadName) {
		int length = genomes.length;
		for (int i = 0; i < length; i++)
		{
			System.out.println("From " + threadName + " genome " + (i+1) + ": " + genomes[i]);
		}
	}
	
}
