import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch{
  public static void main(String[] args){
    int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};
    
    // Task 1 finding value of index provided by the user. 
    
    Scanner scanner = new Scanner(System.in);
    int indexToFind, value = 0;
    int limit = numbers.length-1;
    System.out.print("Which index do you want (0-"+limit+"): ");
    indexToFind = scanner.nextInt();
    for(int i = 0; i < numbers.length; i++){
      if(i == indexToFind){
        value = numbers[i];
      }
    }
    System.out.println("The number is: "+ value);
    
    // Task 2 Swaping the index searched with it's next value;
    
    System.out.println("Let's switch value on index "+indexToFind+"("+numbers[indexToFind]+") and on index "+(indexToFind+1)+"("+numbers[indexToFind+1]+")");
    
    int reserve = numbers[indexToFind];
    numbers[indexToFind] = numbers[indexToFind+1];
    numbers[indexToFind+1] = reserve;

    System.out.println("Now the values changed to index "+indexToFind+"("+numbers[indexToFind]+") and index "+(indexToFind+1)+"("+numbers[indexToFind+1]+")");
    
    // Task 3 - Sorting array in ascending and descending order.
    
    System.out.println("Array Before: "+Arrays.toString(numbers));
    
    // Ascending order
    
    int[] ascending = numbers;
    
    
    for (int i = 0; i < ascending.length - 1; i++) {
      for (int j = 0; j < ascending.length - i - 1; j++) {
        if (ascending[j] > ascending[j + 1]) {
          int temp = ascending[j];
          ascending[j] = ascending[j + 1];
          ascending[j + 1] = temp;
        }
      }
    }
    System.out.println("After Ascending: "+Arrays.toString(ascending));
    
    // Discending order
    
    int[] descending = numbers;
    
    for (int i = 0; i < descending.length - 1; i++) {
      for (int j = 0; j < descending.length - i - 1; j++) {
        if (descending[j] < descending[j + 1]) {
          int temp = descending[j];
          descending[j] = descending[j + 1];
          descending[j + 1] = temp;
        }
      }
    }
    System.out.println("After Discending: "+Arrays.toString(descending));

    // Task 4 - linear search
    
    int[] newNumbers = {2,5,8,3,4,6,10,15,20,1,11};
    System.out.println("Array Before Linear Search: "+Arrays.toString(newNumbers));
    
    System.out.print("Please enter the number are you searching for: ");
    int search = scanner.nextInt();
    boolean found = false;
    int position = 0;
    for(int i = 0; i < newNumbers.length; i++){
      if(search == newNumbers[i]){
        found = true;
        position = i+1;
        break;
      }
    }
    if(found){
      System.out.println(search + " was found and is on position "+position+".");
    }else{
      System.out.println(search + " was not found in the array.");
    }
    
    // Task 5 - Binary search
    Arrays.sort(newNumbers);
    System.out.println("Array Before Binary Search: "+Arrays.toString(newNumbers));

    System.out.print("Please enter the number are you searching for: ");
    search = scanner.nextInt();
    found = false;
    int lowest = 0;
    int highest = newNumbers.length - 1;
    found = false;
    position = 0;
    
    while(lowest <= highest){
      int middle = (highest+lowest)/2;
      if(search == newNumbers[middle]){
        position = middle + 1;
        found = true;
        break;
      }else if(search < newNumbers[middle]){
        highest = middle - 1;
      }else{
        lowest = middle + 1;
      }
    }
    if(found){
      System.out.println(search + " was found and is on position "+position+".");
    }else{
      System.out.println(search + " was not found in the array.");
    }
  }
} 