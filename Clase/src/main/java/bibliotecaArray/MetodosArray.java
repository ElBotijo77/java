package bibliotecaArray;

public class MetodosArray {

    //PAGINA 167

    //-------------GENERA-------------

    public int[] generaArrayInt(int size){
        return  new int[size];
    }

    //-------------DEVUELVE MAX-------------

    public int devuelveMin(int[] arr){
        int pivot = Integer.MAX_VALUE;
        for(int i: arr){
            if(i<pivot) pivot = i;
        }
        return pivot;
    }

    //-------------DEVUELVE MIN-------------

    public int devuelveMax(int[] arr){
        int pivot = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>pivot) pivot = i;
        }
        return pivot;
    }

    //-------------MEDIA-------------

    public double mediaArr(int[] arr){
        double middle = 0;
        for(int i: arr){
            middle += i;
        }
        middle /= arr.length;
        return middle;
    }

    //-------------CONTIENE-------------

    public boolean exist(int[] arr, int n){
        for(int i: arr){
            if(i==n) return true;
        }
        return false;
    }

    //-------------POSICION-------------

    public int positionElment(int[] arr, int n){
        if(!exist(arr, n)) return -1;

        for(int i: arr){
            if(i==n) return i;
        }
        return 0;
    }

    //-------------INVIERTE-------------

    public int[] invierteArray(int[] arr){
        int[] aux = new int[arr.length];
        int count = 0;
        for(int i=arr.length; i>0; i--){
            aux[count] = arr[i-1];
            count++;
        }
        return aux;
    }

    //-------------ROTA N POSICIONES DERECHA E IZQUIERDA-------------

    public int[] rotaPosicion(int[] arr, int n, boolean derecha){
        int[] aux = new int[arr.length];
        int count = 0;

        //Rota los n numeros hacia la derecha
        if(derecha){
            count = arr.length - n;
            for(int i = 0; i < n; i++){
                aux[count] = arr[i];
                count++;
            }
            count = 0;
            for(int i=n; i<arr.length; i++){
                aux[count] = arr[i];
                count++;
            }
        }
        //Rota los n numeros hacia la izquierda
        else{
            count = arr.length - n;
            for (int i = 0; i < n; i++) {
                aux[i] = arr[count];
                count++;
                IO.println("dsd");
            }
            count = 0;
            for (int i = n; i < arr.length; i++) {
                aux[i] = arr[count];
                count++;
            }
        }
        return aux;
    }
}
