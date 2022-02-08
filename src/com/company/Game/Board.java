package com.company.Game;

import java.util.HashMap;

public class Board {
    private HashMap<Position, Figure> board = new HashMap<>();

    protected enum Figure{
        Pawn_w, Pawn_b,Bishop_w, Bishop_b, Knight_w, Knight_b,
        Rook_b, Rook_w, Queen_w, Queen_b, King_w, King_b
    }
}
