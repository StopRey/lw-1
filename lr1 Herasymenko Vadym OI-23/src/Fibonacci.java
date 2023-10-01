/**
 * class of objects of Fibonacci numbers, they have private parameters number and value
 */
public class Fibonacci {
    private int number;
    private long value;

    public Fibonacci(int number) {
        this.number = number;
        this.value = findValue(number);
    }

    public int getNumber() {
        return number;
    }

    public long getValue() {
        return value;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(long value) {
        this.value = value;
    }

    /**
     * check if a number is prime
     * @return return true of false
     */
    public boolean checkPrime(){
        if(this.getValue()<=1){
            return false;
        }
        else if(this.getValue()<=3){
            return true;
        }
        for (int i=4; i<this.getValue(); i++){
            if (this.getValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @param number the order number of the number in the Fibonacci numbers
     * @return returns the value of a number
     */
    public long findValue(int number){
        if(number<=2){
            return 1;
        }
        long num1=1;
        long num2=1;
        long temp;
        for (int i=3;i<=number;i++){
            num2=num1+num2;
            temp=num1;
            num1=num2;
            num2=temp;
        }
        return num1;
    }
}
