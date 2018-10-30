//so basically
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    clear();
    data = new String[10];
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity < 0) {
      throw new IllegalArgumentException(startingCapacity+" is not a valid size");
    }
    clear();
    data = new String[startingCapacity];
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
      throw new IndexOutOfBoundsException(index+" is not a valid index");
    }
    return data[index];
  }

  public String set(int index, String s) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(index+" is not a valid index");
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
    for (int i = 0; i < this.size; i++) {
      if (this.get(i).equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i < this.size; i++) {
      if (this.get(i).equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = this.size - 1; i >= 0; i--) {
      if (this.get(i).equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String s) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException(index+" is not a valid index");
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
    size+=1;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(index+" is not a valid index");
    }
    String[] ary = new String[data.length];
    for (int i = 0; i < index; i++) {
      ary[i] = data[i];
    }
    String s = data[index];
    for (int x = index; x < data.length-1; x++) {
      ary[x] = data[x+1];
    }
    data = ary;
    size-=1;
    return s;
  }

  public boolean remove(String target) {
    if (this.contains(target)) {
      this.remove(this.indexOf(target));
      return true;
    }
    return false;
  }
}
