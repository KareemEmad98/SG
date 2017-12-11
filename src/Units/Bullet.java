package Units;

public class Bullet {

    public Bullet() {
        this.penetration = 25;
    }

    private int penetration;

    public int getPenetration() {
        return penetration;
    }

    public void setPenetration(int penetration) {
        this.penetration = penetration;
    }
}
