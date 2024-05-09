
using System;

public class Solution
{
    private static readonly char LEFT_MOVE = 'L';
    private static readonly char RIGHT_MOVE = 'R';
    private static readonly char OPTIONAL_LEFT_OR_RIGHT_MOVE = '_';
    public int FurthestDistanceFromOrigin(string moves)
    {
        int leftMoves = 0;
        int rightMoves = 0;

        foreach (char move in moves)
        {
            if (move == LEFT_MOVE)
            {
                ++leftMoves;
            }
            if (move == RIGHT_MOVE)
            {
                ++rightMoves;
            }
        }

        int optionalMoves = moves.Length - leftMoves - rightMoves;
        int directionOptionalMoves = (leftMoves > rightMoves) ? -1 : 1;
        int furthestPointFromOrigin = Math.Abs(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves));

        return furthestPointFromOrigin;
    }
}
