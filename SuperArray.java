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
    if (size == data.length){
      resize();
    }
    data[size] = s;
    size+=1;
    return true;
  }

  public String toString() {
    String s = "[";
    for (int i = 0; i < size; i++) {
      if (i == size - 1) {
        s += data[i];
      } else {
        s += data[i] + ",";
      }
    }
    return s + "]";
  }

  public String toStringDebug() {
    String s = "[";
    for (int i = 0; i < data.length; i++) {
      if (i == data.length - 1) {
        s += data[i];
      } else {
        s += data[i] + ",";
      }
    }
    return s + "]";
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    return data[index];
  }

  public String set(int index, String s) {
    if (index < 0 || index >= size()) {
      return null;
    }
    data[index] = s;
    return data[index];
  }

  private void resize() {
    String[] fill = new String[size * 2 + 1];
    for (int i = 0; i < data.length; i++) {
      fill[i] = data[i];
    }
    data = fill;
  }

  public boolean contains(String target) {
    for (int i = 0; i < size; i++) {
      if this[i].equals(target) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i < size; i++) {
      if (this[i].equals(target) {
        return i;
      }
    }
    return null;
  }

  public int lastIndexOf(String target) {
    for (int i = size - 1; i >= 0; i--) {
      if (this[i].equals(target) {
        return i;
      }
    }
    return null;
  }

  public void add(int index, String s) {
    if (index < 0 || index > size()) {
      return null;
    }
    if (size == data.length){
      resize();
    }
    String[] ary = new String[data.length];
    for (int i = 0; i < index; i++) {
      ary[i] = data[i];
    }
    ary[index] = s;
    for (int x = index + 1; x < data.length; x++){
      ary[x] = data[x-1];
    }
    data = ary;
  }
}
