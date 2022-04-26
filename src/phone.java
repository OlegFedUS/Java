public class phone {

    public int year;
    private String title;

    private void iphone(){
        title = "All rights belongs to Apple(C) 1991.";
        System.out.println(title);
    }

    public int firstPhone(int year) {
        this.year = year;
        System.out.println("This cell phone was made in  " + year);
        iphone();
        return year;
    }

    public String call(String outputNumber) {
        System.out.println("Outgoing call: " + outputNumber);
        return outputNumber;
    }

    public  String ring (String inputNumber){
        System.out.println("Incoming call: " + inputNumber);
      return inputNumber;

    }
}

