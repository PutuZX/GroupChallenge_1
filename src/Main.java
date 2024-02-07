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
                    findMinMax();
                    break;
                case '2':
                    inputMinTerbesar();
                    break;
                case '3':
                    cutBamboo();
                    break;
                case '4':
                    hitungGanjil();
                    break;
            }
        } else{
            menuPage();
        }
    }

    public static void inputMinTerbesar(){
        System.out.println("Input number with comma:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String numbersString = a;
        int[] numbersArray = convertStringToIntArray(numbersString);

        int lostMinus = minTerbesar(numbersArray);
        if(lostMinus == 0){
            System.out.println("Number not found!");
        } else{
            System.out.println("Number: " + lostMinus);
        }
        reuseQuestion('2');
    }

    public static void findMinMax() {
        System.out.println("Input number with comma:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        String numbersString = a;
        int[] numbersArray = convertStringToIntArray(numbersString);

        System.out.println(minMax(numbersArray));
        reuseQuestion('1');
    }

    public static void cutBamboo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bambu serta panjang ruasnya : ");
        String batang = input.nextLine();
        System.out.print("Masukkan silus pemotongan ruas bambu : ");
        int potong = input.nextInt();

        String ruas[] = batang.split(",");

        System.out.println(ruas[0]);
        System.out.println(potong);

        for(int k=0; k<potong+1; k++){
            if(k==0){
                System.out.println("Initials");
                for(int i=0; i<ruas.length; i++){
                    System.out.print("|");
                    for(int j=0; j<Integer.parseInt(ruas[i])-k; j++){
                        System.out.print("-");
                    }
                    System.out.println("");
                }
            }else if(k>0){
                System.out.println("Cycle Cuts "+k);
                for(int i=0; i<ruas.length; i++){
                    System.out.print("|");
                    for(int j=0; j<Integer.parseInt(ruas[i])-k; j++){
                        System.out.print("-");
                    }
                    System.out.println("");
                }
            }
        }
        reuseQuestion('3');
    }

    public static int minTerbesar(int[] arr){
        int miner = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<miner){
                if((arr[i]-arr[i-1])==-2){
                    miner = arr[i-1]-1;
                }
            }
        }
        return miner;
    }

    public static String minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return "max: " + max + " min: " + min;
    }

    public static int[] convertStringToIntArray(String numbersString) {
        String[] numbersStringArray = numbersString.split(",");
        int[] numbersArray = new int[numbersStringArray.length];

        for (int i = 0; i < numbersStringArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numbersStringArray[i]);
        }

        return numbersArray;
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
                findMinMax();
                break;
            case '2':
                inputMinTerbesar();
                break;
            case '3':
                cutBamboo();
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