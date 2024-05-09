
/**
 * @param {string} moves
 * @return {number}
 */
var furthestDistanceFromOrigin = function (moves) {
    const LEFT_MOVE = 'L';
    const RIGHT_MOVE = 'R';
    const OPTIONAL_LEFT_OR_RIGHT_MOVE = '_';

    let leftMoves = 0;
    let rightMoves = 0;

    for (let move of moves) {
        if (move === LEFT_MOVE) {
            ++leftMoves;
        }
        if (move === RIGHT_MOVE) {
            ++rightMoves;
        }
    }

    let optionalMoves = moves.length - leftMoves - rightMoves;
    let directionOptionalMoves = (leftMoves > rightMoves) ? -1 : 1;
    let furthestPointFromOrigin = Math.abs(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves));

    return furthestPointFromOrigin;
};
