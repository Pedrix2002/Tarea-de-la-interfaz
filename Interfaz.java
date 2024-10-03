// Definición de la interfaz Vehiculo
public interface Vehiculo {
    void acelerar();
    void frenar();
    int getVelocidad();
}

// Implementación de la clase Coche
public class Coche implements Vehiculo {
    private int velocidad;
    private int numeroDePuertas;

    public Coche(int numeroDePuertas) {
        this.velocidad = 0;
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El coche acelera. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El coche frena. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}

// Implementación de la clase Bicicleta
public class Bicicleta implements Vehiculo {
    private int velocidad;
    private int numeroDeMarchas;

    public Bicicleta(int numeroDeMarchas) {
        this.velocidad = 0;
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public void acelerar() {
        velocidad += 5;
        System.out.println("La bicicleta acelera. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
        System.out.println("La bicicleta frena. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
}

// Clase principal para probar las implementaciones
public class Main {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche(4);
        Vehiculo miBicicleta = new Bicicleta(6);

        miCoche.acelerar();
        miBicicleta.acelerar();

        miCoche.frenar();
        miBicicleta.frenar();
    }
}
