package com.company;

public class Point
{
    private int xCoordinate, yCoordinate;

    public Point(int xCoordinate, int yCoordinate)
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString()
    {
        return "Point (" + xCoordinate + ", " + yCoordinate + ')';
    }

    public boolean isOnX()
    {
        if (xCoordinate == 0)
            return true;
        else
            return false;
    }

    public boolean sameCoordinates(Point point2)
    {
        if ((xCoordinate == point2.getxCoordinate()) && (yCoordinate == point2.getyCoordinate()))
        {
            return true;
        }
        else
            return false;
    }

    public double distance(Point point2)
    {
        int xCor = Math.abs(xCoordinate - point2.getxCoordinate());
        int yCor = Math.abs(yCoordinate - point2.getyCoordinate());

        return Math.sqrt((xCor * xCor) + (yCor * yCor));
    }

    public boolean inUnitCircle()
    {
        if (Math.sqrt((xCoordinate * xCoordinate) + (yCoordinate * yCoordinate)) > 1)
            return false;
        else
            return true;
    }

    public String midOfTwo(Point point2)
    {
        double xCor = (xCoordinate - point2.getxCoordinate()) / 2;
        double yCor = (yCoordinate - point2.getyCoordinate()) / 2;
        boolean xInt = false, yInt = false;
        int xCorInt = 0, yCorInt = 0;

        if ((xCoordinate - point2.getxCoordinate()) % 2 == 0)
        {
            xCorInt = (int) xCor;
            xInt = true;
        }
        if ((yCoordinate - point2.getyCoordinate()) % 2 == 0)
        {
            yCorInt = (int) yCor;
            yInt = true;
        }
        if (xInt && yInt)
            return "(" + xCorInt + ", " + yCorInt + ")";
        if (xInt && !yInt)
            return "(" + xCorInt + ", " + yCor + ")";
        if (!xInt && yInt)
            return "(" + xCor + ", " + yCorInt + ")";
        else
            return "(" + xCor + ", " + yCor + ")";
    }

    public int getxCoordinate()
    {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate)
    {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate()
    {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate)
    {
        this.yCoordinate = yCoordinate;
    }
}
