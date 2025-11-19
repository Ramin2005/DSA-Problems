
public class BigNumber {

    private byte[] data;

    public BigNumber(String number) throws Exception {

        for (int i = 0; i < number.length(); i++) {

            char temp = number.charAt(i);

            if (!Character.isDigit(temp)) {
                throw new Exception("Invalid number entered!");
            }

            this.data[i] = (byte) (temp);
        }

    }

    public BigNumber(byte[] data) {

        this.data = data.clone();

    }

    @Override
    public String toString() {
        String out = "";
        
        
        for(byte digit: this.data) out = out + digit;

        return super.toString();
    }

}


public class test{
    public static void main(String[] args) throws Exception {
         BigNumber a = new BigNumber("1234567890");
         System.out.println(a.toString());
    }
}