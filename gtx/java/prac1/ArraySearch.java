// Overloading a function
/* return types can be same or different
   modifiers must be same
   name must be same
   parameters must be different */

public class ArraySearch{
    public static void main(String[] args){
    }
    public static boolean Search(int target, int[] array){
        boolean result = false;
        for (int element : array){
            if (element == target){
                result = true;
                break;
            }
        }
        return result;
    }
    public static boolean Search(String target, String[] array){
        boolean result = false;
        for (String element : array){
            if ((element != null) && (element.equals(target))){
                result = true;
                break;
            }
        }
        return result;
    }
}