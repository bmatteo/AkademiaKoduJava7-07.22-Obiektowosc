package overrideTest;

public class Sport extends Car {

    double acceleration;

    @Override
    public void drive() {
        System.out.println("Jadę szybko!");
    }

    @Override
    public boolean equals(Object o) {
        Sport s = (Sport) o;

        if(this.power == s.power &&
                this.capacity == s.capacity &&
                this.acceleration == s.acceleration) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
