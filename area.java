class area {
    static double area(int x) {
        return x * x;
    }

    static double area(int x, int y) {
        return x * y;

    }

    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        System.out.println("area of sqare ::" + area(x));
        System.out.println("area of rectangle ::" + area(x, y));

    }
}
