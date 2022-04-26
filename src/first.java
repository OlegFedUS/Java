public class first {

    int[] arr = new int[0];
    int num;
    String str;

    public int[] getArr(int[] arr){
        this.arr = arr;
        return arr;
    }

    public int getNum(int num){
        this.num = num;
        return num;
    }

    public void MIN(){
        num = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (num > arr[i]){
                num = arr[i];
            }
        }
        System.out.println("Array MIN_VALUE is: " + num);
    }

    public void MAX(){
        num = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (num < arr[i]){
                num = arr[i];
            }
        }
        System.out.println("Array MAX_VALUE is: " + num);
    }

    public void stringSearch(){
        StringBuilder txt = new StringBuilder("Default stringbuild text for practice");
        for (int i = 0; i < txt.length(); i++){
            if (txt.charAt(i) == 'e'){
            }
            System.out.println(txt);
        }
    }

}
