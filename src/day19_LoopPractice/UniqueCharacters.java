/*
        String str = "aabccdeef"; //prvo moramo naci frequancy od prvog karaktera
        String results = ""; //bdf          // da bi videli da li unique da ga uporedimo sa svakim karakterom iz stringa posebnoString results =




           char ch = 'a';
           int count = 0; // pokacuje frequency od karaktera i pokazacemo ga u ovom ch
                         // uporedjuje karaktere sto je outer loop prikazao sa svakim carakterom posebno

        //iner loop
        for (int i = 0; i <str.length(); i++) {                  //ako se 'a' mecuje sa karakterom od stringa moramo da vidimo koliko puta
            char each = str.charAt(i);
            if (ch == each) {
                count++;

                for (int j = 0; j < str.length(); j++) {//outer loop

                    char ch1 = str.charAt(j);
                    int count1 = 0; // represents the frequency of the ch

                    for (int k = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                        char each1 = str.charAt(i); // each character of str
                        if (ch == each) {
                            count++;
                        }
                    }}}


                /* if (count == 1){
                    results += ch; // ako je frequany je jedan onda je karakter unique

                 */


