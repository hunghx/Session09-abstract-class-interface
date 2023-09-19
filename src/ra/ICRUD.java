package ra;

public interface ICRUD {

    int[] getAll();
    void save(int number);
    int findByIndex(int index);
    void deleteByIndex(int index);
}
