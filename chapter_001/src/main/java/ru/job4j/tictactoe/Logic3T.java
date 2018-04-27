package ru.job4j.tictactoe;

/**
 * Class Logic3T
 * @author Dmitry Lebedev
 * @since 26.04.2018
 */

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean wx = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                if (table[i][j - 1].equals(table[i][j])) {
                    wx = true;
                }
            }
        }
        return wx;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {

        return true;
    }
}
