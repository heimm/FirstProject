package day2.classandobject;


public class TestBox {

    public static void main(String[] args) {

       /* Box ups = new Box();
        Box fedex = new Box();

        ups.length = 5;
        ups.width = 10;
        ups.calculateArea();

        fedex.length = 6;
        fedex.width = 7;
        fedex.calculateArea();*/

        Box ups = new Box();
        Box fedex = new Box();

        ups.length = 5;
        ups.width = 10;
        int area1 = ups.calculateArea();

        fedex.length = 6;
        fedex.width = 7;
        int area2 = fedex.calculateArea();

        System.out.println("Total of ups & fedex = " + (area1 + area2));

    }

}
