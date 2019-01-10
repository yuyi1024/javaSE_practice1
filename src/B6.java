
/**
 * 題目編號 Java-B6：在 cmd 輸入參數，並轉成 int 印出
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B6 {
    public static void main(String args[]){

        try {

            String plusNumberString1 = "82748022";
            String plusNumberString2 = "9999999999999999999999593";
            int plusNumberLength1 = plusNumberString1.length();
            int plusNumberLength2 = plusNumberString2.length();

            // 若數字1位數 < 數字2位數，交換
            if(plusNumberLength1 < plusNumberLength2){
                String tempString = plusNumberString1;
                int tempLength = plusNumberLength1;

                plusNumberString1 = plusNumberString2;
                plusNumberLength1 = plusNumberLength2;

                plusNumberString2 = tempString;
                plusNumberLength2 = tempLength;
            }

            StringBuffer resultSum = new StringBuffer();

            // 相加的位置（從個位數開始）
            int digitFlag = 1;

            String digitFlagString = "";
            int digitPlusNumber1;
            int digitPlusNumber2;
            int digitSum;

            // 是否進位 （0 -> 否，1 -> 是）
            int carry = 0;

            // 依 digitFlag 的位數位置，將兩字串的該位數相加
            while (plusNumberLength1 >= digitFlag){
                digitFlagString = plusNumberString1.substring(plusNumberLength1 - digitFlag, plusNumberLength1 - digitFlag + 1);
                digitPlusNumber1 = Integer.parseInt(digitFlagString);

                if(plusNumberLength2 >= digitFlag){
                    digitFlagString = plusNumberString2.substring(plusNumberLength2 - digitFlag, plusNumberLength2 - digitFlag + 1);
                    digitPlusNumber2 = Integer.parseInt(digitFlagString);
                } else {
                    digitPlusNumber2 = 0;
                }

                digitSum = digitPlusNumber1 + digitPlusNumber2 + carry;

                // 判斷是否進位，carry 將在下一次迴圈被加入
                if (digitSum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }

                // 由後往前，將計算出的個位數字 insert 進 StringBuffer
                resultSum.insert(0, digitSum % 10);
                digitFlag++;
            }

            // 最高位數是否進位
            if(carry == 1){
                resultSum.insert(0, 1);
            }

            String resultSumString = resultSum.toString();
            System.out.println(resultSumString);

            // result：10000000000000000082747615

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
