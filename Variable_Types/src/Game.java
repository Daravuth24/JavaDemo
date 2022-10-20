abstract class Game {
    abstract void play();
}

class Football extends Game {
    void play() {
        System.out.println("Playing Football");
    }
}
class Hockey extends Game{
    void play() { System.out.println("Playing Hockey"); }
}

class TableTennis extends Game {
    void play() { System.out.println("Playing Table Tennis"); }
}

interface play {
    public void Stadium();
}

class Factory implements play {
    public void Stadium() {
        System.out.println("Allianz");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Factory myFactory = new Factory();
        Football myFootball = new Football();
        Hockey myHockey = new Hockey();
        TableTennis myTableTennis = new TableTennis();
        myFactory.Stadium();
        myTableTennis.play();
        myFootball.play();
        myHockey.play();
    }
}