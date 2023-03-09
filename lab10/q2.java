// 2 - Write a function sumOf(int n) that returns the sum 1 + 2 + .... + n using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)
class q2 {
    static int sumOf_i(int input) {
      int sum = 0;
      for (int i = 1; i <= input; i++) {
        sum += i;
      }
      return sum;
    }
  
    static int sumOf_r(int input) {
        if (input > 0)
          return input + sumOf_r(input - 1);
        else
          return 0;
      }
  
    public static void main(String[] args) {
      System.out.println(sumOf_r(10)); // 55
    }
  }
