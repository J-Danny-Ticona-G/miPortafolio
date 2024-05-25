class Animal {
    void comer() {
        System.out.println("El animal está comiendo");
    }

    void dormir() {
        System.out.println("El animal está durmiendo");
    }
}


class Mamífero extends Animal {
    void amamantar() {
        System.out.println("El mamífero está amamantando a sus crías");
    }
}

class Ave extends Animal {
    void volar() {
        System.out.println("El ave está volando");
    }
}

class Pez extends Animal {
    void nadar() {
        System.out.println("El pez está nadando");
    }
}


class Perro extends Mamífero {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

class Gato extends Mamífero {
    void maullar() {
        System.out.println("El gato está maullando");
    }
}

class Aguila extends Ave {
    void cazar() {
        System.out.println("El águila está cazando");
    }
}

class PezDorado extends Pez {
    void hacerBurbujas() {
        System.out.println("El pez dorado está haciendo burbujas");
    }
}


public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.comer();
        perro.dormir();
        perro.amamantar();
        perro.ladrar();

        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        gato.amamantar();
        gato.maullar();

        Aguila aguila = new Aguila();
        aguila.comer();
        aguila.dormir();
        aguila.volar();
        aguila.cazar();

        PezDorado pezDorado = new PezDorado();
        pezDorado.comer();
        pezDorado.dormir();
        pezDorado.nadar();
        pezDorado.hacerBurbujas();
    }
}
