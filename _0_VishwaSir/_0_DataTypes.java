package _0_VishwaSir;
// Read for Interview Questions
public class _0_DataTypes {
    public static void main(String[] args) {
        int num = 1200000000; //4 bytes
        short shortNum = 12000; //2 bytes
        byte byteNum = 12; //1 byte
        long longNum = 1200000000; //8 bytes

        /* Decimal */
        float fNum = 123.12345678910f;//4 bytes
        double dNum = 123.12345678910;//8 bytes -> more precise
        // Difference
        System.out.println(fNum);//123.12346 -> 5 digit digit after decimal
        System.out.println(dNum);//123.1234567891 -> 10 digit after decimal

        /* Boolean */
        boolean flag = true;//1 bit
        flag = false;

        /* Character */ //-> Unicode
        char ch = 'Y';//2 bytes
        var name = "Yash";
        /* about var -> Only use in any Method &
                        Dynamically typed
        */
    }
}
