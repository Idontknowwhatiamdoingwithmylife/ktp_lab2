public class Point3d {
    // координата X 
    private double xCoord;
    // координата Y 
    private double yCoord;
    // координата Z 
    private double zCoord;
    // Конструктор инициализации 
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // Конструктор инциализации  
    public Point3d () {
        xCoord = 0;
        yCoord = 0;
        zCoord = 0;
    }
    // Возвращение координаты X 
    public double getX () {
        return xCoord;
    }
    // Возвращение координаты Y 
    public double getY () {
        return yCoord;
    }
    // Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }
    // Установка значения координаты X 
    public void setX ( double xCoord) {
        this.xCoord = xCoord;
    }
    // Установка значения координаты Y 
    public void setY ( double yCoord) {
        this.yCoord = yCoord;
    }
    // Установка значения координаты Z 
    public void setZ ( double zCoord) {
        this.yCoord = zCoord;
    }

    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        if (other == this){
            return true;
        }
        if (!(other instanceof Point3d)){
            return false;
        }

        Point3d otherPoint = (Point3d) other;

        return xCoord == otherPoint.getX() && yCoord == otherPoint.getY() && zCoord == otherPoint.getZ();
    }

    public double distanceTo(Point3d other){
        double res = 0;

        res = Math.sqrt(Math.pow(other.getX()- xCoord, 2) + Math.pow(other.getY()- yCoord, 2) + Math.pow(other.getZ()- zCoord, 2));
        res = Math.round(res*100);
        res = res/100;

        return res;
    }
}