import java.io.IOException;

import ca.pfv.spmf.algorithms.frequentpatterns.apriori.AlgoApriori;
import ca.pfv.spmf.algorithms.frequentpatterns.fpgrowth.AlgoFPGrowth;


public class FirstPatternMiner {

	public static void main(String[] args) throws IOException{
		String input_file = "F:\\desktop\\ifn645\\dataset\\Q2_input_itemNames.txt";
		String output_fp_Apriori ="F:\\desktop\\ifn645\\dataset\\Q2_FP_Apriori.txt";
		String output_fp_Fpt = "F:\\desktop\\ifn645\\dataset\\Q2_FP_Fpt.txt";

		double minsup = 0.4;
		
		AlgoApriori algo_Apri = new AlgoApriori();
		AlgoFPGrowth algo_FPGrowth = new AlgoFPGrowth();

		algo_Apri.setMaximumPatternLength(3);
		algo_FPGrowth.setMaximumPatternLength(3);

		algo_FPGrowth.setMinimumPatternLength(1);
		
		algo_Apri.runAlgorithm(minsup, input_file, output_fp_Apriori); 
		algo_Apri.printStats();
					
		algo_FPGrowth.runAlgorithm(input_file, output_fp_Fpt, minsup);
		algo_FPGrowth.printStats();

	}

}
