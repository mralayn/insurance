public class counter {
    private int count;
    private double sum;

    public counter(int count, double sum) {
        this.count = count;
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void plusOne() {
        this.count++;
    }

    public void inc(double delta) {
        this.sum = this.sum + delta;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double average(){return sum/count;}


    //public int getcount(){return count;}
    //public void setcount(int count){this.count = count;}
    //public void plusone(){this.count++;}

}
