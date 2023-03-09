// 4 - Write a function displayArrayFromLast(int[] array, int firstIndex, int lastIndex) that displays the integers in an array starting from the last element using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)
class q4 {
    static void displayArrayFromLast_i(int[] array, int firstIndex, int lastIndex) {
      for (int i = lastIndex; i >= firstIndex; i--) {
        System.out.println(array[i]);
      }
    }
    
    static void displayArrayFromLast_r2(int[] array, int firstIndex, int lastIndex) {
      if (firstIndex <= lastIndex) {
        displayArrayFromLast_r2(array, firstIndex + 1, lastIndex);
        System.out.println(array[firstIndex]);
      }
    }
  
    public static void main(String[] args) {
      int[] array = { 1, 2, 3, 4, 5 };
      // displayArrayFromFirst_i(array, 0, 4);
      displayArrayFromLast_r2(array, 0, 4); // 5, 4, 3, 2, 1
  
    }
  }
