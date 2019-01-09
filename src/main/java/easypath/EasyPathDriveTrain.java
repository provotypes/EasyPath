package easypath;

public interface EasyPathDriveTrain {

    public void setLeftRightDriveSpeed(double left, double right);

    public double getInchesTraveled();

    public double getCurrentAngle();

    public void resetEncodersAndGyro();

}
