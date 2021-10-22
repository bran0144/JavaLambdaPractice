public class Main {
  public static void main(String[] args) {
    StoreInventory storeInventory = new StoreInventory();
    storeInventory.printStoreInventory();
    FruitStand fruitStand = new FruitStand();
    fruitStand.printPrices();
    MultithreadApp multithreadApp = new MultithreadApp();
    multithreadApp.startThreads();
  }
}
