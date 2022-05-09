public class Variables {
    public static void main(String[] args) {
        boolean MyBoolean = false;
        byte MyByte = 15;
        short MyShort = 64;
        char MyChar = 'a';
        int MyInt = 100;
        float MyFloat = 0.25f;
        long MyLong = 999999999999999999L;
        double MyDouble = 7.895d;
        int[][] MyInt1 = new int[5][3];
        int count = 1;
        /*String[] MyInt1 = new String[5];
        MyInt1[0]="this is the index 0";
        MyInt1[1]="this is the index 1";
        MyInt1[2]="this is the index 2";*/
        for(int i=0; i<MyInt1.length;i++){
            for(int j=0; j<MyInt1[i].length;j++) {
                MyInt1[i][j] = count;
                System.out.print(MyInt1[i][j] + " ");
                count++;
            }
            System.out.println("");

        }

        String MyString = new String("This is a string variable");
        ReturnSth MyAdd = new ReturnSth();
        Solution test = new Solution();


        //System.out.println(MyAdd.Addition((int)MyDouble, MyInt));
        //System.out.println("The number of rows is " + MyInt1.length + " and the number of columns is " + MyInt1[0].length);

        System.out.println(test.solution(10));





    }
}
