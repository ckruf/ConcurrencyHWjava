package threadingHW;
import threadingHW.GenomeGenerator;

public class FourthThread implements Runnable{
	@Override
	public void run() {
		String[] genomes = GenomeGenerator.generateMultipleSequences(25, 10);
		GenomeGenerator.printGenomes(genomes, "thread 4");
	}
}
