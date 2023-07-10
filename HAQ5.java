/*In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking
out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on
the top and the largest is on the bottom. The puzzle is to move all the disks from peg a to
peg c, moving one disk at a time, so that we never place a larger disk on top of a smaller
one. See Figure 1 for an example of the case n = 4. Write a recursive program using Java
for solving the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub problem
of moving all but the nth disk from peg a to another peg using the third as “temporary
storage.”)*/


public class TowersOfHanoi {
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            // Base case: Move the top disk from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary using destination as temporary storage
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination using source as temporary storage
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numDisks = 4;
        char sourcePeg = 'A';
        char destinationPeg = 'C';
        char auxiliaryPeg = 'B';

        System.out.println("Solution for Towers of Hanoi with " + numDisks + " disks:");
        solveHanoi(numDisks, sourcePeg, destinationPeg, auxiliaryPeg);
    }
}
