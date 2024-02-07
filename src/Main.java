import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        menuPage();
    }

    public static void menuPage(){
        Scanner input = new Scanner(System.in);
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Selamat Datang di Program Team XX                  |");
        System.out.println("| 1. Mencari Nilai Terkecil dan Terbesar             |");
        System.out.println("| 2. Mencari Elemen/Nilai Minus Terbesar yang Hilang |");
        System.out.println("| 3. Cut The Bamboo                                  |");
        System.out.println("| 4. Mencari Nama yang Ganjil                        |");
        System.out.println("| X. Keluar                                          |");
        System.out.println("+----------------------------------------------------+");
        System.out.print("Pilih Opsi Menu: ");
        char inputValue = input.next().charAt(0);
        switch (inputValue){
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case 'X':
                break;
            default:
                System.out.println("\n========== Wrong input! Please try again! =========\n");
                menuPage();
        }
    }
}