package methodoverriding24;
/*
Creating Child class as name of different bank
 */

// Creating child class(1)

import methodoverriding24.Bank;

public class SBI extends Bank {

    public int getRateOfInterest() {
        return 8;
    }
}
