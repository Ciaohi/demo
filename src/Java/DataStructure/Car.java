package Java.DataStructure;

import java.io.Serializable;

/**
 * Created by ciaohi on 2019/10/22 9:07
 */
public class Car  implements Serializable {
    private static final long serialVersionUID =
            -5713945027627603702L;
    private String brand; // 品牌
    private int maxSpeed; // 最高时速
    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
            Person p2 = MyUtil.clone(p1); // 深度克隆
            p2.getCar().setBrand("BYD");
            System.out.println(p1);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
