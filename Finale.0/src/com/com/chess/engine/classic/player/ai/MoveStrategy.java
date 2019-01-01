package com.com.chess.engine.classic.player.ai;

import com.com.chess.engine.classic.board.Board;
import com.com.chess.engine.classic.board.Move;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board);

}
