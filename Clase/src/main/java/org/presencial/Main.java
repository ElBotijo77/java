package org.presencial;
import org.presencial.Persona;

import bibliotecaArray.MetodosArray;

import java.util.Arrays;

import static org.presencial.Persona.escribeDatos;

public class Main {

    static void main() {

        //-----------CLASE COCHE------------------

        Coche fr = new Coche("8006FRC", "Seat", 183, "Rojo", "FR");
        Coche doscientos6 = new Coche("9666DCK", "", 0, "", "");

        fr.setFrenar(233);

        IO.println("\n" + fr.toString());
        IO.println(doscientos6.toString());


        Persona p = new Persona("ew322323", "Abe", "Montoras", 34);

        //Persona p2 = new Persona(escribeDatos(), escribeDatos(), escribeDatos(), (int)escribeDatos());























        System.out.println();

        MetodosArray m = new MetodosArray();

        int[] arr = {1,2,13,4,5,236,7,82,9,1210};

        IO.println("Salida correcta:");

        IO.println(Arrays.toString(m.rotaPosicion(arr, 5,false)));

        IO.println("FIN");


        Main ejemplo = new Main();

        int n[] = {3,7,2,7};
        int target = 9;
        int solution[] = ejemplo.twoSum(n, target);

        //IO.println(Arrays.toString(solution));

    }

/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/
    public int[] twoSum(int[] nums, int target) {
        boolean fin = false;
        int [] solution = new int [2];

        while(!fin){
            for(int i = 1; i < nums.length; i++){
                if(nums[i-1] + nums[i] == target){
                    solution[0] = i-1;
                    solution[1] = i;
                    fin = true;
                }
            }
            fin = true;
        }
    return solution;
    }
}
