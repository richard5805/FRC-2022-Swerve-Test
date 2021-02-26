package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.RobotContainer;


public class Tower extends SubsystemBase {
    //I need to do this to initialize the tower system(subsystem base is the name of a command in the wpi library)

    private WPI_TalonSRX motorTower;
    private WPI_TalonSRX motorStorage;
    //init the motors for the tower and storage that feeds into the shooter

    public Tower() {
        motorTower = new WPI_TalonSRX(Constants.TowerMotor);
        motorStorage = new WPI_TalonSRX(Constants.StorageMotor);
        //tower and storage motor values
    }

    public void percentIntakeMotor(double input){
        motorTower.set(ControlMode.PercentOutput, input);
        motorStorage.set(ControlMode.PercentOutput, input);
        //tower and storage speed
    }
}