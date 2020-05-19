public class root {
    private static double Root1, Root2;

    // Finds the quadratic root, A must be non-zero
    public boolean findRoots(int A, int B, int C) {
        double D;
        boolean Result;
        D = (double)(B*B) - (double)(4.0*A*C);
        if (D < 0.0)
        {
            Result = false;
            return(Result);
        }
        Root1 = (double) ((-B + Math.sqrt(D)) / (2.0*A));
        Root2 = (double) ((-B - Math.sqrt(D)) / (2.0*A));
        Result = true;
        return(Result);
    } // End method findRoots

    public double getRoot1() {
        return(Root1);
    }

    public double getRoot2() {
        return(Root2);
    }

    public static void main(String[] args){
        root r = new root();
        boolean result = r.findRoots(2, 4, 2);
        System.out.println("Result: "+result);
        System.out.println("Root1: "+r.getRoot1());
        System.out.println("Root2: "+r.getRoot2());
    }
}
