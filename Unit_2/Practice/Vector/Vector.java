package Unit_2.Practice.Vector;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    /**
     * @return длину виктора
     */
    public double vectorLength() {
        return StrictMath.sqrt(x * x + y * y + z * z);

    }

    /**
     * @param vector2 с которым происходит взаимеодействие
     * @return
     */
    public double scalarMulti(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 с которым происходит взаимеодействие
     * @return векторное произведение
     */
    public Vector summa(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    /**
     * @param vector2 с которым происходит взаимеодействие
     * @return угол между векторами (или косинус угла)
     */
    public double vecrotCos(Vector vector2) {

        return (this.scalarMulti(vector2) / (this.vectorLength() * vector2.vectorLength()));

    }

    public Vector suma(Vector vector2) {
        new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z);

        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z);
    }

    public Vector difference(Vector vector2) {

        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z);
    }

}
