public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.println("Triplos de Pitágoras:");

        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (isPythagoreanTriple(side1, side2, hypotenuse)) {
                        System.out.println(side1 + "\t" + side2 + "\t" + hypotenuse);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriple(int side1, int side2, int hypotenuse) {
        return (side1 * side1 + side2 * side2) == (hypotenuse * hypotenuse);
    }
}
