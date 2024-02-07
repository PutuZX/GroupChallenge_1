import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        menuPage();
    }

    public static void hitungGanjil() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        boolean textFound = false;
        String names = input.nextLine();
        String name[] = names.split(" ");
        for (int i = 0; i < name.length; i++) {
            String huruf = name[i];
            int penampung = (name[i].length());
            if (penampung % 2 == 1) {
                System.out.print(name[i] + " ");
                textFound = true;
            }
        }
        if(textFound){
            reuseQuestion('4');
        } else{
            System.out.println("Text not found!");
            reuseQuestion('4');
        }
    }

    public static void reuseQuestion(char service){
        Scanner input = new Scanner(System.in);
        char answer;
        System.out.println("\nPlease Type 'Y' to use again!");
        char textInput = input.next().charAt(0);
        answer = Character.toLowerCase(textInput);
        if(answer == 'y'){
            switch (service){
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    hitungGanjil();
                    break;
            }
        } else{
            menuPage();
        }
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
                hitungGanjil();
                break;
            case 'X':
                System.out.println("\n========== Thank you for using our service! ==========");
                break;
            default:
                System.out.println("\n========== Wrong input! Please try again! =========\n");
                menuPage();
        }
    }
}