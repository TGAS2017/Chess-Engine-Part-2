package com.com.chess.engine.tests.com.chess.tests;

import com.com.chess.engine.classic.Alliance;
import com.com.chess.engine.classic.board.Board;
import com.com.chess.engine.classic.pieces.King;
import com.com.chess.engine.classic.pieces.Pawn;
import org.junit.Test;

public class TestKingSafety {

    @Test
    public void test1() {
        final Board.Builder builder = new Board.Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 4, false, false));
        builder.setPiece(new Pawn(Alliance.BLACK, 12));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new King(Alliance.WHITE, 60, false, false));
        builder.setMoveMaker(Alliance.WHITE);
        // Set the current player
        final Board board = builder.build();

        //assertEquals(KingSafetyAnalyzer.get().calculateKingTropism(board.whitePlayer()).tropismScore(), 40);
    }

}