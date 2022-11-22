import java.util.*;

public class MergeSort {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        menu();
    }
    private static void menu(){
        System.out.println(">---------------------------------<\nMergeSort Algorithn\n\n\t1. Merge-Sort\n\t2. Exit\n\n>---------------------------------<");

        System.out.print("\nChoose Option: ");
        int ui = sc.nextInt();

        if(ui == 1){
            print();
        }else if (ui == 2){
            System.out.println(">---------------------------------<\nThank you for using the program \n>---------------------------------<");
            sc.close();
        }
    }
    private static void print(){

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(0, 200);
        }

        System.out.println("Generating Random Unordered Number: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nSorted: ");
        printArray(numbers);

        System.out.println();
        menu();
    }
    private static void mergeSort(int[] inputArray){

        int inputLength = inputArray.length;

        //start of recursion
        if(inputLength <= 1){
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge
        merge(inputArray, leftHalf, rightHalf);
    }
    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
