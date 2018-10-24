//so basically
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    clear();
    data = new String[10];
  }

  public SuperArray(int big) {
    clear();
    data = new String[big];
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String s) {
    data[size] = s;
    size+=1;
    return true;
  }

  public String toString() {

  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    } else {
      return ""+data[index];
    }
  }

  public String set(int index) {
    if (index < 0 || index >= size()) {
      return null
    }
  }

  private void resize() {

  }
}