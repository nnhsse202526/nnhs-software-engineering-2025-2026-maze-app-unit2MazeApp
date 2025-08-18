public class Square
{
    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    
    private int type;
    private int row;
    private int col;

    /**
     * Constructor for objects of class Square
     * 
     * @param initialRow    the row for this Square in the Maze
     * @param initialCol    the column for this Square in the Maze
     * @param initialType   the type (space, wall, start, exit) for this
     *                          Square in the Maze
     */
    public Square(int initialRow, int initialCol, int initialType)
    {
        this.row = initialRow;
        this.col = initialCol;
        this.type = initialType;
    }

    /**
     * Returns this square's type
     *
     * @return    this square's type
     */
    public int getType()
    {
        return this.type;
    }

    /**
     * Returns this square's row
     *
     * @return    this square's row
     */
    public int getRow()
    {
        return this.row;
    }

    /**
     * Returns this square's column
     *
     * @return    this square's column
     */
    public int getCol()
    {
        return this.col;
    }

    @Override
    public String toString()
    {
        String str = null;

        if(this.getType() == Square.SPACE) {
            str = "_";
        }
        else if(this.getType() == Square.WALL) {
            str = "#";
        }
        else if(this.getType() == Square.START) {
            str = "S";
        }
        else if(this.getType() == Square.EXIT) {
            str = "E";
        }

        return str;
    }

    @Override
    public boolean equals(Object other)
    {
        // self check
        if(this == other)
        {
            return true;
        }

        // null check
        if(other == null)
        {
            return false;
        }

        // type check
        if(this.getClass() != other.getClass())
        {
            return false;
        }

        Square otherSq = (Square)other;

        // field comparision
        return (this.row == otherSq.row) &&
                (this.col == otherSq.col) &&
                (this.type == otherSq.type);
    }
}