package ra;

public class Cat extends Animals implements IAnimals,ICRUD{
    @Override
    public void makeSound() {
        System.out.println("Mèo méo meo mèo meo ...");
    }


    @Override
    public void move() {
        System.out.println("di chuyển 4 chan");
    }

    @Override
    public int[] getAll() {
        return new int[0];
    }

    @Override
    public void save(int number) {

    }

    @Override
    public int findByIndex(int index) {
        return 0;
    }

    @Override
    public void deleteByIndex(int index) {

    }
    public void catMouse(){
        System.out.println("mèo bắt chuột");
    }
}
