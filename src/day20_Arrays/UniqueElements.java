package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (int j = 0; j < words.length; j++) { //ovo je nasao drugo ponavljamo da vidimo drgi karakter

        String element = words [j];
        int frequency = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(element)){  //da bi nasili unikatni moramo sve elemente da cekiramo ,ova formula je da prvo nadjemo jedan element pa onda svaki
                frequency++;                           //koliko prva rec se nalazi u array,pa druga samo promenimo inex u word[]
            }                                          //da nadjemo drgi element drugi loop sa j npr. ponovimo istu formulu


                                                      //unkatni cemo naci kada uporedimo frequany na kraju sa brojem,ako je podjednak sa array

        }
        if (frequency == 1){
        System.out.println(element);
    }
}}}
