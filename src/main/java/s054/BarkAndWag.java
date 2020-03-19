package s054;

interface BarkAndWag extends Barker { //interfaccia che estende l'interfaccia barker, aggiungengo un metodo
    int AVG_WAGGING_SPEED = 12;

    int tailWaggingSpeed();
}