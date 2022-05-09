public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        int MultipleOfThree = 0;
        int MultipleOfFive = 0;
        int[] MyArray = new int[number];
        if(number <= 0) {
            return 0;
        }
            if (number != 0){
                for(int i = 0; sum < number ; i++){
                    MultipleOfThree = i * 3;
                    MultipleOfFive = i * 5;
                    MyArray[i] = MultipleOfFive;
                    sum = sum + MultipleOfFive;
                    for(int j = 0; j < i; j++){
                        if (MyArray[j] == MultipleOfThree){
                            MultipleOfThree = 0;
                        } else if (MyArray[j] != MultipleOfThree) {
                            MultipleOfThree = i * 3;
                        }
                        sum = sum + MultipleOfThree;
                    }
                    }
                }
        return sum;
    }
}
