// package frc.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;
// import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
// import frc.robot.Constants;
// import edu.wpi.first.wpilibj.DoubleSolenoid;
// import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import frc.robot.Robot;
// import frc.robot.RobotContainer;


// public class Boomerangs extends SubsystemBase {
//     private WPI_VictorSPX motorIntake;

//     public Boomerangs() {
//         motorIntake = new WPI_VictorSPX(Constants.IntakeMotor);
//         motorIntake.configFactoryDefault();
//         motorIntake.setInverted(false);
//     }

//     public void percentMotor(double input){
//         motorIntake.set(ControlMode.PercentOutput, input);
//     }

//     public void go(Boolean isGo) {
//         if(isGo){
//             percentMotor(0.8);
//         } else {
//             percentMotor(0);
//         }
//     }
// }