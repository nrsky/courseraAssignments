/**
 * Created by anna on 1/10/17.
 */
public class Part1 {
    public String findSimpleGene (String dna){

        String result="";

        int startIndex = dna.indexOf("ATG");
        if(startIndex== -1){
            return " ";
        }

        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if(stopIndex==-1){
            return " ";
        }
        result= dna.substring(startIndex,stopIndex+3);
        if(result.length()%3==0){
            return result;
        }
        if(result.length()%3>0){
            return "";
        }
        if(result.length()%3<0){
            return "";
        }
        return result;

    }

    public void testSimpleGene(){
        String dna = "AGTCTACGAAGTAATCG";
        System.out.println("DNA strand is "+ dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);

        dna = "GATCATGAAGCATTCGCC";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);

        dna = "TGTCATGCAATGCCGATAACTA";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);

        dna = "CATATGTCGAATTGACTAAGACCTG";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);

        dna = "AGTCTACGAAGTCAATC";
        System.out.println("DNA strand is "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);
    }
}
