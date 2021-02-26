package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.RobotContainer;


public class Shooter extends SubsystemBase {
    //I need to do this to initialize the shooter(subsystem base is the name of a command in the wpi library)

    private WPI_TalonSRX shooterMain;
    private WPI_TalonSRX shooterSide;
    private Servo shooterAngle;
    //init all the motors

    public Shooter() {
        shooterMain = new WPI_TalonSRX(Constants.ShooterMotor1);
        shooterSide = new WPI_TalonSRX(Constants.ShooterMotor2);
        //setting values to shooter motors
        shooterMain.setInverted(true);
        //since they are side by side one needs to go the other way
        shooterAngle = new Servo(Constants.ShooterServo);
        //the thing that changes the angle
    }

    public void percentShooterAngle(double input){
        shooterMain.set(ControlMode.PercentOutput, input);
        shooterSide.set(ControlMode.PercentOutput, input);
        //the speed in which it is going
    }

    private int high;
    private int low;
    //the values of the high and low angles for the targets

    public void servoThing(double angle){
        shooterAngle.setAngle(angle);
        //setting the angle- most of this is pretty self explanatory
        //figure out what the high and low angles are and figure out how to put it in
    }



    
}