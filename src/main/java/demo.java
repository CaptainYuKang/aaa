import java.math.BigDecimal;

/**
 * @author:liujiazhen
 * @date:2018/12/4 09:16
 * @description:
 **/
public class demo {
    public static void main(String[] args) {
        int length = 7;
        for (int i= 0;i<10000000;i++){
            double random=(Math.random())*(Math.pow(10,length));
            BigDecimal decimal = new BigDecimal(random);
            String result =String.valueOf(decimal.intValue());
            int actualLen =result.length();
            System.out.println("actualLen"+actualLen);
            if(actualLen<length){

                int diff = length -actualLen;
                System.out.println("diff:"+diff);
                System.out.println("Math.pow(10,diff):"+Math.pow(10,diff));
                Integer diffNum =Double.valueOf(Math.pow(10,diff)).intValue();
                String prefix =diffNum.toString().substring(1);
                result = prefix+result;

            }
            /*int result = (int)((Math.random()*9+1)*1000000);*/
            System.out.println(result);
            if(String.valueOf(result).length()<length){
                throw new RuntimeException();
            }
        }
    }
}
