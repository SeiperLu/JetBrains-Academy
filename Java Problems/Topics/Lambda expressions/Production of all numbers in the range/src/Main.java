import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x,y) -> {
        long result=x;
        if (x==y)
            return result;
        for (long i=x+1; i<=y; i++){
            result = result * i;
        }
        return result;
    };// Write your code here
}