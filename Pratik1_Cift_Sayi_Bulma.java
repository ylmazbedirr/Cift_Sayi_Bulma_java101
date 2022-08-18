import java.util.Scanner;

public class Pratik1_Cift_Sayi_Bulma {
    public static void main(String[] args) {

        int k, toplam = 0, ort, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        k = input.nextInt();


        for(int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){

                toplam += i;
                sayac++;
            }
        }

        ort = toplam / sayac;
        System.out.println("ortalama :" + ort);

    }
}
