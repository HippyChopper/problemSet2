import javax.swing.*;

public class MyPoint {

  private int xVal;
  private int yVal;


  //No arguement constructer
    public MyPoint(){
       this.xVal = 0;
        this.yVal = 0;
    }

    //2 arguement constructer

    public MyPoint(int xVal,int yVal){

        setxVal(xVal);
        setyVal(yVal);

    }



    //setters

    public void setxVal(int xVal)
    {
        this.xVal = xVal;
    }

    public void setyVal(int yVal)
    {
        this.xVal = yVal;
    }

    //getters

    public int getxVal() {
        String xValString = JOptionPane.showInputDialog("enter the x point:");
        xVal = Integer.parseInt(xValString);
        return xVal;

    }

    public int getyVal() {
        String yValString = JOptionPane.showInputDialog("enter the y point: ");
       yVal = Integer.parseInt(yValString);

        return yVal;
    }

    public int moveHorizontally(int x)
    {
        String moveXAsString = JOptionPane.showInputDialog("Please enter the distance you would like x to move to");
       int xValMoved = Integer.parseInt(moveXAsString);

       xVal = xVal+ xValMoved;

        //String moveYAsString = JOptionPane.showInputDialog("Please enter the distance you would like x to move to");
        //yVal = Integer.parseInt(moveYAsString);

         return xVal;
    }

    public int moveVertically(int y)
    {

        String moveYAsString = JOptionPane.showInputDialog("Please enter the distance you would like y to move to");
         int yValMoved = Integer.parseInt(moveYAsString);


        yVal = yVal+ yValMoved;

        return yVal;
    }

    @Override
    public String toString() {


        return "Point x: " + getxVal() + "\nPoint y: "+ getyVal() + "\nMoved point X "+ moveHorizontally(xVal)+
                "\nMoved Point Y" + moveVertically(yVal);
    }


}
