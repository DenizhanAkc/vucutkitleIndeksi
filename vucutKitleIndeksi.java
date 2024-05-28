import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {

                int kg;
                Scanner weight = new Scanner(System.in);
                        System.out.print("kg cinsinden kilo : " );
            kg = weight.nextInt();

                double boy;
                Scanner height = new Scanner(System.in);
                        System.out.print("m cinsinden boy uzunlugu : " );
            boy = height.nextDouble();
                double indeks = kg / (boy*boy);
                        System.out.print("Vucut kitle indeksi : " +indeks);



    }
}