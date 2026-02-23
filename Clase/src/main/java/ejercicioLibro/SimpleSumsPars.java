package ejercicioLibro;

public class SimpleSumsPars {

    public static void main(String[] args) {

        IO.println(solve(1140));

    }

    public static int solve(long n){
        int n1 = (int)n/2 , n2 = 0, result = 0, solution=0;

        if(n % 2 == 0) n2 = n1;
        else n2 = n1 + 1;

        IO.println(n1);
        IO.println(n2);

        String cadena1 = String.valueOf(n1);
        String cadena2 = String.valueOf(n2);

        for(int i=0; i<cadena1.length(); i++) {
            solution += (cadena1.charAt(i) - 48) + (cadena2.charAt(i) - 48);
        }

        return solution;
    }

    public static int solvee(long n){
        int n1 = (int)n/2 , n2 = 0, result = 0;

        if(n % 2 != 0) n2 = n1 + 1;
        else {
            n1 += -1;
            n2 += n1 + 1;
        }

        String cadena1 = String.valueOf(n1);
        String cadena2 = String.valueOf(n2);

        for(int i=0; i<cadena1.length(); i++) {
            result += (cadena1.charAt(i) - 48) + (cadena2.charAt(i) - 48);
        }
        return result+1;
    }


}
