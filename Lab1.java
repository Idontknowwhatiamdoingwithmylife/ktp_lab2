import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lab1 {
    
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Point3d first, second, third;

            System.out.print("введите 1 значение (x y z)");
            String firstPoint = reader.readLine();
            first = getPointFromInput(firstPoint);
            
            System.out.print("введите 2 значение (x y z)");
            String secondPoint = reader.readLine();
            second = getPointFromInput(secondPoint);

            System.out.print("введите 3 значение (x y z)");
            String thirdPoint = reader.readLine();
            third = getPointFromInput(thirdPoint);


            if(first.equals(second) || second.equals(third) || first.equals(third)) {
                throw new Exception("одно или больше одного значения одинаковы");
            }

            System.out.println(computeArea(first,second,third)); 

        }

        catch (Exception ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }

    public static Point3d getPointFromInput(String input) throws Exception {
        Point3d res = new Point3d();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new Exception("неправильный ввод");
        }
        
        
        double xCoord = Double.parseDouble(parts[0]);
        double yCoord = Double.parseDouble(parts[1]);
        double zCoord = Double.parseDouble(parts[2]);

        res.setX(xCoord);
        res.setY(yCoord);
        res.setZ(zCoord);

        return res;
    }

    public static double computeArea(Point3d first, Point3d second, Point3d third){
        double res = 0;

        double firstSide = first.distanceTo(second);
        double secondSide = second.distanceTo(third);
        double thirdSide = third.distanceTo(first);

        double p = (firstSide+secondSide+thirdSide)/2;

        res = Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
        res = Math.round(res*100);

        return res/100;
    }


}