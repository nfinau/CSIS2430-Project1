/**
 * CSIS2430 - Programming Project 1
 * Part 1: Ordinary sets using boolean arrays
 * Part 2: Multisets (bags) using integer counts
 *
 * Team: TBD
 * Members: Naomi, Alejandro, Bryant, Han
 */
public class Main {

    // Universal set (n >= 10)
    static final String[] UNIVERSE = {
            "Apple", "Banana", "Cherry", "Date", "Elderberry",
            "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"
    };

    public static void main(String[] args) {
        System.out.println("=== PART 1: Ordinary Sets ===");

        boolean[] A = {true, false, true, false, true, false, true, false, false, true};
        boolean[] B = {false, true, true, false, false, true, false, true, false, false};

        printSet("A", A);
        printSet("B", B);

        // Part 1:
        printSet("A ∪ B", union(A, B));
        printSet("A ∩ B", intersection(A, B));
        printSet("A - B", difference(A, B));
        printSet("NOT(A)", complement(A));
        printSet("A ⊕ B", symmetricDifference(A, B));

        System.out.println("\n=== PART 2: Multisets (Bags) ===");

        int[] bagA = {2, 0, 1, 0, 3, 0, 1, 0, 0, 2};
        int[] bagB = {1, 1, 0, 2, 1, 0, 0, 3, 0, 1};

        printBag("Bag A", bagA);
        printBag("Bag B", bagB);

        // We'll implement these after Part 1:
        // printBag("A ⊎ B (Union=max)", multisetUnion(bagA, bagB));
        // printBag("A ⊓ B (Intersection=min)", multisetIntersection(bagA, bagB));
        // printBag("A - B (Difference)", multisetDifference(bagA, bagB));
        // printBag("A + B (Sum)", multisetSum(bagA, bagB));
    }

    // ---------- Printing Helpers ----------
    static void printSet(String label, boolean[] set) {
        System.out.println("\n--- " + label + " ---");
        System.out.println("Bit string: " + toBitString(set));
        System.out.println("Elements: " + toElementList(set));
    }

    static String toBitString(boolean[] set) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : set) sb.append(b ? '1' : '0');
        return sb.toString();
    }

    static String toElementList(boolean[] set) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                if (!first) sb.append(", ");
                sb.append(UNIVERSE[i]);
                first = false;
            }
        }
        return first ? "(empty set)" : sb.toString();
    }

    static void printBag(String label, int[] bag) {
        System.out.println("\n" + label + ":");
        System.out.println("Counts: " + toCountString(bag));
        System.out.println("Elements: " + toBagElementList(bag));
    }

    static String toCountString(int[] bag) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < bag.length; i++) {
            sb.append(bag[i]);
            if (i < bag.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static String toBagElementList(int[] bag) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] > 0) {
                if (!first) sb.append(", ");
                sb.append(UNIVERSE[i]).append("(").append(bag[i]).append(")");
                first = false;
            }
        }
        return first ? "(empty bag)" : sb.toString();
    }

    // ---------- Part 1 Operations ----------
    // static boolean[] union(boolean[] A, boolean[] B) { ... }
    static boolean[] union(boolean[] A, boolean[] B) {
    boolean[] result = new boolean[A.length];
    for (int i = 0; i < A.length; i++) {
        result[i] = A[i] || B[i];
    }
    return result;
}
    // static boolean[] intersection(boolean[] A, boolean[] B) { ... } 
    static boolean[] intersection(boolean[] A, boolean[] B) { // Intersection: element must exist in both sets
    boolean[] result = new boolean[A.length];
    for (int i = 0; i < A.length; i++) {
        result[i] = A[i] && B[i];
    }
    return result;
}
    // static boolean[] difference(boolean[] A, boolean[] B) { ... }
    static boolean[] difference(boolean[] A, boolean[] B) {
    boolean[] result = new boolean[A.length];

    for (int i = 0; i < A.length; i++) {
        result[i] = A[i] && !B[i];
    }

    return result;
}
    // static boolean[] complement(boolean[] A) { ... }
    static boolean[] complement(boolean[] A) {
    boolean[] result = new boolean[A.length];

    for (int i = 0; i < A.length; i++) {
        result[i] = !A[i];
    }

    return result;
}
    // static boolean[] symmetricDifference(boolean[] A, boolean[] B) { ... }
    static boolean[] symmetricDifference(boolean[] A, boolean[] B) {
    boolean[] result = new boolean[A.length];

    for (int i = 0; i < A.length; i++) {
        result[i] = A[i] ^ B[i];
    }

    return result;
}

    // ---------- Part 2 Operations (later) ----------
    // static int[] multisetUnion(int[] A, int[] B) { ... }
    // static int[] multisetIntersection(int[] A, int[] B) { ... }
    // static int[] multisetDifference(int[] A, int[] B) { ... }
    // static int[] multisetSum(int[] A, int[] B) { ... }
}
