abstract class Piece {
    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    abstract boolean isValidMove(int startX, int startY, int endX, int endY);

    public String getColor() {
        return color;
    }
}

class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        return Math.abs(endX - startX) <= 1 && Math.abs(endY - startY) <= 1;
    }
}

class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        return (startX == endX || startY == endY || Math.abs(endX - startX) == Math.abs(endY - startY));
    }
}

class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        return (startX == endX || startY == endY);
    }
}

class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        return Math.abs(endX - startX) == Math.abs(endY - startY);
    }
}

class Knight extends Piece {
    public Knight(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}

class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY) {
        if (color.equals("white")) {
            return (startX == endX && endY - startY == 1);
        } else {
            return (startX == endX && startY - endY == 1);
        }
    }
}