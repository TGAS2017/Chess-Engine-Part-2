package com.com.chess.pgn;

import com.com.chess.engine.classic.board.Board;
import com.com.chess.engine.classic.board.Move;
import com.com.chess.engine.classic.player.Player;

public interface PGNPersistence {

    void persistGame(Game game);

    Move getNextBestMove(Board board, Player player, String gameText);

}
