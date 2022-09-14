package it.euris.ires.junittesting.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testFuelTankAfterDriving() {
        //TODO verificare che il serbatoio abbia il corretto numero di litri dopo aver guidato per N KM
    }

    @Test
    void testKilometersDrivenAfterDriving(){
        //TODO verificare che i km percorsi siano corretti
    }

    @Test
    void testEmptyWithoutEnoughFuel(){
        //TODO verificare che il serbatoio sia vuoto se si guida per una distanza superiore alla capacità dell'auto
    }

    @Test
    void testDistanceWithoutEnoughFuel(){
        //TODO verificare che l'auto abbia percorso il massimo dei km possibili fino all'esaurimento del serbatoio
    }

    @Test
    void cannotPutTooMuchFuel(){
        //TODO verificare che non sia possibile aggiungere più carburante della capacità del serbatoio
    }
}