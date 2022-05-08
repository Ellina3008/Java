package Main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	
        Random r = new Random();
        int n = 10;
        int[] mass = new int[n];
  
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(10);
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
        
        for(int i = n-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        int newN = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mass[j] == mass[i]) {
                    count++;
                    break;
                }
            }
        }
        newN = n - count;
        int[] massNew = new int[newN];
        massNew[0]=mass[0];
        int index = 0;
        for (int i = 0; i < n-1; i++) {
            if(mass[i]!=mass[i+1]){
                index++;
                massNew[index]=mass[i+1];
            }
        }
        System.out.println();
        System.out.print("Массив без повторений: ");
        for (int i = 0; i < newN; i++) {
            System.out.print(massNew[i] + " ");
        }
    }
}