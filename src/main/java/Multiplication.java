public class Multiplication {
    int sum;

    public int computeMultipleSum(int number) {
        if (number > 2) {
            int value = 0;
            for (int index = 1; index < number; index++) {
                if (isDivisibleOfThree(index) || isDivisibleOfFive(index) || isDivisibleOfSeven(index)) {
                    value = sumNumbers(index);
                }
            }
            return value;
        } else return -1;
    }


    public int sumNumbers(int value) {
        return sum += value;
    }

    public boolean isDivisibleOfThree(int divisibleThree) {
        return divisibleThree % 3 == 0;
    }

    public boolean isDivisibleOfFive(int divisibleThree) {
        return divisibleThree % 5 == 0;
    }

    public boolean isDivisibleOfSeven(int divisibleThree) {
        return divisibleThree % 7 == 0;
    }
}
