
public class Solution {

    private static final char LEFT_MOVE = 'L';
    private static final char RIGHT_MOVE = 'R';
    private static final char OPTIONAL_LEFT_OR_RIGHT_MOVE = '_';

    public int furthestDistanceFromOrigin(String moves) {
        int leftMoves = 0;
        int rightMoves = 0;

        for (char move : moves.toCharArray()) {
            if (move == LEFT_MOVE) {
                ++leftMoves;
            }
            if (move == RIGHT_MOVE) {
                ++rightMoves;
            }
        }

        int optionalMoves = moves.length() - leftMoves - rightMoves;
        int directionOptionalMoves = (leftMoves > rightMoves) ? -1 : 1;
        int furthestPointFromOrigin = Math.abs(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves));

        return furthestPointFromOrigin;
    }
}
