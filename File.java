
public class File implements Comparable{
    private String name;
    private int amount;

    public File(String name, int amount) {

        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;

    }

    public int compareTo(Object object) {
        File entry = (File) object;

        int result = name.compareTo(entry.name);
        if(result !=0 ) {
            return result;
        }

        result = amount - entry.amount;

        if(result !=0) {
            return (int) result / Math.abs(result);
        }
        return 0;
    }

    public String toString() {
        return"File{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }


}


