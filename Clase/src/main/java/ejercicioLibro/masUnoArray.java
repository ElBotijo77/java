package ejercicioLibro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class masUnoArray {

    static void main(String[] args){

        int[] arr = {2, 3, 4, 5, 9};


        IO.println(Arrays.toString(UpArrayy(arr)));

    }

    public static int[] UpArrayy(int[] num){
        if(num.length == 0) return num;
        List<Integer> list = new ArrayList<Integer>();

        for(int i= num.length-1; i>=0;i--){
            if(num[i] > 9) return null;

            if(i == num.length-1){
                if(num[i] == 9) {
                    list.add(0);
                }
                else list.add(num[i] + 1);
            }
            else list.add(num[i]);
        }

        int[] solution = new int[list.size()];
        int count = list.size()-1;

        for(int x: list){
            solution[count] = x;
            count--;
        }
        return solution;
    }


    public static int[] UpArray(int[] num){
        int n = 0, count = 0;
        if (num.length == 0) return num;

        for(int i=num.length-1; i>=0; i--){
            if(num[i] > 10 && num[i] < 0) return null;
            n += num[i] * (int)Math.pow(10, count);
            count++;
        }

        IO.println(n);
        n =+ 1;
        String str = String.valueOf(n);
        int[] solution = new int[str.length()];

        for(int i=0; i<solution.length; i++){
            solution[i] = str.charAt(i);
        }

        IO.println(solution.length);
        return solution;
    }

}
