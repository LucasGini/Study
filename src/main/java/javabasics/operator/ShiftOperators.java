package javabasics.operator;

/**
 * 位运算符
 * 位运算是直接对二进制进行运算
 * 1、正整数转换成二进制方法：除二取余，然后倒序排列，高位补零（计算机内部表示数的字节单位是定长的，如8位，16位，32位，所以位数不够时，高位补0）。
 * 42/2=21，42%2=0
 * 21/2=10，21%2=1
 * 10/2=5，10%2=0
 * 5/2=2，5%2=1
 * 2/2=1，2%2=0
 * 1/2=0，1%2=1
 * 余数倒序排列为101010，然后高位补0，则42的二进制为00000000 0000000 00000000 00101010，规范写法为(42) 10= (00000000 0000000 00000000 00101010)。
 * 2、负数转换成二进制的方法：先取得正数的二进制，然后再将正数的二进制进行反码，然后加1（正数二进制-->反码-->加1（补码）-->负数二进制）
 * -42的正数二进制：00000000 00000000 00000000 00101010
 * 反码：11111111 11111111 11111111 11010101（0改为1，1改为0）
 * 补码（即加1）：11111111 11111111 11111111 11010110  也就是-42的二进制
 */
public class ShiftOperators {
    public static void main(String[] args) {
        //<< 左移，公式m << n -->m * 2^n
        //空位补0，被移除的高位丢弃，空缺位补0
        System.out.println(3 << 2); //将3转换成二进制 00000011，将二进制左移动两位，即为00001100，再转换成10进制为12
        //>> 右移，公式m << n -->m * 2^-n
        //被移位的二进制最高位是0，右移后，空缺补0；最高位是1，空缺补1
        System.out.println(3 >> 1);//将3转换成二进制 00000011，将二进制右移动一位，即为00000001，再转换成10进制为1，
        System.out.println(-3 >> 1);
        //>> 无符号右移，正数的无符号右移与右移一致
        //被移位二进制最高位无论是0或者是1，空缺都用0补
        System.out.println(3 >>> 1);
        System.out.println(-3 >>> 1);//最高位补0
        //& 与运算
        //只有1&1时结果是1，否则是0
        System.out.println(6 & 3);//6的二进制为00000110，3的二进制为00000011，6&3 二进制同位都为1，则取1，其中有一个为0，则取0，所以为00000010，转换为10进制为2，
        //| 或运算
        //只有0&0时结果是0，否则是1
        System.out.println(12 | 5);//12的二进制为00001100，5的二进制为00000101，12 | 5 二进制同位都为0，则取1，其中有一个为1，则取1，所以为00001101，转换为10进制为13，
        //^ 异或运算
        //相同二进制位进行^运算，结果是0
        //不相同二进制位进行^结果是1
        System.out.println(12 ^ 5);//12的二进制为00001100，5的二进制为00000101，12 ^ 5 二进制同位都为0或者1，则取0，同位不相同，则取1，所以为00001001，转换为10进制为9，
        //~ 反码
        //正数取反，各二进制码按补码各位取反
        //负数取反，各二进制码按补码各位取反
        System.out.println(~12);//12的二进制为00000000 00000000 00000000 00001100
                                //反码为：11111111 11111111 11111111 11110011，反码加1的时候才为-12的二进制，所以反码没有加1直接转换成10进制为-13






    }
}
