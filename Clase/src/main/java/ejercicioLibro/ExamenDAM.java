package ejercicioLibro;

public class ExamenDAM {

    public static void main(String[] args) {

        ExamenDAM ejercicioUno = new ExamenDAM();
        ExamenDAM ejercicioDos = new ExamenDAM();
        ExamenDAM ejercicioTres = new ExamenDAM();

        IO.println(ejercicioUno.tandaPenaltis());
        IO.println(ejercicioDos.carreraCoches());

    }

    public String tandaPenaltis(){
        int jugador1 = 0, jugador2 = 0, turno = 0;
        int[] array;

        while(jugador1 < 5 || jugador2 < 5 || jugador1 == jugador2){
            turno++;
            IO.println(turno);
            array = generaGoles();

            jugador1 += array[0];
            jugador2 += array[1];

            IO.println("Marcador 1: " + jugador1 + "\nMarcador 2: " + jugador2);
        }

        return (jugador1 > jugador2)? "El ganador es el jugador 1": "El ganador es el jugador 2";
    }

    public int[] generaGoles(){
        int[] array = new int[2];
        int disparo = 0, portero = 0;

        disparo = (int)Math.floor(Math.random()*(3));
        portero = (int)Math.floor(Math.random()*(3));

        if(disparo != portero) {
            IO.println("Muy bien 1");
            array[0] += 1;
        } else{
            IO.println("Fallaste 1");
        }

        disparo = (int)Math.floor(Math.random()*(3+1));
        portero = (int)Math.floor(Math.random()*(3+1));

        if(disparo != portero) {
            IO.println("Muy bien 2");
            array[1] += 1;
        } else{
            IO.println("Fallaste 2");
        }

        return array;
    }

    public String carreraCoches(){
        int c1 = 0, gas1 = 70, c2 = 0, gas2 = 70, km = 0;

        while(c1 < 150 && c2 < 150){
            km = (int) Math.floor(Math.random()*(40-10+1)+10);
            if(gas1 < 0) {
                gas1 = 70;
            }else{
                c1 += km;
                gas1 -= km;
            }

            km = (int) Math.floor(Math.random()*(40-10+1)+10);
            if(gas2 < 0) {
                gas2 = 70;
            } else{
                c2 += km;
                gas2 -= km;
            }
        }
        if(c1 == c2) return "Empate";
        return (c1 > c2)? "El ganador es el coche 1": "El ganador es el coche 2";
    }

}
