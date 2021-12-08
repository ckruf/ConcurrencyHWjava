package threadingHW;
import threadingHW.GenomeGenerator;

public class FirstThread implements Runnable{
	@Override
	public void run() {
		String[] genomes = GenomeGenerator.generateMultipleSequences(25, 10);
		GenomeGenerator.printGenomes(genomes, "thread 1");
	}
}
