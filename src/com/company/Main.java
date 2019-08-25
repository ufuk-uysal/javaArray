package com.company;

public class Main {

    public static void main(String[] args) {
	/* write your code
        String ogrenci1 ="Engin";
        int childrenCount =4;
        String[] children = new String[childrenCount];
        children[0] ="ufuk";
        children[1] ="osman";
        children[2] ="resul";
        for ( String item: children) {
            if(item==null){
                item="atama yapılmamış alan";
            }
            System.out.println(item);
        }
        */
	/*TODO: mylist Event start Op
        double[] myList = {1.2, 1.3, 4.3, 5.6, 6.3};
        double totalCount = 0;
        double maxNumber = 0;
        for (double item : myList) {
            if (maxNumber < item) {
                maxNumber = item;
            }
            totalCount += item;
            System.out.println(item);
        }
        System.out.println("*********************");
        System.out.println("Listenin Toplam degeri = " + totalCount);
        System.out.println("*********************");
        System.out.println("Max Number  = " + maxNumber);

	 */
	/* TODO: 2 boyutlu arraylar deneme sacma sapan bir sey oldu
        String[][] Cities = new String[3][3];
        Cities[0][0] = "İstanbul";
        Cities[0][1] = "Bursa";
        Cities[0][2] = "Balıkesir";

        Cities[1][0] = "ankara";
        Cities[1][1] = "eskişehir";
        Cities[1][2] = "sivas";

        Cities[2][0] = "diyarbakır";
        Cities[2][1] = "van";
        Cities[2][2] = "tunceli";
        String[] bolgeler = {"marmara","ic","güneydoğu"};
        int bolgeCount = 0;
        for (String[] item : Cities) {
          if(bolgeCount ==0){
              System.out.println(bolgeler[0]);
          }
          else if(bolgeCount==1){
              System.out.println(bolgeler[1]);
          }
          else{
              System.out.println(bolgeler[2]);

          }

            for (String city : item) {
                System.out.println("sehir = " + city);
            }
            bolgeCount++;
        }

	 */
        String mesaj = "Bugün hava Cok güzel.";
        System.out.println(mesaj);
        System.out.println(mesaj.length());
        System.out.println("5. eleman " + mesaj.charAt(4));
        mesaj = mesaj.concat("Yaşasın");
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));
        char[] karakter = new char[5];
        mesaj.getChars(0, 5, karakter, 0);
        System.out.println(karakter);
        System.out.println(mesaj);

        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));

    }
}
