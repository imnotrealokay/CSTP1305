// Recursively processing an Array

// 3 - Write a function displayArrayFromFirst(int[] array, int firstIndex, int lastIndex) that displays the integers in an array starting from the first element using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)
class q3 {
    static void displayArrayFromFirst_i(int[] array, int firstIndex, int lastIndex) {
      for (int i = 0; i <= lastIndex; i++) {
        System.out.println(array[i]);
      }
    }
  
    static void displayArrayFromFirst_r1(int[] array, int firstIndex, int lastIndex) {
      if (firstIndex <= lastIndex) {
        System.out.println(array[firstIndex]);
        displayArrayFromFirst_r1(array, firstIndex + 1, lastIndex);
      }
    }
  
    public static void main(String[] args) {
      int[] array = { 1, 2, 3, 4, 5 };
      // displayArrayFromFirst_i(array, 0, 4);
      displayArrayFromFirst_r1(array, 0, 4);
  
    }
  }
