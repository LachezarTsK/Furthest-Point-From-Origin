
import kotlin.math.abs

class Solution {

    private companion object {
        const val LEFT_MOVE = 'L'
        const val RIGHT_MOVE = 'R'
        const val OPTIONAL_LEFT_OR_RIGHT_MOVE = '_'
    }

    fun furthestDistanceFromOrigin(moves: String): Int {
        var leftMoves = 0
        var rightMoves = 0

        for (move in moves) {
            if (move == LEFT_MOVE) {
                ++leftMoves
            }
            if (move == RIGHT_MOVE) {
                ++rightMoves
            }
        }

        val optionalMoves = moves.length - leftMoves - rightMoves
        val directionOptionalMoves = if (leftMoves > rightMoves) -1 else 1
        val furthestPointFromOrigin = abs(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves))

        return furthestPointFromOrigin
    }
}
