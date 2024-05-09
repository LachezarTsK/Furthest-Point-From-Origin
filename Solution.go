
package main

import (
	"math"
)

const LEFT_MOVE = 'L'
const RIGHT_MOVE = 'R'
const OPTIONAL_LEFT_OR_RIGHT_MOVE = '_'

func furthestDistanceFromOrigin(moves string) int {
	var leftMoves = 0
	var rightMoves = 0

	for _, move := range moves {
		if move == LEFT_MOVE {
			leftMoves++
		}
		if move == RIGHT_MOVE {
			rightMoves++
		}
	}

	optionalMoves := len(moves) - leftMoves - rightMoves
	var directionOptionalMoves int
	if leftMoves > rightMoves {
		directionOptionalMoves = -1
	} else {
		directionOptionalMoves = 1
	}
	furthestPointFromOrigin := int(math.Abs(float64(rightMoves - leftMoves + (directionOptionalMoves * optionalMoves))))

	return furthestPointFromOrigin
}
