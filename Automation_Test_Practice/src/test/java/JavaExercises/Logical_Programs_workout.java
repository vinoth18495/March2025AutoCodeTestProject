package JavaExercises;

public class Logical_Programs_workout {


    public void usingBuffer(){
        String name = "vinoth";
        StringBuffer buffer = new StringBuffer();
        buffer.append(name);
        buffer.reverse();
        System.out.println(buffer);
    }

    public void OwnLogic(){
        String name = "vinothkumar";
        char[] characterArray = name.toCharArray();
        String Reverse = "";
        for( int i=characterArray.length-1; i>=0;i--){
            String reversed = Reverse + characterArray[i];
            System.out.print(reversed);
        }
    }

    public static void main(String[] args) {

         

    }
}
