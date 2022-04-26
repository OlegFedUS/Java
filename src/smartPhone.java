public class smartPhone extends phone {

    String name;
    String version;
    int date;

    @Override
    public int firstPhone(int year) {
        return super.firstPhone(year);
    }

    @Override
    public String call(String outputNumber) {
        System.out.println("Outgoing call: " + outputNumber);
        return outputNumber;
    }

    @Override
    public  String ring (String inputNumber){
        System.out.println("Incoming call: " + inputNumber);
        return inputNumber;
    }

    public void oc(String name, int version){
        System.out.println("Device OS: " + name + ", OS version: " + version);
    }

}
