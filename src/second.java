public class second {

    private String str;
    private StringBuilder txt;
    private int num;
    private char c;

    public String getStr(String str){
        this.str = str;
        return str;
    }

    public StringBuilder getTxt(StringBuilder txt){
        this.txt = txt;
        return txt;
    }

    public int getNum(int num){
        this.num = num;
        return num;
    }

    public char getC(char c){
        this.c = c;
        return c;
    }

    public void setTxt(String str){
        this.str = str;
        this.txt = txt;
        for (int i = 0; i < txt.length(); i++){
            if (txt.charAt(i) == 'o'){
            }
        }


    }
}
