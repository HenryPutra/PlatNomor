import java.util.Scanner;

public class RentMobil {
    public static void main() {
        System.out.println("Plat K = Kudus");
        System.out.println("Plat B = Jakarta");
        System.out.println("Plat AB = Jogja");
        System.out.println("Plat T = Karawang");
        System.out.println("Plat AD = Solo");
        String nomor;
        int nomor1;
        Scanner yui = new Scanner(System.in);
        System.out.println("masukan plat nomor kendaraan :");
        nomor = yui.nextLine();
        int[] numbers={9, 10, 11, 12, 13};
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2==0){
                evenSum += 1;
            } else {
                oddSum += 1;
            }
        }
        System.out.println("Jumlah bilangan ganjil: " + oddSum);
        System.out.println("Jumlah bilangan genap: " + evenSum);
    }

    public static void main(String[] args) {main();}
}



