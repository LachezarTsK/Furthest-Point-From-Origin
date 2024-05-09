
#include <cmath>
#include <string>
using namespace std;

class Solution {

    static const char LEFT_MOVE = 'L';
    static const char RIGHT_MOVE = 'R';
    static const char OPTIONAL_LEFT_OR_RIGHT_MOVE = '_';

public:
    int furthestDistanceFromOrigin(const string& moves) const {
        int leftMoves = 0;
        int rightMoves = 0;

        for (const auto& move : moves) {
            if (move == LEFT_MOVE) {
                ++leftMoves;
            }
            if (move == RIGHT_MOVE) {
                ++rightMoves;
            }
        }

        int optionalMoves = moves.length() - leftMoves - rightMoves;
        int directionOptionalMoves = (leftMoves > rightMoves) ? -1 : 1;
        int furthestPointFromOrigin = abs(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves));

        return furthestPointFromOrigin;
    }
};
