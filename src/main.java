import java.util.Locale;

public class main {

    public static void main(String[] args){

     first arraysMIN = new first();
        arraysMIN.getNum(0);
        arraysMIN.getArr(new int[] {4, 8, 15, 16, 23, 42});

     first arraysMAX = new first();
     arraysMAX.getNum(0);
     arraysMAX.getArr(new int[] {19, 17, 2, 9});

        for (int i = 9; i >= 0; i--){
            for (int j = 9; j > i; j--){
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            for (int j = 0; j > i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

