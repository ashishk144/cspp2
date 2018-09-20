class Fitness {
    Data[] food;
    Data[] water;
    Weight[] weights;
    Sleep[] sleep;
    Phyact[] physical;
    int foodsize, watersize, weightsize;
    int sleepsize, physicalsize;
    public Fitness() {
        food = new Data[5];
        water = new Data[5];
        weights = new Weight[5];
        sleep = new Sleep[5];
        physical = new Phyact[5];
        foodsize = 0; watersize = 0; weightsize = 0;
        sleepsize = 0; physicalsize = 0;
    }
    public void addFood(Data item) {
        food[foodsize++] = item;
    }
    public void addWater(Data it) {
        water[watersize++] = it;
    }
    public void addWeight(Weight w) {
        weights[weightsize++] = w;
    }
    public void addSleep(Sleep s) {
        sleep[sleepsize++] = s;
    }
    public void addPhysical(Phyact p) {
        physical[physicalsize++] = p;
    }
    public void foodlog() {
        for(int i = 0; i < foodsize; i++) {
            System.out.println(food[i].toString());
        }
    }
    public void waterlog() {
        for(int i = 0; i < watersize; i++) {
            System.out.println(water[i].toString());
        }
    }
    public void weightlog() {
        for(int i = 0; i < weightsize; i++) {
            System.out.println(weights[i].toString());
        }
    }
    public void sleeplog() {
        for(int i = 0; i < sleepsize; i++) {
            System.out.println(sleep[i].toString());
        }
    }
    public void physicallog() {
        for(int i = 0; i < physicalsize; i++) {
            System.out.println(physical[i].toString());
        }
    }
    public void summary() {
        foodlog();
        waterlog();
        weightlog();
        sleeplog();
        physicallog();
    }
}